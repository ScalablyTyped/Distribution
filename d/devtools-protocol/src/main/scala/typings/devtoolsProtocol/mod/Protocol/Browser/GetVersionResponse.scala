package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVersionResponse extends StObject {
  
  /**
    * V8 version.
    */
  var jsVersion: String = js.native
  
  /**
    * Product name.
    */
  var product: String = js.native
  
  /**
    * Protocol version.
    */
  var protocolVersion: String = js.native
  
  /**
    * Product revision.
    */
  var revision: String = js.native
  
  /**
    * User-Agent.
    */
  var userAgent: String = js.native
}
object GetVersionResponse {
  
  @scala.inline
  def apply(jsVersion: String, product: String, protocolVersion: String, revision: String, userAgent: String): GetVersionResponse = {
    val __obj = js.Dynamic.literal(jsVersion = jsVersion.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVersionResponse]
  }
  
  @scala.inline
  implicit class GetVersionResponseMutableBuilder[Self <: GetVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsVersion(value: String): Self = StObject.set(x, "jsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
