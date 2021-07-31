package typings.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OperationInfo. */
trait IOperationInfo extends StObject {
  
  /** OperationInfo metadataType */
  var metadataType: js.UndefOr[String | Null] = js.undefined
  
  /** OperationInfo responseType */
  var responseType: js.UndefOr[String | Null] = js.undefined
}
object IOperationInfo {
  
  @scala.inline
  def apply(): IOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperationInfo]
  }
  
  @scala.inline
  implicit class IOperationInfoMutableBuilder[Self <: IOperationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadataType(value: String): Self = StObject.set(x, "metadataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataTypeNull: Self = StObject.set(x, "metadataType", null)
    
    @scala.inline
    def setMetadataTypeUndefined: Self = StObject.set(x, "metadataType", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
