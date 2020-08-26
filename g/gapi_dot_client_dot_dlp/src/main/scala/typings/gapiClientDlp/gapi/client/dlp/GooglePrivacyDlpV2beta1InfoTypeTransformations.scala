package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each info type. Cannot specify more than one
    * for a given info type. [required]
    */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation]] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeTransformations {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeTransformations]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeTransformationsOps[Self <: GooglePrivacyDlpV2beta1InfoTypeTransformations] (val x: Self) extends AnyVal {
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
    def setTransformationsVarargs(value: GooglePrivacyDlpV2beta1InfoTypeTransformation*): Self = this.set("transformations", js.Array(value :_*))
    @scala.inline
    def setTransformations(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
  }
  
}

