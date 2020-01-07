package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnnotationSource holds the source information of the annotation.
  */
@js.native
trait Schema$AnnotationSource extends js.Object {
  /**
    * Cloud Healthcare API resource.
    */
  var cloudHealthcareSource: js.UndefOr[Schema$CloudHealthcareSource] = js.native
}

object Schema$AnnotationSource {
  @scala.inline
  def apply(cloudHealthcareSource: Schema$CloudHealthcareSource = null): Schema$AnnotationSource = {
    val __obj = js.Dynamic.literal()
    if (cloudHealthcareSource != null) __obj.updateDynamic("cloudHealthcareSource")(cloudHealthcareSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotationSource]
  }
}

