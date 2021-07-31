package typings.googleGax

import typings.googleGax.statusMod.Status
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleErrorMod {
  
  @JSImport("google-gax/build/src/googleError", "GoogleError")
  @js.native
  class GoogleError ()
    extends StObject
       with Error {
    
    var code: js.UndefOr[Status] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var note: js.UndefOr[String] = js.native
  }
}
