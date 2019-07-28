package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DriverConfig extends js.Object {
  var DriverConfig: Anon_Name
  var Labels: StringDictionary[String]
  var NoCopy: Boolean
}

object Anon_DriverConfig {
  @scala.inline
  def apply(DriverConfig: Anon_Name, Labels: StringDictionary[String], NoCopy: Boolean): Anon_DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig, Labels = Labels, NoCopy = NoCopy)
  
    __obj.asInstanceOf[Anon_DriverConfig]
  }
}

