package typings
package figletLib.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var font: Fonts
  var fontPath: java.lang.String
}

object Defaults {
  @scala.inline
  def apply(font: Fonts, fontPath: java.lang.String): Defaults = {
    val __obj = js.Dynamic.literal(font = font, fontPath = fontPath)
  
    __obj.asInstanceOf[Defaults]
  }
}

