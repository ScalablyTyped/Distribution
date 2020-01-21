package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the MVCxDocumentViewer class.
  */
@JSGlobal("MVCxClientDocumentViewer")
@js.native
class MVCxClientDocumentViewer () extends ASPxClientDocumentViewer {
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

