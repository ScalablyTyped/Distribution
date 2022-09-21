package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProductsGenerateapprovalurl
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP 47 language code used for permission names and descriptions in the returned iframe, for instance "en-US".
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProductsGenerateapprovalurl {
  
  inline def apply(): ParamsResourceProductsGenerateapprovalurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProductsGenerateapprovalurl]
  }
  
  extension [Self <: ParamsResourceProductsGenerateapprovalurl](x: Self) {
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
