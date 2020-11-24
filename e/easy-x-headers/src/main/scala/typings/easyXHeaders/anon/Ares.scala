package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ares extends js.Object {
  
  var ares: String = js.native
  
  var http_parser: String = js.native
  
  var node: String = js.native
  
  var openssl: String = js.native
  
  var uv: String = js.native
  
  var v8: String = js.native
  
  var zlib: String = js.native
}
object Ares {
  
  @scala.inline
  def apply(
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
  implicit class AresOps[Self <: Ares] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAres(value: String): Self = this.set("ares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp_parser(value: String): Self = this.set("http_parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenssl(value: String): Self = this.set("openssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUv(value: String): Self = this.set("uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV8(value: String): Self = this.set("v8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlib(value: String): Self = this.set("zlib", value.asInstanceOf[js.Any])
  }
}
