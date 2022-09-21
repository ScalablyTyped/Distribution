package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BvnVerificationRequest extends StObject {
  
  var bvn: String
}
object BvnVerificationRequest {
  
  inline def apply(bvn: String): BvnVerificationRequest = {
    val __obj = js.Dynamic.literal(bvn = bvn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BvnVerificationRequest]
  }
  
  extension [Self <: BvnVerificationRequest](x: Self) {
    
    inline def setBvn(value: String): Self = StObject.set(x, "bvn", value.asInstanceOf[js.Any])
  }
}
