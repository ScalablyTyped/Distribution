package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLinked extends js.Object {
  /**
    * Indicates whether the channel data identifies a user that is already linked to either a YouTube username or a Google+ account. A user that has one of these links already has a public YouTube identity, which is a prerequisite for several actions, such as uploading videos.
    */
  var isLinked: Boolean = js.native
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: String = js.native
}

object IsLinked {
  @scala.inline
  def apply(isLinked: Boolean, privacyStatus: String): IsLinked = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLinked]
  }
  @scala.inline
  implicit class IsLinkedOps[Self <: IsLinked] (val x: Self) extends AnyVal {
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
    def setIsLinked(value: Boolean): Self = this.set("isLinked", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
  }
  
}

