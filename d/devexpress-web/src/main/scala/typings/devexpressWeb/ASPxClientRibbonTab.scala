package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
@js.native
trait ASPxClientRibbonTab extends js.Object {
  
  /**
    * Returns a value indicating whether a ribbon tab is enabled.
    */
  def GetEnabled(): Boolean = js.native
  
  /**
    * Returns the text displayed in the tab.
    */
  def GetText(): String = js.native
  
  /**
    * Returns a value specifying whether a ribbon tab is displayed.
    */
  def GetVisible(): Boolean = js.native
  
  /**
    * Sets a value specifying whether the tab is enabled.
    * @param enabled true to enable the tab; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Gets or sets the tab's index within the collection.
    */
  var index: Double = js.native
  
  /**
    * Gets the name of the current ribbon tab.
    */
  var name: String = js.native
  
  /**
    * Gets the client ribbon object to which the current tab belongs.
    */
  var ribbon: ASPxClientRibbon = js.native
}
object ASPxClientRibbonTab {
  
  @scala.inline
  def apply(
    GetEnabled: () => Boolean,
    GetText: () => String,
    GetVisible: () => Boolean,
    SetEnabled: Boolean => Unit,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonTab = {
    val __obj = js.Dynamic.literal(GetEnabled = js.Any.fromFunction0(GetEnabled), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonTab]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonTabOps[Self <: ASPxClientRibbonTab] (val x: Self) extends AnyVal {
    
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
    def setGetEnabled(value: () => Boolean): Self = this.set("GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRibbon(value: ASPxClientRibbon): Self = this.set("ribbon", value.asInstanceOf[js.Any])
  }
}
