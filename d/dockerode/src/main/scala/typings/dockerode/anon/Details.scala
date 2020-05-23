package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var Details: ApiVersion
  var Name: String
  var Version: String
}

object Details {
  @scala.inline
  def apply(Details: ApiVersion, Name: String, Version: String): Details = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

