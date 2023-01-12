package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkedUploadPart extends StObject {
  
  /**
    * The order of the part in the chunked upload.
    */
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the part in bytes.
    *
    * We recommend that a chunked upload part is no larger than a few MB in size.
    */
  var size: js.UndefOr[String] = js.undefined
}
object ChunkedUploadPart {
  
  inline def apply(): ChunkedUploadPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploadPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkedUploadPart] (val x: Self) extends AnyVal {
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
