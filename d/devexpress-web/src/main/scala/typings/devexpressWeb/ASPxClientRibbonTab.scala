package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonTab object.
  */
@js.native
trait ASPxClientRibbonTab extends StObject {
  
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
  implicit class ASPxClientRibbonTabMutableBuilder[Self <: ASPxClientRibbonTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "GetText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRibbon(value: ASPxClientRibbon): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
  }
}
