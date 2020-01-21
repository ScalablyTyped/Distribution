package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSaved extends js.Object {
  var saved: Double
  var title: String
  var updateSequenceNum: Double
  var updated: Double
}

object AnonSaved {
  @scala.inline
  def apply(saved: Double, title: String, updateSequenceNum: Double, updated: Double): AnonSaved = {
    val __obj = js.Dynamic.literal(saved = saved.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateSequenceNum = updateSequenceNum.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSaved]
  }
}

