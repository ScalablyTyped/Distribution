package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var authorizationCode: js.UndefOr[String] = js.undefined
  var authorizationTimestamp: js.UndefOr[Timestamp] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var containerVersionId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var enableDebug: js.UndefOr[Boolean] = js.undefined
  var environmentId: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    accountId: String = null,
    authorizationCode: String = null,
    authorizationTimestamp: Timestamp = null,
    containerId: String = null,
    containerVersionId: String = null,
    description: String = null,
    enableDebug: js.UndefOr[Boolean] = js.undefined,
    environmentId: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    `type`: String = null,
    url: String = null,
    workspaceId: String = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (authorizationTimestamp != null) __obj.updateDynamic("authorizationTimestamp")(authorizationTimestamp.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug.get.asInstanceOf[js.Any])
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

