package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IO {
  
  trait CloseRequest extends StObject {
    
    /**
      * Handle of the stream to close.
      */
    var handle: StreamHandle
  }
  object CloseRequest {
    
    inline def apply(handle: StreamHandle): CloseRequest = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseRequest] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: StreamHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadRequest extends StObject {
    
    /**
      * Handle of the stream to read.
      */
    var handle: StreamHandle
    
    /**
      * Seek to the specified offset before reading (if not specificed, proceed with offset
      * following the last read). Some types of streams may only support sequential reads.
      */
    var offset: js.UndefOr[integer] = js.undefined
    
    /**
      * Maximum number of bytes to read (left upon the agent discretion if not specified).
      */
    var size: js.UndefOr[integer] = js.undefined
  }
  object ReadRequest {
    
    inline def apply(handle: StreamHandle): ReadRequest = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadRequest] (val x: Self) extends AnyVal {
      
      inline def setHandle(value: StreamHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ReadResponse extends StObject {
    
    /**
      * Set if the data is base64-encoded
      */
    var base64Encoded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data that were read.
      */
    var data: String
    
    /**
      * Set if the end-of-file condition occurred while reading.
      */
    var eof: Boolean
  }
  object ReadResponse {
    
    inline def apply(data: String, eof: Boolean): ReadResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eof = eof.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadResponse] (val x: Self) extends AnyVal {
      
      inline def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
      
      inline def setBase64EncodedUndefined: Self = StObject.set(x, "base64Encoded", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEof(value: Boolean): Self = StObject.set(x, "eof", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveBlobRequest extends StObject {
    
    /**
      * Object id of a Blob object wrapper.
      */
    var objectId: RemoteObjectId
  }
  object ResolveBlobRequest {
    
    inline def apply(objectId: RemoteObjectId): ResolveBlobRequest = {
      val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveBlobRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveBlobRequest] (val x: Self) extends AnyVal {
      
      inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveBlobResponse extends StObject {
    
    /**
      * UUID of the specified Blob.
      */
    var uuid: String
  }
  object ResolveBlobResponse {
    
    inline def apply(uuid: String): ResolveBlobResponse = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveBlobResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveBlobResponse] (val x: Self) extends AnyVal {
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  type StreamHandle = String
}
