package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontName extends js.Object {
  val family: String
  val style: String
}

object FontName {
  @scala.inline
  def apply(family: String, style: String): FontName = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontName]
  }
}

