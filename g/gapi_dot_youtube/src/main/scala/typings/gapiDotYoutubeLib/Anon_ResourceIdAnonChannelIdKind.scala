package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceIdAnonChannelIdKind extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource associated with the comment.
    */
  var resourceId: Anon_ChannelIdKind
}

object Anon_ResourceIdAnonChannelIdKind {
  @scala.inline
  def apply(resourceId: Anon_ChannelIdKind): Anon_ResourceIdAnonChannelIdKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[Anon_ResourceIdAnonChannelIdKind]
  }
}

