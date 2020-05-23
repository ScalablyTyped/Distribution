package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriverConfig extends js.Object {
  var DriverConfig: Name
  var Labels: StringDictionary[String]
  var NoCopy: Boolean
}

object DriverConfig {
  @scala.inline
  def apply(DriverConfig: Name, Labels: StringDictionary[String], NoCopy: Boolean): DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], NoCopy = NoCopy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverConfig]
  }
}

