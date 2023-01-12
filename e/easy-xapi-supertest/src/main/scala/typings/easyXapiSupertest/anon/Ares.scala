package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ares extends StObject {
  
  var ares: String
  
  var http_parser: String
  
  var node: String
  
  var openssl: String
  
  var uv: String
  
  var v8: String
  
  var zlib: String
}
object Ares {
  
  inline def apply(
    ares: String,
    http_parser: String,
    node: String,
    openssl: String,
    uv: String,
    v8: String,
    zlib: String
  ): Ares = {
    val __obj = js.Dynamic.literal(ares = ares.asInstanceOf[js.Any], http_parser = http_parser.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], zlib = zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ares]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ares] (val x: Self) extends AnyVal {
    
    inline def setAres(value: String): Self = StObject.set(x, "ares", value.asInstanceOf[js.Any])
    
    inline def setHttp_parser(value: String): Self = StObject.set(x, "http_parser", value.asInstanceOf[js.Any])
    
    inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOpenssl(value: String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
    
    inline def setUv(value: String): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    inline def setV8(value: String): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
    
    inline def setZlib(value: String): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
  }
}
