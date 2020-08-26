package typings.ejWebAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** When set to true, enables the context menu options available for the SpellCheck.
    * @Default {true}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Contains all the default context menu options that are applicable for SpellCheck. It also supports adding custom menu items. All the SpellCheck related context menu items are
    * grouped under this menu collection.
    * @Default {{% highlight javascript %}[{ id: IgnoreAll, text: Ignore All },{ id: AddToDictionary, text: Add To Dictionary }]{% endhighlight %}}
    */
  var menuItems: js.UndefOr[js.Array[_]] = js.native
}

object ContextMenuSettings {
  @scala.inline
  def apply(): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettings]
  }
  @scala.inline
  implicit class ContextMenuSettingsOps[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setMenuItemsVarargs(value: js.Any*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[_]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
  
}

