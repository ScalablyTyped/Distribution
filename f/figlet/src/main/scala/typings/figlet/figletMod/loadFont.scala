package typings.figlet.figletMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "loadFont")
@js.native
object loadFont extends js.Object {
  def apply(
    font: Fonts,
    cb: js.Function2[/* error */ Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
  ): Unit = js.native
}

