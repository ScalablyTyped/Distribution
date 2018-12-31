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

