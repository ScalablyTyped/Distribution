package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var Data: Anon_DeviceId
  var Name: String
}

object Anon_Data {
  @scala.inline
  def apply(Data: Anon_DeviceId, Name: String): Anon_Data = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

