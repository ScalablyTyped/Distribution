package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionUrlMapsValidateRequest extends StObject {
  
  /**
    * Content of the UrlMap to be validated.
    */
  var resource: js.UndefOr[SchemaUrlMap] = js.undefined
}
object SchemaRegionUrlMapsValidateRequest {
  
  @scala.inline
  def apply(): SchemaRegionUrlMapsValidateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionUrlMapsValidateRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionUrlMapsValidateRequestMutableBuilder[Self <: SchemaRegionUrlMapsValidateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: SchemaUrlMap): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
