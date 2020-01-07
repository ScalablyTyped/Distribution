package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$TableReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Domain extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var groupByEmail: js.UndefOr[String] = js.native
  var iamMember: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var specialGroup: js.UndefOr[String] = js.native
  var userByEmail: js.UndefOr[String] = js.native
  var view: js.UndefOr[Schema$TableReference] = js.native
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: String = null,
    groupByEmail: String = null,
    iamMember: String = null,
    role: String = null,
    specialGroup: String = null,
    userByEmail: String = null,
    view: Schema$TableReference = null
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (groupByEmail != null) __obj.updateDynamic("groupByEmail")(groupByEmail.asInstanceOf[js.Any])
    if (iamMember != null) __obj.updateDynamic("iamMember")(iamMember.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (specialGroup != null) __obj.updateDynamic("specialGroup")(specialGroup.asInstanceOf[js.Any])
    if (userByEmail != null) __obj.updateDynamic("userByEmail")(userByEmail.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Domain]
  }
}

