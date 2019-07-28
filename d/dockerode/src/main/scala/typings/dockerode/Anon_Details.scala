package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Details extends js.Object {
  var Details: Anon_ApiVersion
  var Name: String
  var Version: String
}

object Anon_Details {
  @scala.inline
  def apply(Details: Anon_ApiVersion, Name: String, Version: String): Anon_Details = {
    val __obj = js.Dynamic.literal(Details = Details, Name = Name, Version = Version)
  
    __obj.asInstanceOf[Anon_Details]
  }
}

