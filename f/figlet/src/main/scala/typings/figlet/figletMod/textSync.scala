package typings.figlet.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "textSync")
@js.native
object textSync extends js.Object {
  def apply(txt: String): String = js.native
  def apply(txt: String, font: Fonts): String = js.native
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  def apply(txt: String, options: Options): String = js.native
}

