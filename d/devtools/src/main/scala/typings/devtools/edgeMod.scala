package typings.devtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgeMod {
  
  object default {
    
    @JSImport("devtools/build/finder/edge", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def darwin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("darwin")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/edge", "default.darwin")
    @js.native
    def darwin_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def darwin_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darwin")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def linux(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("linux")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/edge", "default.linux")
    @js.native
    def linux_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def linux_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linux")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def win32(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")().asInstanceOf[js.Array[String]]
    @JSImport("devtools/build/finder/edge", "default.win32")
    @js.native
    def win32_Fdefault: js.Function0[js.Array[String]] = js.native
    
    @scala.inline
    def win32_Fdefault_=(x: js.Function0[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("win32")(x.asInstanceOf[js.Any])
  }
}
