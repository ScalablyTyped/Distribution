package typings.errorSubclass

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("error-subclass", JSImport.Default)
  @js.native
  class default () extends Error
  /* static members */
  object default {
    
    @JSImport("error-subclass", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("error-subclass", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type ErrorSubclass = Error
}
