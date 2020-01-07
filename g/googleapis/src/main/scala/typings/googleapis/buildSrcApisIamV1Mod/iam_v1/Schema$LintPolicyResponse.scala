package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of a lint operation. An empty response indicates the operation
  * was able to fully execute and no lint issue was found.
  */
@js.native
trait Schema$LintPolicyResponse extends js.Object {
  /**
    * List of lint results sorted by a composite &lt;severity,
    * binding_ordinal&gt; key, descending order of severity and ascending order
    * of binding_ordinal. There is no certain order among the same keys.  For
    * cross-binding results (only if the input object to lint is instance of
    * google.iam.v1.Policy), there will be a google.iam.admin.v1.LintResult for
    * each of the involved bindings, and the associated debug_message may
    * enumerate the other involved binding ordinal number(s).
    */
  var lintResults: js.UndefOr[js.Array[Schema$LintResult]] = js.native
}

object Schema$LintPolicyResponse {
  @scala.inline
  def apply(lintResults: js.Array[Schema$LintResult] = null): Schema$LintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (lintResults != null) __obj.updateDynamic("lintResults")(lintResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LintPolicyResponse]
  }
}

