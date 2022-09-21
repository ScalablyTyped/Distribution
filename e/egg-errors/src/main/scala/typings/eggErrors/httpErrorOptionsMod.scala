package typings.eggErrors

import typings.eggErrors.httpHeaderMod.HttpHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpErrorOptionsMod {
  
  @JSImport("egg-errors/lib/http/http_error_options", JSImport.Default)
  @js.native
  open class default () extends HttpErrorOptions
  
  @js.native
  trait HttpErrorOptions
    extends typings.eggErrors.errorOptionsMod.default {
    
    var headers: js.UndefOr[HttpHeader] = js.native
    
    var status: Double = js.native
  }
}
