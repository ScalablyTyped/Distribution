package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcknowledgedDocs extends js.Object {
  var acknowledgedDocs: js.Array[String]
  var rejectedDocs: js.Array[String]
}

object AcknowledgedDocs {
  @scala.inline
  def apply(acknowledgedDocs: js.Array[String], rejectedDocs: js.Array[String]): AcknowledgedDocs = {
    val __obj = js.Dynamic.literal(acknowledgedDocs = acknowledgedDocs.asInstanceOf[js.Any], rejectedDocs = rejectedDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgedDocs]
  }
}

