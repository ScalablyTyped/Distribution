package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeRotation extends js.Object {
  /** Creative assignments in this creative rotation. */
  var creativeAssignments: js.UndefOr[js.Array[CreativeAssignment]] = js.native
  /**
    * Creative optimization configuration that is used by this ad. It should refer to one of the existing optimization configurations in the ad's campaign.
    * If it is unset or set to 0, then the campaign's default optimization configuration will be used for this ad.
    */
  var creativeOptimizationConfigurationId: js.UndefOr[String] = js.native
  /** Type of creative rotation. Can be used to specify whether to use sequential or random rotation. */
  var `type`: js.UndefOr[String] = js.native
  /** Strategy for calculating weights. Used with CREATIVE_ROTATION_TYPE_RANDOM. */
  var weightCalculationStrategy: js.UndefOr[String] = js.native
}

object CreativeRotation {
  @scala.inline
  def apply(): CreativeRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeRotation]
  }
  @scala.inline
  implicit class CreativeRotationOps[Self <: CreativeRotation] (val x: Self) extends AnyVal {
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
    def setCreativeAssignmentsVarargs(value: CreativeAssignment*): Self = this.set("creativeAssignments", js.Array(value :_*))
    @scala.inline
    def setCreativeAssignments(value: js.Array[CreativeAssignment]): Self = this.set("creativeAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeAssignments: Self = this.set("creativeAssignments", js.undefined)
    @scala.inline
    def setCreativeOptimizationConfigurationId(value: String): Self = this.set("creativeOptimizationConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeOptimizationConfigurationId: Self = this.set("creativeOptimizationConfigurationId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWeightCalculationStrategy(value: String): Self = this.set("weightCalculationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightCalculationStrategy: Self = this.set("weightCalculationStrategy", js.undefined)
  }
  
}

