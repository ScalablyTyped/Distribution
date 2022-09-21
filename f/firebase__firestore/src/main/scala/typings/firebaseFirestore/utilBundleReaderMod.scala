package typings.firebaseFirestore

import typings.firebaseFirestore.protosFirestoreBundleProtoMod.BundleElement
import typings.firebaseFirestore.protosFirestoreBundleProtoMod.BundleMetadata
import typings.firebaseFirestore.srcRemoteSerializerMod.JsonProtoSerializer
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilBundleReaderMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/bundle_reader", "SizedBundleElement")
  @js.native
  open class SizedBundleElement protected () extends StObject {
    def this(payload: BundleElement, byteLength: Double) = this()
    
    val byteLength: Double = js.native
    
    def isBundleMetadata(): Boolean = js.native
    
    val payload: BundleElement = js.native
  }
  
  trait BundleReader extends StObject {
    
    def close(): js.Promise[Unit]
    
    /**
      * Returns the metadata of the bundle.
      */
    def getMetadata(): js.Promise[BundleMetadata]
    
    /**
      * Returns the next BundleElement (together with its byte size in the bundle)
      * that has not been read from underlying ReadableStream. Returns null if we
      * have reached the end of the stream.
      */
    def nextElement(): js.Promise[SizedBundleElement | Null]
    
    var serializer: JsonProtoSerializer
  }
  object BundleReader {
    
    inline def apply(
      close: () => js.Promise[Unit],
      getMetadata: () => js.Promise[BundleMetadata],
      nextElement: () => js.Promise[SizedBundleElement | Null],
      serializer: JsonProtoSerializer
    ): BundleReader = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getMetadata = js.Any.fromFunction0(getMetadata), nextElement = js.Any.fromFunction0(nextElement), serializer = serializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleReader]
    }
    
    extension [Self <: BundleReader](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetMetadata(value: () => js.Promise[BundleMetadata]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
      
      inline def setNextElement(value: () => js.Promise[SizedBundleElement | Null]): Self = StObject.set(x, "nextElement", js.Any.fromFunction0(value))
      
      inline def setSerializer(value: JsonProtoSerializer): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    }
  }
  
  type BundleSource = ReadableStream[js.typedarray.Uint8Array] | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
