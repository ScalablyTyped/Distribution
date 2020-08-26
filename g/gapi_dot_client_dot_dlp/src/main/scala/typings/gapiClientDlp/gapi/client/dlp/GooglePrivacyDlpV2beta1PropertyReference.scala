package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PropertyReference extends js.Object {
  /**
    * The name of the property.
    * If name includes "."s, it may be interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1PropertyReference {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PropertyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PropertyReference]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PropertyReferenceOps[Self <: GooglePrivacyDlpV2beta1PropertyReference] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

