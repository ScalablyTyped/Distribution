package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDigest extends StObject {
  
  /**
    * A message digest produced with the SHA-256 algorithm.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message digest produced with the SHA-384 algorithm.
    */
  var sha384: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message digest produced with the SHA-512 algorithm.
    */
  var sha512: js.UndefOr[String | Null] = js.undefined
}
object SchemaDigest {
  
  inline def apply(): SchemaDigest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDigest]
  }
  
  extension [Self <: SchemaDigest](x: Self) {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSha384(value: String): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    inline def setSha384Null: Self = StObject.set(x, "sha384", null)
    
    inline def setSha384Undefined: Self = StObject.set(x, "sha384", js.undefined)
    
    inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    inline def setSha512Null: Self = StObject.set(x, "sha512", null)
    
    inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
  }
}
