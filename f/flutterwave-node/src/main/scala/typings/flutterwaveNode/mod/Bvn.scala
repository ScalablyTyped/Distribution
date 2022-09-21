package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bvn extends StObject {
  
  def verification(data: BvnVerificationRequest): js.Promise[AxiosResponse[BvnVerificationResponse, Any]]
}
object Bvn {
  
  inline def apply(verification: BvnVerificationRequest => js.Promise[AxiosResponse[BvnVerificationResponse, Any]]): Bvn = {
    val __obj = js.Dynamic.literal(verification = js.Any.fromFunction1(verification))
    __obj.asInstanceOf[Bvn]
  }
  
  extension [Self <: Bvn](x: Self) {
    
    inline def setVerification(value: BvnVerificationRequest => js.Promise[AxiosResponse[BvnVerificationResponse, Any]]): Self = StObject.set(x, "verification", js.Any.fromFunction1(value))
  }
}
