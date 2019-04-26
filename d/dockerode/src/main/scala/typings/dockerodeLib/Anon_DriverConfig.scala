package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DriverConfig extends js.Object {
  var DriverConfig: Anon_Name
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var NoCopy: scala.Boolean
}

object Anon_DriverConfig {
  @scala.inline
  def apply(
    DriverConfig: Anon_Name,
    Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    NoCopy: scala.Boolean
  ): Anon_DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig, Labels = Labels, NoCopy = NoCopy)
  
    __obj.asInstanceOf[Anon_DriverConfig]
  }
}

