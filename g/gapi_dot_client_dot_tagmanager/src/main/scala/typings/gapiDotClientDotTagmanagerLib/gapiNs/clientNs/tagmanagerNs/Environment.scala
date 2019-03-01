package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The environment authorization code. */
  var authorizationCode: js.UndefOr[java.lang.String] = js.undefined
  /** The last update time-stamp for the authorization code. */
  var authorizationTimestamp: js.UndefOr[Timestamp] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** Represents a link to a container version. */
  var containerVersionId: js.UndefOr[java.lang.String] = js.undefined
  /** The environment description. Can be set or changed only on USER type environments. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not to enable debug by default for the environment. */
  var enableDebug: js.UndefOr[scala.Boolean] = js.undefined
  /** GTM Environment ID uniquely identifies the GTM Environment. */
  var environmentId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM environment as computed at storage time. This value is recomputed whenever the environment is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** The environment display name. Can be set or changed only on USER type environments. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Environment's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The type of this environment. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Default preview page url for the environment. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Represents a link to a quick preview of a workspace. */
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    authorizationCode: java.lang.String = null,
    authorizationTimestamp: Timestamp = null,
    containerId: java.lang.String = null,
    containerVersionId: java.lang.String = null,
    description: java.lang.String = null,
    enableDebug: js.UndefOr[scala.Boolean] = js.undefined,
    environmentId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null,
    workspaceId: java.lang.String = null
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

