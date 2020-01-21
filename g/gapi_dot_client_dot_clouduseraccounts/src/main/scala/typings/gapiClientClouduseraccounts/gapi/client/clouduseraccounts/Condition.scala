package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /** Trusted attributes supplied by the IAM system. */
  var iam: js.UndefOr[String] = js.undefined
  /** An operator to apply the subject with. */
  var op: js.UndefOr[String] = js.undefined
  /** Trusted attributes discharged by the service. */
  var svc: js.UndefOr[String] = js.undefined
  /** Trusted attributes supplied by any service that owns resources and uses the IAM system for access control. */
  var sys: js.UndefOr[String] = js.undefined
  /** The object of the condition. Exactly one of these must be set. */
  var value: js.UndefOr[String] = js.undefined
  /** The objects of the condition. This is mutually exclusive with 'value'. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    iam: String = null,
    op: String = null,
    svc: String = null,
    sys: String = null,
    value: String = null,
    values: js.Array[String] = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (iam != null) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (svc != null) __obj.updateDynamic("svc")(svc.asInstanceOf[js.Any])
    if (sys != null) __obj.updateDynamic("sys")(sys.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

