package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the MVCxDocumentViewer class.
  */
@js.native
trait MVCxClientDocumentViewer extends ASPxClientDocumentViewer {
  
  /**
    * Occurs before performing a document export request.
    */
  var BeforeExportRequest: ASPxClientEvent[MVCxClientBeforeExportRequestEventHandler[MVCxClientDocumentViewer]] = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientDocumentViewer: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientDocumentViewer]] = js.native
}
