package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgedDocs extends StObject {
  
  var acknowledgedDocs: js.Array[String]
  
  var rejectedDocs: js.Array[String]
}
object AcknowledgedDocs {
  
  inline def apply(acknowledgedDocs: js.Array[String], rejectedDocs: js.Array[String]): AcknowledgedDocs = {
    val __obj = js.Dynamic.literal(acknowledgedDocs = acknowledgedDocs.asInstanceOf[js.Any], rejectedDocs = rejectedDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgedDocs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcknowledgedDocs] (val x: Self) extends AnyVal {
    
    inline def setAcknowledgedDocs(value: js.Array[String]): Self = StObject.set(x, "acknowledgedDocs", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedDocsVarargs(value: String*): Self = StObject.set(x, "acknowledgedDocs", js.Array(value*))
    
    inline def setRejectedDocs(value: js.Array[String]): Self = StObject.set(x, "rejectedDocs", value.asInstanceOf[js.Any])
    
    inline def setRejectedDocsVarargs(value: String*): Self = StObject.set(x, "rejectedDocs", js.Array(value*))
  }
}
