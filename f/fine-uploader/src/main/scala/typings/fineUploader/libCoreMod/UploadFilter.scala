package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFilter extends StObject {
  
  /**
    * the id of the file
    */
  var id: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * status of the file
    */
  var status: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * the uuid of the file
    */
  var uuid: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object UploadFilter {
  
  inline def apply(): UploadFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFilter] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double | js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setStatus(value: String | js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setUuid(value: Double | js.Array[Double]): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    inline def setUuidVarargs(value: Double*): Self = StObject.set(x, "uuid", js.Array(value*))
  }
}
