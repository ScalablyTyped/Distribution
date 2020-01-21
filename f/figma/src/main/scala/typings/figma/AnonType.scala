package typings.figma

import typings.figma.figmaStrings.URL
import typings.figma.mod._Global_.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends Action {
  val `type`: URL
  var url: String
}

object AnonType {
  @scala.inline
  def apply(`type`: URL, url: String): AnonType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

