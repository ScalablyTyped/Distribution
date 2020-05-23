package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var Data: DeviceId
  var Name: String
}

object Data {
  @scala.inline
  def apply(Data: DeviceId, Name: String): Data = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

