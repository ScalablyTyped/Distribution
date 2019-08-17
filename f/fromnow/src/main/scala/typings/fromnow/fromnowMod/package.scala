package typings.fromnow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fromnowMod {
  import typings.std.Date

  type FromNowStatic = js.Function2[/* date */ String | Date, /* opts */ js.UndefOr[FromNowOpts], String]
}
