package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesUtilsTypesMod {
  import typings.std.ArrayLike

  type Arrayish = String | ArrayLike[Double]
  type BigNumberish = BigNumber | String | Double | Arrayish
  type BlockTag = String | Double
  type CoerceFunc = js.Function2[/* type */ String, /* value */ js.Any, js.Any]
  type ContractFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type EventType = String | js.Array[String] | Filter
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
  type Networkish = Network | String | Double
  type ProgressCallback = js.Function1[/* percent */ Double, Unit]
}
