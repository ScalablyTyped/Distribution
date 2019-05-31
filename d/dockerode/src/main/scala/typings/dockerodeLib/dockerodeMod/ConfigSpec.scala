package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSpec extends js.Object {
  var Data: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var Name: java.lang.String
}

object ConfigSpec {
  @scala.inline
  def apply(
    Data: java.lang.String,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    Name: java.lang.String
  ): ConfigSpec = {
    val __obj = js.Dynamic.literal(Data = Data, Labels = Labels, Name = Name)
  
    __obj.asInstanceOf[ConfigSpec]
  }
}

