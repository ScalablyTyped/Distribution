package typings.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStreamEnabled extends js.Object {
  var streamEnabled: Boolean
  var streamViewType: String
}

object AnonStreamEnabled {
  @scala.inline
  def apply(streamEnabled: Boolean, streamViewType: String): AnonStreamEnabled = {
    val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStreamEnabled]
  }
}

