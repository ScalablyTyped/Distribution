package typings.figlet.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "metadata")
@js.native
object metadata extends js.Object {
  def apply(
    font: Fonts_,
    cb: js.Function3[
      /* error */ Error | Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
}

