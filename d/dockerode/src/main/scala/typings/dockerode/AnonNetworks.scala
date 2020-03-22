package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.mod.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworks extends js.Object {
  var Networks: StringDictionary[NetworkInfo]
}

object AnonNetworks {
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): AnonNetworks = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNetworks]
  }
}

