package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends js.Object {
  
  var Config: js.UndefOr[StringDictionary[String]] = js.native
  
  var Type: LoggingDriverType = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(Type: LoggingDriverType): LogConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: LoggingDriverType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: StringDictionary[String]): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("Config", js.undefined)
  }
}
