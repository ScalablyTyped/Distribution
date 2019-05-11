package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var data: nodeLib.Buffer
  var messageId: java.lang.String
  var publishTime: protobufjsLib.protobufjsMod.commonNs.ITimestamp
}

object Anon_Attributes {
  @scala.inline
  def apply(
    data: nodeLib.Buffer,
    messageId: java.lang.String,
    publishTime: protobufjsLib.protobufjsMod.commonNs.ITimestamp
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(data = data, messageId = messageId, publishTime = publishTime)
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}

