package typings.fsDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashPromiseMod {
  type JsonReplacer = JsonReplacerArray | JsonReplacerFunction
  type JsonReplacerArray = js.Array[Double | String]
  type JsonReplacerFunction = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
