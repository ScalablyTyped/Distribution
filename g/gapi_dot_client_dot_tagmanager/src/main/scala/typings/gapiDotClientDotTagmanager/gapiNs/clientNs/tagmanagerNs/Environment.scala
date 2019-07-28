package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The environment authorization code. */
  var authorizationCode: js.UndefOr[String] = js.undefined
  /** The last update time-stamp for the authorization code. */
  var authorizationTimestamp: js.UndefOr[Timestamp] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** Represents a link to a container version. */
  var containerVersionId: js.UndefOr[String] = js.undefined
  /** The environment description. Can be set or changed only on USER type environments. */
  var description: js.UndefOr[String] = js.undefined
  /** Whether or not to enable debug by default for the environment. */
  var enableDebug: js.UndefOr[Boolean] = js.undefined
  /** GTM Environment ID uniquely identifies the GTM Environment. */
  var environmentId: js.UndefOr[String] = js.undefined
  /** The fingerprint of the GTM environment as computed at storage time. This value is recomputed whenever the environment is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** The environment display name. Can be set or changed only on USER type environments. */
  var name: js.UndefOr[String] = js.undefined
  /** GTM Environment's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** The type of this environment. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Default preview page url for the environment. */
  var url: js.UndefOr[String] = js.undefined
  /** Represents a link to a quick preview of a workspace. */
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

