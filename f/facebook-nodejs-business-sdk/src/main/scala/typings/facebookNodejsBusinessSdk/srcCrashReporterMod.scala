package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCrashReporterMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/crash-reporter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CrashReporter {
    
    /* CompleteClass */
    var _active: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("facebook-nodejs-business-sdk/src/crash-reporter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("facebook-nodejs-business-sdk/src/crash-reporter", "default._instance")
    @js.native
    def _instance: CrashReporter = js.native
    inline def _instance_=(x: CrashReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  }
  
  trait CrashReporter extends StObject {
    
    var _active: Boolean
  }
  object CrashReporter {
    
    inline def apply(_active: Boolean): CrashReporter = {
      val __obj = js.Dynamic.literal(_active = _active.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrashReporter]
    }
    
    extension [Self <: CrashReporter](x: Self) {
      
      inline def set_active(value: Boolean): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    }
  }
}
