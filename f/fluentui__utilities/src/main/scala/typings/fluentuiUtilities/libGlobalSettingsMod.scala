package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGlobalSettingsMod {
  
  @JSImport("@fluentui/utilities/lib/GlobalSettings", "GlobalSettings")
  @js.native
  open class GlobalSettings () extends StObject
  /* static members */
  object GlobalSettings {
    
    @JSImport("@fluentui/utilities/lib/GlobalSettings", "GlobalSettings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getValue[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def getValue[T](key: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def getValue[T](key: String, defaultValue: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def removeChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setValue[T](key: String, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  trait IChangeDescription extends StObject {
    
    var key: String
    
    var oldValue: Any
    
    var value: Any
  }
  object IChangeDescription {
    
    inline def apply(key: String, oldValue: Any, value: Any): IChangeDescription = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChangeDescription]
    }
    
    extension [Self <: IChangeDescription](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IChangeEventCallback extends StObject {
    
    def apply(): Unit = js.native
    def apply(changeDescription: IChangeDescription): Unit = js.native
    
    var __id__ : js.UndefOr[String] = js.native
  }
}
