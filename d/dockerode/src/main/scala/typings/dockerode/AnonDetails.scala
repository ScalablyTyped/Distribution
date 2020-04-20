package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  var Details: AnonApiVersion
  var Name: String
  var Version: String
}

object AnonDetails {
  @scala.inline
  def apply(Details: AnonApiVersion, Name: String, Version: String): AnonDetails = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}

