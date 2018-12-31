package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclEntry extends js.Object {
  /** The time when this access control entry expires in RFC 3339 format, for example 2012-11-15T16:19:00.094Z. */
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#aclEntry. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An optional label to identify this entry. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The whitelisted value for the access control list. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

