package typings.extjs.Ext.state

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocalStorageProvider extends IProvider {
  
  /** [Method] private
    * @param name Object
    */
  @JSName("clear")
  var clear_ILocalStorageProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value for a key
    * @param name Object
    * @param value Object
    */
  @JSName("set")
  var set_ILocalStorageProvider: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ILocalStorageProvider {
  
  @scala.inline
  def apply(): ILocalStorageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILocalStorageProvider]
  }
  
  @scala.inline
  implicit class ILocalStorageProviderOps[Self <: ILocalStorageProvider] (val x: Self) extends AnyVal {
    
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
    def setSet(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
