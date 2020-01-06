package typings.figma

import typings.figma.figmaMod._Global_.Action
import typings.figma.figmaStrings.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends Action {
  val `type`: URL
  var url: String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: URL, url: String): Anon_Type = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

