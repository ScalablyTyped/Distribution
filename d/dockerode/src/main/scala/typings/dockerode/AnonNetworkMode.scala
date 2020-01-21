package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworkMode extends js.Object {
  var NetworkMode: String
}

object AnonNetworkMode {
  @scala.inline
  def apply(NetworkMode: String): AnonNetworkMode = {
    val __obj = js.Dynamic.literal(NetworkMode = NetworkMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNetworkMode]
  }
}

