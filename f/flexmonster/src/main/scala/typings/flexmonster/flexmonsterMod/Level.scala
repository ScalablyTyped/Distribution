package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var caption: String
  var uniqueName: String
}

object Level {
  @scala.inline
  def apply(caption: String, uniqueName: String): Level = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Level]
  }
}

