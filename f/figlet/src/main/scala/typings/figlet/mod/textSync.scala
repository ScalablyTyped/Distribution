package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("figlet", "textSync")
@js.native
object textSync extends js.Object {
  
  def apply(txt: String): String = js.native
  def apply(txt: String, font: Fonts_): String = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  def apply(txt: String, options: Options): String = js.native
}
