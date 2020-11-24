package typings.firefoxWebextBrowser.browser.privacy.network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object which describes TLS minimum and maximum versions. */
@js.native
trait tlsVersionRestrictionConfig extends js.Object {
  
  /** The maximum TLS version supported. */
  var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximum] = js.native
  
  /** The minimum TLS version supported. */
  var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimum] = js.native
}
object tlsVersionRestrictionConfig {
  
  @scala.inline
  def apply(): tlsVersionRestrictionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[tlsVersionRestrictionConfig]
  }
  
  @scala.inline
  implicit class tlsVersionRestrictionConfigOps[Self <: tlsVersionRestrictionConfig] (val x: Self) extends AnyVal {
    
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
    def setMaximum(value: TlsVersionRestrictionConfigMaximum): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: TlsVersionRestrictionConfigMinimum): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
  }
}
