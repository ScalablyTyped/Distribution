package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcknowledgedDocs extends js.Object {
  var acknowledgedDocs: js.Array[String]
  var rejectedDocs: js.Array[String]
}

object Anon_AcknowledgedDocs {
  @scala.inline
  def apply(acknowledgedDocs: js.Array[String], rejectedDocs: js.Array[String]): Anon_AcknowledgedDocs = {
    val __obj = js.Dynamic.literal(acknowledgedDocs = acknowledgedDocs.asInstanceOf[js.Any], rejectedDocs = rejectedDocs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AcknowledgedDocs]
  }
}

