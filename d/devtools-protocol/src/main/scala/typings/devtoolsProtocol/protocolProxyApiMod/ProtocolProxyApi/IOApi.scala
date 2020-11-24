package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.IO.CloseRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadResponse
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOApi extends js.Object {
  
  /**
    * Close the stream, discard any temporary backing storage.
    */
  def close(params: CloseRequest): js.Promise[Unit] = js.native
  
  /**
    * Read a chunk of the stream
    */
  def read(params: ReadRequest): js.Promise[ReadResponse] = js.native
  
  /**
    * Return UUID of Blob object specified by a remote object id.
    */
  def resolveBlob(params: ResolveBlobRequest): js.Promise[ResolveBlobResponse] = js.native
}
object IOApi {
  
  @scala.inline
  def apply(
    close: CloseRequest => js.Promise[Unit],
    read: ReadRequest => js.Promise[ReadResponse],
    resolveBlob: ResolveBlobRequest => js.Promise[ResolveBlobResponse]
  ): IOApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), read = js.Any.fromFunction1(read), resolveBlob = js.Any.fromFunction1(resolveBlob))
    __obj.asInstanceOf[IOApi]
  }
  
  @scala.inline
  implicit class IOApiOps[Self <: IOApi] (val x: Self) extends AnyVal {
    
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
    def setClose(value: CloseRequest => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: ReadRequest => js.Promise[ReadResponse]): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveBlob(value: ResolveBlobRequest => js.Promise[ResolveBlobResponse]): Self = this.set("resolveBlob", js.Any.fromFunction1(value))
  }
}
