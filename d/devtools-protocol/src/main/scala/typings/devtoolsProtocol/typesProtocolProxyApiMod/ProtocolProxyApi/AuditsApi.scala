package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.issueAdded
import typings.devtoolsProtocol.mod.Protocol.Audits.CheckContrastRequest
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseResponse
import typings.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditsApi extends StObject {
  
  /**
    * Runs the contrast check for the target page. Found issues are reported
    * using Audits.issueAdded event.
    */
  def checkContrast(params: CheckContrastRequest): js.Promise[Unit]
  
  /**
    * Disables issues domain, prevents further issues from being reported to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables issues domain, sends the issues collected so far to the client by means of the
    * `issueAdded` event.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Returns the response body and size if it were re-encoded with the specified settings. Only
    * applies to images.
    */
  def getEncodedResponse(params: GetEncodedResponseRequest): js.Promise[GetEncodedResponseResponse]
  
  @JSName("on")
  def on_issueAdded(event: issueAdded, listener: js.Function1[/* params */ IssueAddedEvent, Unit]): Unit
}
object AuditsApi {
  
  inline def apply(
    checkContrast: CheckContrastRequest => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getEncodedResponse: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse],
    on: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit
  ): AuditsApi = {
    val __obj = js.Dynamic.literal(checkContrast = js.Any.fromFunction1(checkContrast), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getEncodedResponse = js.Any.fromFunction1(getEncodedResponse), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AuditsApi]
  }
  
  extension [Self <: AuditsApi](x: Self) {
    
    inline def setCheckContrast(value: CheckContrastRequest => js.Promise[Unit]): Self = StObject.set(x, "checkContrast", js.Any.fromFunction1(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetEncodedResponse(value: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse]): Self = StObject.set(x, "getEncodedResponse", js.Any.fromFunction1(value))
    
    inline def setOn(value: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
