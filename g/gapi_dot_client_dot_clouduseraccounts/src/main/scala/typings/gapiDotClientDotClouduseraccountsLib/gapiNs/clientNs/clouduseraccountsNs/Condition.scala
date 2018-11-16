package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Condition extends js.Object {
  /** Trusted attributes supplied by the IAM system. */
  var iam: js.UndefOr[java.lang.String] = js.undefined
  /** An operator to apply the subject with. */
  var op: js.UndefOr[java.lang.String] = js.undefined
  /** Trusted attributes discharged by the service. */
  var svc: js.UndefOr[java.lang.String] = js.undefined
  /** Trusted attributes supplied by any service that owns resources and uses the IAM system for access control. */
  var sys: js.UndefOr[java.lang.String] = js.undefined
  /** The object of the condition. Exactly one of these must be set. */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /** The objects of the condition. This is mutually exclusive with 'value'. */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

