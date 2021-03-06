package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /** Trusted attributes supplied by the IAM system. */
  var iam: js.UndefOr[String] = js.native
  /** An operator to apply the subject with. */
  var op: js.UndefOr[String] = js.native
  /** Trusted attributes discharged by the service. */
  var svc: js.UndefOr[String] = js.native
  /** Trusted attributes supplied by any service that owns resources and uses the IAM system for access control. */
  var sys: js.UndefOr[String] = js.native
  /** The object of the condition. Exactly one of these must be set. */
  var value: js.UndefOr[String] = js.native
  /** The objects of the condition. This is mutually exclusive with 'value'. */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIam(value: String): Self = this.set("iam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIam: Self = this.set("iam", js.undefined)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setSvc(value: String): Self = this.set("svc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvc: Self = this.set("svc", js.undefined)
    @scala.inline
    def setSys(value: String): Self = this.set("sys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSys: Self = this.set("sys", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

