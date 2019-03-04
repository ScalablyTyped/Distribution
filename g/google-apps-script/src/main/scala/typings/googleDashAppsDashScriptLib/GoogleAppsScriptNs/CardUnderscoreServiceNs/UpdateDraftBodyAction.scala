package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDraftBodyAction extends js.Object {
  def addUpdateContent(content: java.lang.String, contentType: ContentType): UpdateDraftBodyAction
  def setUpdateType(updateType: UpdateDraftBodyType): UpdateDraftBodyAction
}

object UpdateDraftBodyAction {
  @scala.inline
  def apply(
    addUpdateContent: js.Function2[java.lang.String, ContentType, UpdateDraftBodyAction],
    setUpdateType: js.Function1[UpdateDraftBodyType, UpdateDraftBodyAction]
  ): UpdateDraftBodyAction = {
    val __obj = js.Dynamic.literal(addUpdateContent = addUpdateContent, setUpdateType = setUpdateType)
  
    __obj.asInstanceOf[UpdateDraftBodyAction]
  }
}

