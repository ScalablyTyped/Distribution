package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsLinked extends js.Object {
  /**
    * Indicates whether the channel data identifies a user that is already linked to either a YouTube username or a Google+ account. A user that has one of these links already has a public YouTube identity, which is a prerequisite for several actions, such as uploading videos.
    */
  var isLinked: Boolean
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: String
}

object Anon_IsLinked {
  @scala.inline
  def apply(isLinked: Boolean, privacyStatus: String): Anon_IsLinked = {
    val __obj = js.Dynamic.literal(isLinked = isLinked.asInstanceOf[js.Any], privacyStatus = privacyStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsLinked]
  }
}

