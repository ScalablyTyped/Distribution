package typings.eggErrors

import typings.eggErrors.httpHeaderMod.HttpHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpErrorMod {
  
  @JSImport("egg-errors/lib/http/http_error", JSImport.Default)
  @js.native
  open class default () extends HttpError {
    def this(options: typings.eggErrors.httpErrorOptionsMod.default) = this()
  }
  
  @js.native
  trait HttpError
    extends typings.eggErrors.baseErrorMod.default[typings.eggErrors.httpErrorOptionsMod.default] {
    
    var headers: HttpHeader = js.native
    
    /* protected */ @JSName("options")
    var options_HttpError: typings.eggErrors.httpErrorOptionsMod.default = js.native
    
    var status: Double = js.native
  }
}
