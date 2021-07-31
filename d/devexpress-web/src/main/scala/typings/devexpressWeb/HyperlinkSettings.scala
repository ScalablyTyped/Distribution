package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define a hyperlink.
  */
trait HyperlinkSettings extends StObject {
  
  /**
    * Specifies a hyperlink's bookmark.
    */
  var bookmark: String
  
  /**
    * Specifies a hyperlink text.
    */
  var text: String
  
  /**
    * Specifies a tooltip text.
    */
  var tooltip: String
  
  /**
    * Specifies a hyperlink's destination.
    */
  var url: String
}
object HyperlinkSettings {
  
  @scala.inline
  def apply(bookmark: String, text: String, tooltip: String, url: String): HyperlinkSettings = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkSettings]
  }
  
  @scala.inline
  implicit class HyperlinkSettingsMutableBuilder[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
