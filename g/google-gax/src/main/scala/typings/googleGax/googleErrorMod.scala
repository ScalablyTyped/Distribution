package typings.googleGax

import typings.googleGax.statusMod.Status
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleErrorMod {
  
  @JSImport("google-gax/build/src/googleError", "GoogleError")
  @js.native
  class GoogleError () extends Error {
    
    var code: js.UndefOr[Status] = js.native
    
    var note: js.UndefOr[String] = js.native
  }
}
