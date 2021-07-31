package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandRequest extends StObject {
  
  /**
    * The id of the brand.
    */
  var brandId: js.UndefOr[String] = js.undefined
}
object BrandRequest {
  
  @scala.inline
  def apply(): BrandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandRequest]
  }
  
  @scala.inline
  implicit class BrandRequestMutableBuilder[Self <: BrandRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
  }
}
