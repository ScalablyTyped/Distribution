package typings.devtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFinderFirefoxMod {
  
  object default {
    
    @JSImport("devtools/build/finder/firefox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def darwin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darwin")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.darwin")
    @js.native
    def darwin_Fdefault: js.Function0[js.Array[String]] = js.native
    
    inline def darwin_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darwin")(x.asInstanceOf[js.Any])
    
    inline def linux(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("linux")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.linux")
    @js.native
    def linux_Fdefault: js.Function0[js.Array[String]] = js.native
    
    inline def linux_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linux")(x.asInstanceOf[js.Any])
    
    inline def win32(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.win32")
    @js.native
    def win32_Fdefault: js.Function0[js.Array[String]] = js.native
    
    inline def win32_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("win32")(x.asInstanceOf[js.Any])
  }
  
  trait Priorities extends StObject {
    
    var regex: js.RegExp
    
    var weight: Double
  }
  object Priorities {
    
    inline def apply(regex: js.RegExp, weight: Double): Priorities = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Priorities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Priorities] (val x: Self) extends AnyVal {
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
