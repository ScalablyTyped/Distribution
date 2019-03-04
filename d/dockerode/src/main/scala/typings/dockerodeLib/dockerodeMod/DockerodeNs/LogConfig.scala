package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  var Config: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Type: LoggingDriverType
}

object LogConfig {
  @scala.inline
  def apply(
    Type: LoggingDriverType,
    Config: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): LogConfig = {
    val __obj = js.Dynamic.literal(Type = Type)
    if (Config != null) __obj.updateDynamic("Config")(Config)
    __obj.asInstanceOf[LogConfig]
  }
}

