package typings.fontoxml.com.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowInfo extends js.Object {
  var displayName: String
  var id: String
}

object IWorkflowInfo {
  @scala.inline
  def apply(displayName: String, id: String): IWorkflowInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflowInfo]
  }
}

