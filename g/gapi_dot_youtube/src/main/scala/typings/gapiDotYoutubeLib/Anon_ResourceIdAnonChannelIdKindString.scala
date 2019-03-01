package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceIdAnonChannelIdKindString extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource that the user subscribed to.
    */
  var resourceId: Anon_ChannelIdKindString
}

object Anon_ResourceIdAnonChannelIdKindString {
  @scala.inline
  def apply(resourceId: Anon_ChannelIdKindString): Anon_ResourceIdAnonChannelIdKindString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.asInstanceOf[Anon_ResourceIdAnonChannelIdKindString]
  }
}

