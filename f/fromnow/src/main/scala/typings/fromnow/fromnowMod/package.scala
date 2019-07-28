package typings.fromnow

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fromnowMod {
  type FromNowStatic = js.Function2[/* date */ String | Date, /* opts */ js.UndefOr[FromNowOpts], String]
}
