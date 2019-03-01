package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceSpec extends js.Object {
  var Name: java.lang.String
}

object ServiceSpec {
  @scala.inline
  def apply(Name: java.lang.String): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ServiceSpec]
  }
}

