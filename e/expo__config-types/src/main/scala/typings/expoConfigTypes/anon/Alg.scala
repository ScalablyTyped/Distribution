package typings.expoConfigTypes.anon

import typings.expoConfigTypes.expoConfigTypesStrings.`rsa-v1_5-sha256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  /**
    * Algorithm used to generate manifest code signing signature.
    */
  var alg: js.UndefOr[`rsa-v1_5-sha256`] = js.undefined
  
  /**
    * Identifier for the key in the certificate. Used to instruct signing mechanisms when signing or verifying signatures.
    */
  var keyid: js.UndefOr[String] = js.undefined
}
object Alg {
  
  inline def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: `rsa-v1_5-sha256`): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
  }
}
