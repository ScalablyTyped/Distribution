package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFilter extends StObject {
  
  /**
    * the id of the file
    */
  var id: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * status of the file
    */
  var status: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * the uuid of the file
    */
  var uuid: js.UndefOr[Double | js.Array[Double]] = js.native
}
object UploadFilter {
  
  @scala.inline
  def apply(): UploadFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadFilter]
  }
  
  @scala.inline
  implicit class UploadFilterMutableBuilder[Self <: UploadFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String | js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: Double | js.Array[Double]): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    @scala.inline
    def setUuidVarargs(value: Double*): Self = StObject.set(x, "uuid", js.Array(value :_*))
  }
}
