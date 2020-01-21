package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDriverConfig extends js.Object {
  var DriverConfig: AnonName
  var Labels: StringDictionary[String]
  var NoCopy: Boolean
}

object AnonDriverConfig {
  @scala.inline
  def apply(DriverConfig: AnonName, Labels: StringDictionary[String], NoCopy: Boolean): AnonDriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], NoCopy = NoCopy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDriverConfig]
  }
}

