package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.types.SettingScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  /** Where to set the setting (default: regular). */
  var scope: js.UndefOr[SettingScope] = js.native
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An
    * extension should _not_ set a value of a different type.
    */
  var value: js.Any = js.native
}

object Scope {
  @scala.inline
  def apply(value: js.Any): Scope = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: SettingScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

