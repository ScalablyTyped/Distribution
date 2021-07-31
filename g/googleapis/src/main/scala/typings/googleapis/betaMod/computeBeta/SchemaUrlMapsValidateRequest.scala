package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsValidateRequest extends StObject {
  
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.undefined
}
object SchemaUrlMapsValidateRequest {
  
  @scala.inline
  def apply(): SchemaUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsValidateRequest]
  }
  
  @scala.inline
  implicit class SchemaUrlMapsValidateRequestMutableBuilder[Self <: SchemaUrlMapsValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: SchemaUrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
