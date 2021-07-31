package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonGroup object.
  */
trait ASPxClientRibbonGroup extends StObject {
  
  /**
    * Returns a value specifying whether a ribbon group is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Gets or sets the group's index within the collection.
    */
  var index: Double
  
  /**
    * Gets the name of the current ribbon group.
    */
  var name: String
  
  /**
    * Gets the client ribbon object to which the current group belongs.
    */
  var ribbon: ASPxClientRibbon
  
  /**
    * Gets the client tab object to which the current group belongs.
    */
  var tab: ASPxClientRibbonTab
}
object ASPxClientRibbonGroup {
  
  @scala.inline
  def apply(
    GetVisible: () => Boolean,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon,
    tab: ASPxClientRibbonTab
  ): ASPxClientRibbonGroup = {
    val __obj = js.Dynamic.literal(GetVisible = js.Any.fromFunction0(GetVisible), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonGroup]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonGroupMutableBuilder[Self <: ASPxClientRibbonGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "GetVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRibbon(value: ASPxClientRibbon): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ASPxClientRibbonTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
