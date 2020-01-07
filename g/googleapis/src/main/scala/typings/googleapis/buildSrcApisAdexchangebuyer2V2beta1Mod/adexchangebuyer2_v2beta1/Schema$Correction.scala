package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly Shows any corrections that were applied to this creative.
  */
@js.native
trait Schema$Correction extends js.Object {
  /**
    * The contexts for the correction.
    */
  var contexts: js.UndefOr[js.Array[Schema$ServingContext]] = js.native
  /**
    * Additional details about what was corrected.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of correction that was applied to the creative.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Correction {
  @scala.inline
  def apply(
    contexts: js.Array[Schema$ServingContext] = null,
    details: js.Array[String] = null,
    `type`: String = null
  ): Schema$Correction = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Correction]
  }
}

