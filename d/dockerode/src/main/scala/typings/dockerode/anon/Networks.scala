package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.mod.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Networks extends js.Object {
  var Networks: StringDictionary[NetworkInfo]
}

object Networks {
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): Networks = {
    val __obj = js.Dynamic.literal(Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networks]
  }
}

