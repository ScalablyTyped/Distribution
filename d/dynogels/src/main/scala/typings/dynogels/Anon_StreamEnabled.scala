package typings.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StreamEnabled extends js.Object {
  var streamEnabled: Boolean
  var streamViewType: String
}

object Anon_StreamEnabled {
  @scala.inline
  def apply(streamEnabled: Boolean, streamViewType: String): Anon_StreamEnabled = {
    val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_StreamEnabled]
  }
}

