package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandsRequest extends StObject {
  
  /**
    * A list of brands.
    */
  var brands: js.UndefOr[
    js.Array[
      /* This request object contains information about a specific brand. */ BrandRequest
    ]
  ] = js.undefined
}
object BrandsRequest {
  
  inline def apply(): BrandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrandsRequest] (val x: Self) extends AnyVal {
    
    inline def setBrands(
      value: js.Array[
          /* This request object contains information about a specific brand. */ BrandRequest
        ]
    ): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(value: (/* This request object contains information about a specific brand. */ BrandRequest)*): Self = StObject.set(x, "brands", js.Array(value*))
  }
}
