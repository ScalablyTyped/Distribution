package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
@js.native
trait Schema$CreativeSpecification extends js.Object {
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[Schema$AdSize]] = js.native
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[Schema$AdSize] = js.native
}

object Schema$CreativeSpecification {
  @scala.inline
  def apply(creativeCompanionSizes: js.Array[Schema$AdSize] = null, creativeSize: Schema$AdSize = null): Schema$CreativeSpecification = {
    val __obj = js.Dynamic.literal()
    if (creativeCompanionSizes != null) __obj.updateDynamic("creativeCompanionSizes")(creativeCompanionSizes.asInstanceOf[js.Any])
    if (creativeSize != null) __obj.updateDynamic("creativeSize")(creativeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeSpecification]
  }
}

