package typings.devtools

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firefoxMod {
  
  object default {
    
    @JSImport("devtools/build/finder/firefox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def darwin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darwin")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.darwin")
    @js.native
    def darwin_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def darwin_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darwin")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def linux(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("linux")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.linux")
    @js.native
    def linux_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def linux_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linux")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def win32(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/firefox", "default.win32")
    @js.native
    def win32_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def win32_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("win32")(x.asInstanceOf[js.Any])
  }
  
  trait Priorities extends StObject {
    
    var regex: RegExp
    
    var weight: Double
  }
  object Priorities {
    
    @scala.inline
    def apply(regex: RegExp, weight: Double): Priorities = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Priorities]
    }
    
    @scala.inline
    implicit class PrioritiesMutableBuilder[Self <: Priorities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
