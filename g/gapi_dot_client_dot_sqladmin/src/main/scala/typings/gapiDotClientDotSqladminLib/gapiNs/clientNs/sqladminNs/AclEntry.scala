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

object AclEntry {
  @scala.inline
  def apply(
    expirationTime: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    value: java.lang.String = null
  ): AclEntry = {
    val __obj = js.Dynamic.literal()
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AclEntry]
  }
}

