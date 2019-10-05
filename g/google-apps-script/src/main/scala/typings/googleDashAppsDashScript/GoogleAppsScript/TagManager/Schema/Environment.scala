package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode)
    if (authorizationTimestamp != null) __obj.updateDynamic("authorizationTimestamp")(authorizationTimestamp)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableDebug)) __obj.updateDynamic("enableDebug")(enableDebug)
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Environment]
  }
}

