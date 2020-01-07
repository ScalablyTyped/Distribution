package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note kind that represents a logical attestation &quot;role&quot; or
  * &quot;authority&quot;.  For example, an organization might have one
  * `AttestationAuthority` for &quot;QA&quot; and one for &quot;build&quot;.
  * This Note is intended to act strictly as a grouping mechanism for the
  * attached Occurrences (Attestations).  This grouping mechanism also provides
  * a security boundary, since IAM ACLs gate the ability for a principle to
  * attach an Occurrence to a given Note.  It also provides a single point of
  * lookup to find all attached Attestation Occurrences, even if they don&#39;t
  * all live in the same project.
  */
@js.native
trait Schema$AttestationAuthority extends js.Object {
  var hint: js.UndefOr[Schema$AttestationAuthorityHint] = js.native
}

object Schema$AttestationAuthority {
  @scala.inline
  def apply(hint: Schema$AttestationAuthorityHint = null): Schema$AttestationAuthority = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AttestationAuthority]
  }
}

