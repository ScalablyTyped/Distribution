package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapMenuItem extends StObject {
  
  def getBadgeIconCssClass(): String
  
  def getBadgeText(): String
  
  def getChecked(): Boolean
  
  def getEnabled(): Boolean
  
  def getIconCssClass(): String
  
  def getImageUrl(): String
  
  def getItem(index: Double): BootstrapMenuItem | Null
  
  def getItemByName(name: String): BootstrapMenuItem | Null
  
  def getItemCount(): Double
  
  def getNavigateUrl(): String
  
  def getText(): String
  
  def getVisible(): Boolean
  
  val index: Double
  
  val indexPath: String
  
  /* protected */ val instance: js.Any
  
  val menu: BootstrapMenu | Null
  
  val name: String
  
  val parent: BootstrapMenuItem | Null
  
  def setBadgeIconCssClass(cssClass: String): Unit
  
  def setBadgeText(text: String): Unit
  
  def setChecked(value: Boolean): Unit
  
  def setEnabled(value: Boolean): Unit
  
  def setIconCssClass(cssClass: String): Unit
  
  def setImageUrl(value: String): Unit
  
  def setNavigateUrl(value: String): Unit
  
  def setText(value: String): Unit
  
  def setVisible(value: Boolean): Unit
}
object BootstrapMenuItem {
  
  inline def apply(
    getBadgeIconCssClass: () => String,
    getBadgeText: () => String,
    getChecked: () => Boolean,
    getEnabled: () => Boolean,
    getIconCssClass: () => String,
    getImageUrl: () => String,
    getItem: Double => BootstrapMenuItem | Null,
    getItemByName: String => BootstrapMenuItem | Null,
    getItemCount: () => Double,
    getNavigateUrl: () => String,
    getText: () => String,
    getVisible: () => Boolean,
    index: Double,
    indexPath: String,
    instance: js.Any,
    name: String,
    setBadgeIconCssClass: String => Unit,
    setBadgeText: String => Unit,
    setChecked: Boolean => Unit,
    setEnabled: Boolean => Unit,
    setIconCssClass: String => Unit,
    setImageUrl: String => Unit,
    setNavigateUrl: String => Unit,
    setText: String => Unit,
    setVisible: Boolean => Unit
  ): BootstrapMenuItem = {
    val __obj = js.Dynamic.literal(getBadgeIconCssClass = js.Any.fromFunction0(getBadgeIconCssClass), getBadgeText = js.Any.fromFunction0(getBadgeText), getChecked = js.Any.fromFunction0(getChecked), getEnabled = js.Any.fromFunction0(getEnabled), getIconCssClass = js.Any.fromFunction0(getIconCssClass), getImageUrl = js.Any.fromFunction0(getImageUrl), getItem = js.Any.fromFunction1(getItem), getItemByName = js.Any.fromFunction1(getItemByName), getItemCount = js.Any.fromFunction0(getItemCount), getNavigateUrl = js.Any.fromFunction0(getNavigateUrl), getText = js.Any.fromFunction0(getText), getVisible = js.Any.fromFunction0(getVisible), index = index.asInstanceOf[js.Any], indexPath = indexPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setBadgeIconCssClass = js.Any.fromFunction1(setBadgeIconCssClass), setBadgeText = js.Any.fromFunction1(setBadgeText), setChecked = js.Any.fromFunction1(setChecked), setEnabled = js.Any.fromFunction1(setEnabled), setIconCssClass = js.Any.fromFunction1(setIconCssClass), setImageUrl = js.Any.fromFunction1(setImageUrl), setNavigateUrl = js.Any.fromFunction1(setNavigateUrl), setText = js.Any.fromFunction1(setText), setVisible = js.Any.fromFunction1(setVisible), menu = null, parent = null)
    __obj.asInstanceOf[BootstrapMenuItem]
  }
  
  extension [Self <: BootstrapMenuItem](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: () => String): Self = StObject.set(x, "getBadgeIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetBadgeText(value: () => String): Self = StObject.set(x, "getBadgeText", js.Any.fromFunction0(value))
    
    inline def setGetChecked(value: () => Boolean): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
    
    inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
    
    inline def setGetIconCssClass(value: () => String): Self = StObject.set(x, "getIconCssClass", js.Any.fromFunction0(value))
    
    inline def setGetImageUrl(value: () => String): Self = StObject.set(x, "getImageUrl", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: Double => BootstrapMenuItem | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemByName(value: String => BootstrapMenuItem | Null): Self = StObject.set(x, "getItemByName", js.Any.fromFunction1(value))
    
    inline def setGetItemCount(value: () => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction0(value))
    
    inline def setGetNavigateUrl(value: () => String): Self = StObject.set(x, "getNavigateUrl", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexPath(value: String): Self = StObject.set(x, "indexPath", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: BootstrapMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuNull: Self = StObject.set(x, "menu", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BootstrapMenuItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setSetBadgeIconCssClass(value: String => Unit): Self = StObject.set(x, "setBadgeIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetBadgeText(value: String => Unit): Self = StObject.set(x, "setBadgeText", js.Any.fromFunction1(value))
    
    inline def setSetChecked(value: Boolean => Unit): Self = StObject.set(x, "setChecked", js.Any.fromFunction1(value))
    
    inline def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
    
    inline def setSetIconCssClass(value: String => Unit): Self = StObject.set(x, "setIconCssClass", js.Any.fromFunction1(value))
    
    inline def setSetImageUrl(value: String => Unit): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetNavigateUrl(value: String => Unit): Self = StObject.set(x, "setNavigateUrl", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
