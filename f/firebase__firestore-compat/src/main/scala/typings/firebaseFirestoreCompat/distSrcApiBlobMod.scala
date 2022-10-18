package typings.firebaseFirestoreCompat

import typings.firebaseFirestore.mod.Bytes
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiBlobMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/api/blob", "Blob")
  @js.native
  open class Blob protected ()
    extends StObject
       with Compat[Bytes] {
    def this(_delegate: Bytes) = this()
    
    /* CompleteClass */
    var _delegate: Bytes = js.native
    
    def isEqual(other: Blob): Boolean = js.native
    
    def toBase64(): String = js.native
    
    def toUint8Array(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Blob {
    
    @JSImport("@firebase/firestore-compat/dist/src/api/blob", "Blob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64String(base64: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[Blob]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[Blob]
  }
}
