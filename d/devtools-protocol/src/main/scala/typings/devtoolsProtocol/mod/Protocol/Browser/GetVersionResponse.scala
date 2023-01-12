package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVersionResponse extends StObject {
  
  /**
    * V8 version.
    */
  var jsVersion: String
  
  /**
    * Product name.
    */
  var product: String
  
  /**
    * Protocol version.
    */
  var protocolVersion: String
  
  /**
    * Product revision.
    */
  var revision: String
  
  /**
    * User-Agent.
    */
  var userAgent: String
}
object GetVersionResponse {
  
  inline def apply(jsVersion: String, product: String, protocolVersion: String, revision: String, userAgent: String): GetVersionResponse = {
    val __obj = js.Dynamic.literal(jsVersion = jsVersion.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setJsVersion(value: String): Self = StObject.set(x, "jsVersion", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
