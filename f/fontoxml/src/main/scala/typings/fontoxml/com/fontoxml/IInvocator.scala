package typings.fontoxml.com.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvocator extends js.Object {
  //Allow/disallow auto-save functionality.
  var autosave: js.UndefOr[Boolean] = js.undefined
  //The base URL where the CMS endpoints are exposed.
  var cmsBaseUrl: String
  //The document id's of the documents to load from the CMS.
  var documentIds: js.Array[String]
  //The edit session token to use for accessing the CMS endpoints.
  var editSessionToken: String
  //If set to a positive integer, enable the Heartbeat API to send every x seconds.
  var heartbeat: js.UndefOr[Double] = js.undefined
  //User information.
  var user: js.UndefOr[IUserInfo] = js.undefined
  //Workflow information.
  var workflow: js.UndefOr[IWorkflowInfo] = js.undefined
}

object IInvocator {
  @scala.inline
  def apply(
    cmsBaseUrl: String,
    documentIds: js.Array[String],
    editSessionToken: String,
    autosave: js.UndefOr[Boolean] = js.undefined,
    heartbeat: Int | Double = null,
    user: IUserInfo = null,
    workflow: IWorkflowInfo = null
  ): IInvocator = {
    val __obj = js.Dynamic.literal(cmsBaseUrl = cmsBaseUrl.asInstanceOf[js.Any], documentIds = documentIds.asInstanceOf[js.Any], editSessionToken = editSessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(autosave)) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (workflow != null) __obj.updateDynamic("workflow")(workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocator]
  }
}

