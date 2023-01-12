package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.Schema.GetDomainsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApi extends StObject {
  
  /**
    * Returns supported domains.
    */
  def getDomains(): js.Promise[GetDomainsResponse]
}
object SchemaApi {
  
  inline def apply(getDomains: () => js.Promise[GetDomainsResponse]): SchemaApi = {
    val __obj = js.Dynamic.literal(getDomains = js.Any.fromFunction0(getDomains))
    __obj.asInstanceOf[SchemaApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaApi] (val x: Self) extends AnyVal {
    
    inline def setGetDomains(value: () => js.Promise[GetDomainsResponse]): Self = StObject.set(x, "getDomains", js.Any.fromFunction0(value))
  }
}
