package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSpec extends js.Object {
  var Data: String
  var Labels: StringDictionary[String]
  var Name: String
}

object ConfigSpec {
  @scala.inline
  def apply(Data: String, Labels: StringDictionary[String], Name: String): ConfigSpec = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSpec]
  }
}

