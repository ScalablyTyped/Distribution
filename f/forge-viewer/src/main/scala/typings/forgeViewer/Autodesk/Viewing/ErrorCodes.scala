package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCodes extends StObject
@JSGlobal("Autodesk.Viewing.ErrorCodes")
@js.native
object ErrorCodes extends StObject {
  
  @js.native
  sealed trait BAD_DATA
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait BAD_DATA_MODEL_IS_EMPTY
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait BAD_DATA_NO_VIEWABLE_CONTENT
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait BROWSER_WEBGL_DISABLED
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait BROWSER_WEBGL_NOT_SUPPORTED
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait NETWORK_ACCESS_DENIED
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait NETWORK_FAILURE
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait NETWORK_FILE_NOT_FOUND
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait NETWORK_SERVER_ERROR
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait NETWORK_UNHANDLED_RESPONSE_CODE
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait RTC_ERROR
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait UNKNOWN_FAILURE
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait UNSUPORTED_FILE_EXTENSION
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait VIEWER_INTERNAL_ERROR
    extends StObject
       with ErrorCodes
}
