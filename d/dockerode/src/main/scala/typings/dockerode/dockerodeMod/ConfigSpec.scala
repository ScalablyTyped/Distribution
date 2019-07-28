package typings.dockerode.dockerodeMod

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
    val __obj = js.Dynamic.literal(Data = Data, Labels = Labels, Name = Name)
  
    __obj.asInstanceOf[ConfigSpec]
  }
}

