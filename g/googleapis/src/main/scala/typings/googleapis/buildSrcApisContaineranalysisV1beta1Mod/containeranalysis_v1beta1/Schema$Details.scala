package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an attestation occurrence.
  */
@js.native
trait Schema$Details extends js.Object {
  /**
    * Required. Attestation for the resource.
    */
  var attestation: js.UndefOr[Schema$Attestation] = js.native
}

object Schema$Details {
  @scala.inline
  def apply(attestation: Schema$Attestation = null): Schema$Details = {
    val __obj = js.Dynamic.literal()
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Details]
  }
}

