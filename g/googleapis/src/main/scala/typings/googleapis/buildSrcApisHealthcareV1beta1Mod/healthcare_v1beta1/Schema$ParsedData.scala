package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a HL7v2 message in a structured format.
  */
@js.native
trait Schema$ParsedData extends js.Object {
  var segments: js.UndefOr[js.Array[Schema$Segment]] = js.native
}

object Schema$ParsedData {
  @scala.inline
  def apply(segments: js.Array[Schema$Segment] = null): Schema$ParsedData = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParsedData]
  }
}

