package typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User specified security marks that are attached to the parent Cloud
  * Security Command Center (Cloud SCC) resource. Security marks are scoped
  * within a Cloud SCC organization -- they can be modified and viewed by all
  * users who have proper permissions on the organization.
  */
@js.native
trait Schema$SecurityMarks extends js.Object {
  /**
    * Mutable user specified security marks belonging to the parent resource.
    * Constraints are as follows:   - Keys and values are treated as case
    * insensitive   - Keys must be between 1 - 256 characters (inclusive)   -
    * Keys must be letters, numbers, underscores, or dashes   - Values have
    * leading and trailing whitespace trimmed, remaining     characters must be
    * between 1 - 4096 characters (inclusive)
    */
  var marks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The relative resource name of the SecurityMarks. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Examples: &quot;organizations/123/assets/456/securityMarks&quot;
    * &quot;organizations/123/sources/456/findings/789/securityMarks&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$SecurityMarks {
  @scala.inline
  def apply(marks: StringDictionary[String] = null, name: String = null): Schema$SecurityMarks = {
    val __obj = js.Dynamic.literal()
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityMarks]
  }
}

