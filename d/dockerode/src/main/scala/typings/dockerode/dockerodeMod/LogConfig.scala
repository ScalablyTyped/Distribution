package typings.dockerode.dockerodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  var Config: js.UndefOr[StringDictionary[String]] = js.undefined
  var Type: LoggingDriverType
}

object LogConfig {
  @scala.inline
  def apply(Type: LoggingDriverType, Config: StringDictionary[String] = null): LogConfig = {
    val __obj = js.Dynamic.literal(Type = Type)
    if (Config != null) __obj.updateDynamic("Config")(Config)
    __obj.asInstanceOf[LogConfig]
  }
}

