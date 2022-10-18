package typings.firebaseStorage

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationBlobMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/blob", "FbsBlob")
  @js.native
  open class FbsBlob protected () extends StObject {
    def this(data: js.typedarray.ArrayBuffer) = this()
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: Blob) = this()
    def this(data: js.typedarray.ArrayBuffer, elideCopy: Boolean) = this()
    def this(data: js.typedarray.Uint8Array, elideCopy: Boolean) = this()
    def this(data: Blob, elideCopy: Boolean) = this()
    
    /* private */ var data_ : Any = js.native
    
    def size(): Double = js.native
    
    /* private */ var size_ : Any = js.native
    
    def slice(startByte: Double, endByte: Double): FbsBlob | Null = js.native
    
    def `type`(): String = js.native
    
    /* private */ var type_ : Any = js.native
    
    def uploadData(): Blob | js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object FbsBlob {
    
    @JSImport("@firebase/storage/dist/node-esm/src/implementation/blob", "FbsBlob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBlob(args: (String | FbsBlob)*): FbsBlob | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FbsBlob | Null]
  }
}
