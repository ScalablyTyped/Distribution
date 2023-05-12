package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitSequence extends StObject {
  
  var bitmap: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
}
object BitSequence {
  
  inline def apply(): BitSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitSequence] (val x: Self) extends AnyVal {
    
    inline def setBitmap(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    
    inline def setBitmapUndefined: Self = StObject.set(x, "bitmap", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
