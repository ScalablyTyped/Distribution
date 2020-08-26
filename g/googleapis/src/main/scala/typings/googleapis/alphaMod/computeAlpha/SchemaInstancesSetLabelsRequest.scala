package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to
    * prevent conflicts. Provide the latest fingerprint value when making a
    * request to add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaInstancesSetLabelsRequest {
  @scala.inline
  def apply(): SchemaInstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetLabelsRequest]
  }
  @scala.inline
  implicit class SchemaInstancesSetLabelsRequestOps[Self <: SchemaInstancesSetLabelsRequest] (val x: Self) extends AnyVal {
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
    def setLabelFingerprint(value: String): Self = this.set("labelFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFingerprint: Self = this.set("labelFingerprint", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}

