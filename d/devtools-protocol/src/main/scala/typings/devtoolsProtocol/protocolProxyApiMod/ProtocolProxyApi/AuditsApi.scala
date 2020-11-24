package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.issueAdded
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseResponse
import typings.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditsApi extends js.Object {
  
  /**
    * Disables issues domain, prevents further issues from being reported to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables issues domain, sends the issues collected so far to the client by means of the
    * `issueAdded` event.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Returns the response body and size if it were re-encoded with the specified settings. Only
    * applies to images.
    */
  def getEncodedResponse(params: GetEncodedResponseRequest): js.Promise[GetEncodedResponseResponse] = js.native
  
  @JSName("on")
  def on_issueAdded(event: issueAdded, listener: js.Function1[/* params */ IssueAddedEvent, Unit]): Unit = js.native
}
object AuditsApi {
  
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getEncodedResponse: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse],
    on: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit
  ): AuditsApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getEncodedResponse = js.Any.fromFunction1(getEncodedResponse), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[AuditsApi]
  }
  
  @scala.inline
  implicit class AuditsApiOps[Self <: AuditsApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncodedResponse(value: GetEncodedResponseRequest => js.Promise[GetEncodedResponseResponse]): Self = this.set("getEncodedResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (issueAdded, js.Function1[/* params */ IssueAddedEvent, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
