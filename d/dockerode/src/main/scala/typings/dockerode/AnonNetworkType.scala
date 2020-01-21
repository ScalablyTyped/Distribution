package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.mod.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworkType extends js.Object {
  var Networks: StringDictionary[NetworkInfo]
}

object AnonNetworkType {
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): AnonNetworkType = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNetworkType]
  }
}

