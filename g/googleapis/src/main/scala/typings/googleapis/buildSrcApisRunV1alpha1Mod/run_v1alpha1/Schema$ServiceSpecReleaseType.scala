package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecReleaseType contains the options for slowly releasing revisions.
  * See ServiceSpec for more details.  Not currently supported by Cloud Run.
  */
@js.native
trait Schema$ServiceSpecReleaseType extends js.Object {
  /**
    * The configuration for this service. All revisions from this service must
    * come from a single configuration.
    */
  var configuration: js.UndefOr[Schema$ConfigurationSpec] = js.native
  /**
    * Revisions is an ordered list of 1 or 2 revisions. The first is the
    * current revision, and the second is the candidate revision. If a single
    * revision is provided, traffic will be pinned at that revision.
    * &quot;@latest&quot; is a shortcut for usage that refers to the latest
    * created revision by the configuration.
    */
  var revisions: js.UndefOr[js.Array[String]] = js.native
  /**
    * RolloutPercent is the percent of traffic that should be sent to the
    * candidate revision, i.e. the 2nd revision in the revisions list. Valid
    * values are between 0 and 99 inclusive.
    */
  var rolloutPercent: js.UndefOr[Double] = js.native
}

object Schema$ServiceSpecReleaseType {
  @scala.inline
  def apply(
    configuration: Schema$ConfigurationSpec = null,
    revisions: js.Array[String] = null,
    rolloutPercent: Int | Double = null
  ): Schema$ServiceSpecReleaseType = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (revisions != null) __obj.updateDynamic("revisions")(revisions.asInstanceOf[js.Any])
    if (rolloutPercent != null) __obj.updateDynamic("rolloutPercent")(rolloutPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceSpecReleaseType]
  }
}

