package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLicenseResourceCommitment extends StObject {
  
  /**
    * The number of licenses purchased.
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the core range of the instance for which this license applies.
    */
  var coresPerLicense: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any applicable license URI.
    */
  var license: js.UndefOr[String | Null] = js.undefined
}
object SchemaLicenseResourceCommitment {
  
  inline def apply(): SchemaLicenseResourceCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseResourceCommitment]
  }
  
  extension [Self <: SchemaLicenseResourceCommitment](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCoresPerLicense(value: String): Self = StObject.set(x, "coresPerLicense", value.asInstanceOf[js.Any])
    
    inline def setCoresPerLicenseNull: Self = StObject.set(x, "coresPerLicense", null)
    
    inline def setCoresPerLicenseUndefined: Self = StObject.set(x, "coresPerLicense", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
  }
}
