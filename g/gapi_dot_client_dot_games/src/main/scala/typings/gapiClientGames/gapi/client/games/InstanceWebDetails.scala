package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceWebDetails extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceWebDetails. */
  var kind: js.UndefOr[String] = js.native
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[String] = js.native
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.native
}

object InstanceWebDetails {
  @scala.inline
  def apply(): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWebDetails]
  }
  @scala.inline
  implicit class InstanceWebDetailsOps[Self <: InstanceWebDetails] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLaunchUrl(value: String): Self = this.set("launchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchUrl: Self = this.set("launchUrl", js.undefined)
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

