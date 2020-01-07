package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

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
trait Schema$Enterprise extends js.Object {
  /**
    * Admins of the enterprise. This is only supported for enterprises created
    * via the EMM-initiated flow.
    */
  var administrator: js.UndefOr[js.Array[Schema$Administrator]] = js.native
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

object Schema$Enterprise {
  @scala.inline
  def apply(
    administrator: js.Array[Schema$Administrator] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    primaryDomain: String = null
  ): Schema$Enterprise = {
    val __obj = js.Dynamic.literal()
    if (administrator != null) __obj.updateDynamic("administrator")(administrator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (primaryDomain != null) __obj.updateDynamic("primaryDomain")(primaryDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Enterprise]
  }
}

