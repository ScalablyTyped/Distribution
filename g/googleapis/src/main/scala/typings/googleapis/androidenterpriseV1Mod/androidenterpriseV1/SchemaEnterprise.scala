package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Enterprises resource represents the binding between an EMM and a
  * specific organization. That binding can be instantiated in one of two
  * different ways using this API as follows:  - For Google managed domain
  * customers, the process involves using Enterprises.enroll and
  * Enterprises.setAccount (in conjunction with artifacts obtained from the
  * Admin console and the Google API Console) and submitted to the EMM through
  * a more-or-less manual process.  - For managed Google Play Accounts
  * customers, the process involves using Enterprises.generateSignupUrl and
  * Enterprises.completeSignup in conjunction with the managed Google Play
  * sign-up UI (Google-provided mechanism) to create the binding without manual
  * steps. As an EMM, you can support either or both approaches in your EMM
  * console. See Create an Enterprise for details.
  */
@js.native
trait SchemaEnterprise extends js.Object {
  /**
    * Admins of the enterprise. This is only supported for enterprises created
    * via the EMM-initiated flow.
    */
  var administrator: js.UndefOr[js.Array[SchemaAdministrator]] = js.native
  /**
    * The unique ID for the enterprise.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterprise&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the enterprise, for example, &quot;Example, Inc&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The enterprise&#39;s primary domain, such as &quot;example.com&quot;.
    */
  var primaryDomain: js.UndefOr[String] = js.native
}

object SchemaEnterprise {
  @scala.inline
  def apply(): SchemaEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnterprise]
  }
  @scala.inline
  implicit class SchemaEnterpriseOps[Self <: SchemaEnterprise] (val x: Self) extends AnyVal {
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
    def setAdministratorVarargs(value: SchemaAdministrator*): Self = this.set("administrator", js.Array(value :_*))
    @scala.inline
    def setAdministrator(value: js.Array[SchemaAdministrator]): Self = this.set("administrator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrator: Self = this.set("administrator", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrimaryDomain(value: String): Self = this.set("primaryDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryDomain: Self = this.set("primaryDomain", js.undefined)
  }
  
}

