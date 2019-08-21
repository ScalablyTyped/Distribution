package typings.figma

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
    val __obj = js.Dynamic.literal(family = family, style = style)
  
    __obj.asInstanceOf[FontName]
  }
}

