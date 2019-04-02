package typings
package facepaintLib.facepaintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object facepaintNs {
  type Arg = BaseArg | js.Array[BaseArg]
  type BaseArg = js.Object | js.Array[js.Object]
  type DynamicStyleFunction = js.Function1[/* repeated */ Arg, DynamicStyle]
  type Selector = java.lang.String
}
