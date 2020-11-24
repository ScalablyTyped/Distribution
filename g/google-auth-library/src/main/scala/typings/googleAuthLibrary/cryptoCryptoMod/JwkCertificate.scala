package typings.googleAuthLibrary.cryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JwkCertificate extends js.Object {
  
  var alg: String = js.native
  
  var e: String = js.native
  
  var kid: String = js.native
  
  var kty: String = js.native
  
  var n: String = js.native
  
  var use: js.UndefOr[String] = js.native
}
object JwkCertificate {
  
  @scala.inline
  def apply(alg: String, e: String, kid: String, kty: String, n: String): JwkCertificate = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwkCertificate]
  }
  
  @scala.inline
  implicit class JwkCertificateOps[Self <: JwkCertificate] (val x: Self) extends AnyVal {
    
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: String): Self = this.set("use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
}
