package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the information about tab stops.
  */
@js.native
trait TabsSettings extends js.Object {
  
  /**
    * Specifies the default distance between tab stops.
    */
  var defaultTabStop: Double = js.native
  
  /**
    * Gets or sets a list of tab stops.
    */
  var tabs: js.Array[TabSettings] = js.native
}
object TabsSettings {
  
  @scala.inline
  def apply(defaultTabStop: Double, tabs: js.Array[TabSettings]): TabsSettings = {
    val __obj = js.Dynamic.literal(defaultTabStop = defaultTabStop.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsSettings]
  }
  
  @scala.inline
  implicit class TabsSettingsOps[Self <: TabsSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultTabStop(value: Double): Self = this.set("defaultTabStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: TabSettings*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabSettings]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
