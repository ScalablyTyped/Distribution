package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigurationStatus communicates the observed state of the Configuration
  * (from the controller).
  */
@js.native
trait Schema$ConfigurationStatus extends js.Object {
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.
    */
  var conditions: js.UndefOr[js.Array[Schema$ConfigurationCondition]] = js.native
  /**
    * LatestCreatedRevisionName is the last revision that was created from this
    * Configuration. It might not be ready yet, for that use
    * LatestReadyRevisionName.
    */
  var latestCreatedRevisionName: js.UndefOr[String] = js.native
  /**
    * LatestReadyRevisionName holds the name of the latest Revision stamped out
    * from this Configuration that has had its &quot;Ready&quot; condition
    * become &quot;True&quot;.
    */
  var latestReadyRevisionName: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Configuration that
    * was last processed by the controller. The observed generation is updated
    * even if the controller failed to process the spec and create the
    * Revision.  Clients polling for completed reconciliation should poll until
    * observedGeneration = metadata.generation, and the Ready condition&#39;s
    * status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
}

object Schema$ConfigurationStatus {
  @scala.inline
  def apply(
    conditions: js.Array[Schema$ConfigurationCondition] = null,
    latestCreatedRevisionName: String = null,
    latestReadyRevisionName: String = null,
    observedGeneration: Int | Double = null
  ): Schema$ConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (latestCreatedRevisionName != null) __obj.updateDynamic("latestCreatedRevisionName")(latestCreatedRevisionName.asInstanceOf[js.Any])
    if (latestReadyRevisionName != null) __obj.updateDynamic("latestReadyRevisionName")(latestReadyRevisionName.asInstanceOf[js.Any])
    if (observedGeneration != null) __obj.updateDynamic("observedGeneration")(observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigurationStatus]
  }
}

