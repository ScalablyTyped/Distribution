package typings.figlet.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "loadFontSync")
@js.native
object loadFontSync extends js.Object {
  /**
    * @todo
    * Use 'node' namespace to add following methods only in node environment.
    */
  /**
    * @warn
    * This method works in node environment only.
    * In browser environment, this method does not work.
    */
  def apply(font: Fonts): FontOptions = js.native
}

