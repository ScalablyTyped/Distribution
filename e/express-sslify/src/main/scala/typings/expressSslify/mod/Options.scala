package typings.expressSslify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Azure has a slightly different way of signaling encrypted connections.
    * To tell express-sslify to look out for Azure's x-arr-ssl header.
    * @default false
    */
  var trustAzureHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Heroku, nodejitsu and other hosters often use reverse proxies which offer SSL endpoints but then forward unencrypted HTTP traffic to the website.
    * This makes it difficult to detect if the original request was indeed via HTTPS.
    * Luckily, most reverse proxies set the x-forwarded-proto header flag with the original request scheme.
    * @default false
    */
  var trustProtoHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * If your reverse proxy sends the original host using the X-Forwarded-Host header and you need to use that instead of the Host header for the redirect.
    * @default false
    */
  var trustXForwardedHostHeader: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setTrustAzureHeader(value: Boolean): Self = this.set("trustAzureHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustAzureHeader: Self = this.set("trustAzureHeader", js.undefined)
    
    @scala.inline
    def setTrustProtoHeader(value: Boolean): Self = this.set("trustProtoHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustProtoHeader: Self = this.set("trustProtoHeader", js.undefined)
    
    @scala.inline
    def setTrustXForwardedHostHeader(value: Boolean): Self = this.set("trustXForwardedHostHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustXForwardedHostHeader: Self = this.set("trustXForwardedHostHeader", js.undefined)
  }
}
