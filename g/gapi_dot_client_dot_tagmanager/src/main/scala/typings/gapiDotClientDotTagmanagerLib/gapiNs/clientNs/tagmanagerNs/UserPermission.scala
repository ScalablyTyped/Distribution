package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermission extends js.Object {
  /** GTM Account access permissions. */
  var accountAccess: js.UndefOr[AccountAccess] = js.undefined
  /** The Account ID uniquely identifies the GTM Account. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Container access permissions. */
  var containerAccess: js.UndefOr[js.Array[ContainerAccess]] = js.undefined
  /** User's email address. */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /** GTM UserPermission's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

