package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataErrorObject extends StObject {
  
  var dataHeight: Double = js.native
  
  var dataWidth: Double = js.native
  
  var errorMessage: String = js.native
}
object GetDataErrorObject {
  
  @scala.inline
  def apply(dataHeight: Double, dataWidth: Double, errorMessage: String): GetDataErrorObject = {
    val __obj = js.Dynamic.literal(dataHeight = dataHeight.asInstanceOf[js.Any], dataWidth = dataWidth.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataErrorObject]
  }
  
  @scala.inline
  implicit class GetDataErrorObjectMutableBuilder[Self <: GetDataErrorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHeight(value: Double): Self = StObject.set(x, "dataHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataWidth(value: Double): Self = StObject.set(x, "dataWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
