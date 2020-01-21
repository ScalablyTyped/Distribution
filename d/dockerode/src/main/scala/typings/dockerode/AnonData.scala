package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var Data: AnonDeviceId
  var Name: String
}

object AnonData {
  @scala.inline
  def apply(Data: AnonDeviceId, Name: String): AnonData = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

