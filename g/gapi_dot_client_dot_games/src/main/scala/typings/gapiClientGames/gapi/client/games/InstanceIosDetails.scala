package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIosDetails extends js.Object {
  /** Bundle identifier. */
  var bundleIdentifier: js.UndefOr[String] = js.native
  /** iTunes App ID. */
  var itunesAppId: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceIosDetails. */
  var kind: js.UndefOr[String] = js.native
  /** Indicates that this instance is the default for new installations on iPad devices. */
  var preferredForIpad: js.UndefOr[Boolean] = js.native
  /** Indicates that this instance is the default for new installations on iPhone devices. */
  var preferredForIphone: js.UndefOr[Boolean] = js.native
  /** Flag to indicate if this instance supports iPad. */
  var supportIpad: js.UndefOr[Boolean] = js.native
  /** Flag to indicate if this instance supports iPhone. */
  var supportIphone: js.UndefOr[Boolean] = js.native
}

object InstanceIosDetails {
  @scala.inline
  def apply(): InstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIosDetails]
  }
  @scala.inline
  implicit class InstanceIosDetailsOps[Self <: InstanceIosDetails] (val x: Self) extends AnyVal {
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
    def setBundleIdentifier(value: String): Self = this.set("bundleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleIdentifier: Self = this.set("bundleIdentifier", js.undefined)
    @scala.inline
    def setItunesAppId(value: String): Self = this.set("itunesAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesAppId: Self = this.set("itunesAppId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPreferredForIpad(value: Boolean): Self = this.set("preferredForIpad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredForIpad: Self = this.set("preferredForIpad", js.undefined)
    @scala.inline
    def setPreferredForIphone(value: Boolean): Self = this.set("preferredForIphone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredForIphone: Self = this.set("preferredForIphone", js.undefined)
    @scala.inline
    def setSupportIpad(value: Boolean): Self = this.set("supportIpad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportIpad: Self = this.set("supportIpad", js.undefined)
    @scala.inline
    def setSupportIphone(value: Boolean): Self = this.set("supportIphone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportIphone: Self = this.set("supportIphone", js.undefined)
  }
  
}

