package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var Name: String
  var Options: StringDictionary[String]
}

object AnonName {
  @scala.inline
  def apply(Name: String, Options: StringDictionary[String]): AnonName = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

