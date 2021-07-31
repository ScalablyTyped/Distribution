package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log_ extends StObject {
  
  def info(args: js.Any*): Unit
  
  def warn(args: js.Any*): Unit
}
object Log_ {
  
  @scala.inline
  def apply(info: /* repeated */ js.Any => Unit, warn: /* repeated */ js.Any => Unit): Log_ = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Log_]
  }
  
  @scala.inline
  implicit class Log_MutableBuilder[Self <: Log_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
