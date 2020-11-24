package typings.feathersjsAuthentication.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * The resource server where the token is processed
    */
  var audience: js.UndefOr[String] = js.native
  
  var expiresIn: js.UndefOr[String] = js.native
  
  /**
    * By default is an access token
    */
  var header: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The issuing server, application or resource
    */
  var issuer: js.UndefOr[String] = js.native
  
  /**
    * Typically the entity id associated with the JWT
    */
  var subject: js.UndefOr[String] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setHeader(value: StringDictionary[js.Any]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
