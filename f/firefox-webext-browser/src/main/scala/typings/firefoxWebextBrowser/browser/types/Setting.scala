package typings.firefoxWebextBrowser.browser.types

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Setting extends js.Object {
  
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    */
  def clear(details: ClearDetails): js.Promise[Unit] = js.native
  
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: GetDetails): js.Promise[GetReturnDetails] = js.native
  
  /** Fired after the setting changes. */
  var onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]] = js.native
  
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    */
  def set(details: SetDetails): js.Promise[Unit] = js.native
}
object Setting {
  
  @scala.inline
  def apply(
    clear: ClearDetails => js.Promise[Unit],
    get: GetDetails => js.Promise[GetReturnDetails],
    onChange: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]],
    set: SetDetails => js.Promise[Unit]
  ): Setting = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), onChange = onChange.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Setting]
  }
  
  @scala.inline
  implicit class SettingOps[Self <: Setting] (val x: Self) extends AnyVal {
    
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
    def setClear(value: ClearDetails => js.Promise[Unit]): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: GetDetails => js.Promise[GetReturnDetails]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChange(value: WebExtEvent[js.Function1[/* details */ OnChangeDetails, Unit]]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: SetDetails => js.Promise[Unit]): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
