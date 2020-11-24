package typings.extjs.Ext.state

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICookieProvider extends IProvider {
  
  /** [Method] private
    * @param name Object
    */
  @JSName("clear")
  var clear_ICookieProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var domain: js.UndefOr[String] = js.native
  
  /** [Config Option] (Date) */
  var expires: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var path: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var secure: js.UndefOr[Boolean] = js.native
  
  /** [Method] private
    * @param name Object
    * @param value Object
    */
  @JSName("set")
  var set_ICookieProvider: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ICookieProvider {
  
  @scala.inline
  def apply(): ICookieProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICookieProvider]
  }
  
  @scala.inline
  implicit class ICookieProviderOps[Self <: ICookieProvider] (val x: Self) extends AnyVal {
    
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
    def setClear(value: /* name */ js.UndefOr[js.Any] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Any): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSet(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
