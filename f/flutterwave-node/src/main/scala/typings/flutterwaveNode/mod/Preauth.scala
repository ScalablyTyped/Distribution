package typings.flutterwaveNode.mod

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preauth extends StObject {
  
  def captureCard(data: PreauthCaptureCardRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def preauth(data: PreauthPreauthRequest): js.Promise[AxiosResponse[Any, Any]]
  
  def refund(data: PreauthVoidRequest): js.Promise[AxiosResponse[PreauthVoidRespone, Any]]
  
  def void(data: PreauthVoidRequest): js.Promise[AxiosResponse[PreauthVoidRespone, Any]]
}
object Preauth {
  
  inline def apply(
    captureCard: PreauthCaptureCardRequest => js.Promise[AxiosResponse[Any, Any]],
    preauth: PreauthPreauthRequest => js.Promise[AxiosResponse[Any, Any]],
    refund: PreauthVoidRequest => js.Promise[AxiosResponse[PreauthVoidRespone, Any]],
    void: PreauthVoidRequest => js.Promise[AxiosResponse[PreauthVoidRespone, Any]]
  ): Preauth = {
    val __obj = js.Dynamic.literal(captureCard = js.Any.fromFunction1(captureCard), preauth = js.Any.fromFunction1(preauth), refund = js.Any.fromFunction1(refund), void = js.Any.fromFunction1(void))
    __obj.asInstanceOf[Preauth]
  }
  
  extension [Self <: Preauth](x: Self) {
    
    inline def setCaptureCard(value: PreauthCaptureCardRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "captureCard", js.Any.fromFunction1(value))
    
    inline def setPreauth(value: PreauthPreauthRequest => js.Promise[AxiosResponse[Any, Any]]): Self = StObject.set(x, "preauth", js.Any.fromFunction1(value))
    
    inline def setRefund(value: PreauthVoidRequest => js.Promise[AxiosResponse[PreauthVoidRespone, Any]]): Self = StObject.set(x, "refund", js.Any.fromFunction1(value))
    
    inline def setVoid(value: PreauthVoidRequest => js.Promise[AxiosResponse[PreauthVoidRespone, Any]]): Self = StObject.set(x, "void", js.Any.fromFunction1(value))
  }
}
