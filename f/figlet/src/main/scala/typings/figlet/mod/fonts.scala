package typings.figlet.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "fonts")
@js.native
object fonts extends js.Object {
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def apply(cb: js.Function2[/* error */ Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts_]], Unit]): Unit = js.native
}

