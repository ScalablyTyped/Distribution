package typings.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSpecificActorInfo extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.native
  /** The name of the actor, suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /** The ID of the actor's Person resource. */
  var id: js.UndefOr[String] = js.native
  /** The image representation of the actor. */
  var image: js.UndefOr[Url] = js.native
  /** An object representation of the individual components of name. */
  var name: js.UndefOr[FamilyName] = js.native
  /** The link to the actor's Google profile. */
  var url: js.UndefOr[String] = js.native
  /** Verification status of actor. */
  var verification: js.UndefOr[AdHocVerified] = js.native
}

object ClientSpecificActorInfo {
  @scala.inline
  def apply(): ClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSpecificActorInfo]
  }
  @scala.inline
  implicit class ClientSpecificActorInfoOps[Self <: ClientSpecificActorInfo] (val x: Self) extends AnyVal {
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
    def setClientSpecificActorInfo(value: YoutubeActorInfo): Self = this.set("clientSpecificActorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSpecificActorInfo: Self = this.set("clientSpecificActorInfo", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: Url): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setName(value: FamilyName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVerification(value: AdHocVerified): Self = this.set("verification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
  
}

