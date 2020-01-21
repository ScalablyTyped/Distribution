package typings.expo.logSerializationMod

import typings.expo.remoteLoggingMod.LogData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedData extends js.Object {
  var body: js.Array[LogData]
  var includesStack: Boolean
}

object SerializedData {
  @scala.inline
  def apply(body: js.Array[LogData], includesStack: Boolean): SerializedData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], includesStack = includesStack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializedData]
  }
}

