package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of an image occurrence.
  */
@js.native
trait Schema$GrafeasV1beta1ImageDetails extends js.Object {
  /**
    * Required. Immutable. The child image derived from the base image.
    */
  var derivedImage: js.UndefOr[Schema$Derived] = js.native
}

object Schema$GrafeasV1beta1ImageDetails {
  @scala.inline
  def apply(derivedImage: Schema$Derived = null): Schema$GrafeasV1beta1ImageDetails = {
    val __obj = js.Dynamic.literal()
    if (derivedImage != null) __obj.updateDynamic("derivedImage")(derivedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GrafeasV1beta1ImageDetails]
  }
}

