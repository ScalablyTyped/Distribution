package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHtmlDisplayAnchor extends StObject {
  
  /**
    * When set to **true**, the start or end anchor strings must match the strings specified by the start and end anchor settings in case as well as in content.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This object defines how the HTML section inside the `startAnchor` and `endAnchor` displays.
    */
  var displaySettings: js.UndefOr[DocumentHtmlDisplaySettings] = js.undefined
  
  /**
    * Specifies the end of the area in the HTML where the display settings will be applied. If you do not specify an end anchor, the end of the document will be used by default.
    *
    * **Note**: A start anchor, an end anchor, or both are required.
    */
  var endAnchor: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, removes the end anchor string for the Smart Section from the HTML, preventing it from displaying.
    */
  var removeEndAnchor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When **true**, removes the start anchor string for the Smart Section from the HTML, preventing it from displaying.
    */
  var removeStartAnchor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the beginning of the area in the HTML where the display settings will be applied. If you do not specify a start anchor, the beginning of the document will be used by default.
    *
    * **Note**: A start anchor, an end anchor, or both are required.
    */
  var startAnchor: js.UndefOr[String] = js.undefined
}
object DocumentHtmlDisplayAnchor {
  
  @scala.inline
  def apply(): DocumentHtmlDisplayAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDisplayAnchor]
  }
  
  @scala.inline
  implicit class DocumentHtmlDisplayAnchorMutableBuilder[Self <: DocumentHtmlDisplayAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setDisplaySettings(value: DocumentHtmlDisplaySettings): Self = StObject.set(x, "displaySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaySettingsUndefined: Self = StObject.set(x, "displaySettings", js.undefined)
    
    @scala.inline
    def setEndAnchor(value: String): Self = StObject.set(x, "endAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAnchorUndefined: Self = StObject.set(x, "endAnchor", js.undefined)
    
    @scala.inline
    def setRemoveEndAnchor(value: Boolean): Self = StObject.set(x, "removeEndAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEndAnchorUndefined: Self = StObject.set(x, "removeEndAnchor", js.undefined)
    
    @scala.inline
    def setRemoveStartAnchor(value: Boolean): Self = StObject.set(x, "removeStartAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStartAnchorUndefined: Self = StObject.set(x, "removeStartAnchor", js.undefined)
    
    @scala.inline
    def setStartAnchor(value: String): Self = StObject.set(x, "startAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAnchorUndefined: Self = StObject.set(x, "startAnchor", js.undefined)
  }
}
