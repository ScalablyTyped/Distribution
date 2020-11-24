package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoggerLevel extends js.Object {
  
  var ALL: Double = js.native
  
  var DEBUG: Double = js.native
  
  var ERROR: Double = js.native
  
  var INFO: Double = js.native
  
  var NONE: Double = js.native
  
  var WARN: Double = js.native
}
object ILoggerLevel {
  
  @scala.inline
  def apply(ALL: Double, DEBUG: Double, ERROR: Double, INFO: Double, NONE: Double, WARN: Double): ILoggerLevel = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoggerLevel]
  }
  
  @scala.inline
  implicit class ILoggerLevelOps[Self <: ILoggerLevel] (val x: Self) extends AnyVal {
    
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
    def setALL(value: Double): Self = this.set("ALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
  }
}
