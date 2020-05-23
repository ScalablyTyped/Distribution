package typings.dynogels.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEnabled extends js.Object {
  var streamEnabled: Boolean
  var streamViewType: String
}

object StreamEnabled {
  @scala.inline
  def apply(streamEnabled: Boolean, streamViewType: String): StreamEnabled = {
    val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEnabled]
  }
}

