package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note kind that represents a logical attestation &quot;role&quot; or
  * &quot;authority&quot;. For example, an organization might have one
  * `Authority` for &quot;QA&quot; and one for &quot;build&quot;. This note is
  * intended to act strictly as a grouping mechanism for the attached
  * occurrences (Attestations). This grouping mechanism also provides a
  * security boundary, since IAM ACLs gate the ability for a principle to
  * attach an occurrence to a given note. It also provides a single point of
  * lookup to find all attached attestation occurrences, even if they don&#39;t
  * all live in the same project.
  */
@js.native
trait Schema$Authority extends js.Object {
  /**
    * Hint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[Schema$Hint] = js.native
}

object Schema$Authority {
  @scala.inline
  def apply(hint: Schema$Hint = null): Schema$Authority = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Authority]
  }
}

