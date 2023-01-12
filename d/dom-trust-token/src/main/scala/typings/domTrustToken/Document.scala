package typings.domTrustToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  def hasTrustToken(issuer: String): js.Promise[Boolean]
}
object Document {
  
  inline def apply(hasTrustToken: String => js.Promise[Boolean]): Document = {
    val __obj = js.Dynamic.literal(hasTrustToken = js.Any.fromFunction1(hasTrustToken))
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setHasTrustToken(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasTrustToken", js.Any.fromFunction1(value))
  }
}
