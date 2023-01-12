package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.IO.CloseRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ReadResponse
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOApi extends StObject {
  
  /**
    * Close the stream, discard any temporary backing storage.
    */
  def close(params: CloseRequest): js.Promise[Unit]
  
  /**
    * Read a chunk of the stream
    */
  def read(params: ReadRequest): js.Promise[ReadResponse]
  
  /**
    * Return UUID of Blob object specified by a remote object id.
    */
  def resolveBlob(params: ResolveBlobRequest): js.Promise[ResolveBlobResponse]
}
object IOApi {
  
  inline def apply(
    close: CloseRequest => js.Promise[Unit],
    read: ReadRequest => js.Promise[ReadResponse],
    resolveBlob: ResolveBlobRequest => js.Promise[ResolveBlobResponse]
  ): IOApi = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), read = js.Any.fromFunction1(read), resolveBlob = js.Any.fromFunction1(resolveBlob))
    __obj.asInstanceOf[IOApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOApi] (val x: Self) extends AnyVal {
    
    inline def setClose(value: CloseRequest => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setRead(value: ReadRequest => js.Promise[ReadResponse]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setResolveBlob(value: ResolveBlobRequest => js.Promise[ResolveBlobResponse]): Self = StObject.set(x, "resolveBlob", js.Any.fromFunction1(value))
  }
}
