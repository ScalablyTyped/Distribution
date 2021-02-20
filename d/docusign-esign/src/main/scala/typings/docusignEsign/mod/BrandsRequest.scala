package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandsRequest extends StObject {
  
  /**
    * A list of brands.
    */
  var brands: js.UndefOr[
    js.Array[
      /* This request object contains information about a specific brand. */ BrandRequest
    ]
  ] = js.native
}
object BrandsRequest {
  
  @scala.inline
  def apply(): BrandsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandsRequest]
  }
  
  @scala.inline
  implicit class BrandsRequestMutableBuilder[Self <: BrandsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrands(
      value: js.Array[
          /* This request object contains information about a specific brand. */ BrandRequest
        ]
    ): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    @scala.inline
    def setBrandsVarargs(value: (/* This request object contains information about a specific brand. */ BrandRequest)*): Self = StObject.set(x, "brands", js.Array(value :_*))
  }
}
