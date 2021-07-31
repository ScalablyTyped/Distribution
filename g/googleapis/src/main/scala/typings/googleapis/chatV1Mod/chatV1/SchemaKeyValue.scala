package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A UI element contains a key (label) and a value (content). And this element
  * may also contain some actions such as onclick button.
  */
trait SchemaKeyValue extends StObject {
  
  /**
    * The text of the bottom label. Formatted text supported.
    */
  var bottomLabel: js.UndefOr[String] = js.undefined
  
  /**
    * A button that can be clicked to trigger an action.
    */
  var button: js.UndefOr[SchemaButton] = js.undefined
  
  /**
    * The text of the content. Formatted text supported and always required.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * If the content should be multiline.
    */
  var contentMultiline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An enum value that will be replaced by the Chat API with the
    * corresponding icon image.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The onclick action. Only the top label, bottom label and content region
    * are clickable.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.undefined
  
  /**
    * The text of the top label. Formatted text supported.
    */
  var topLabel: js.UndefOr[String] = js.undefined
}
object SchemaKeyValue {
  
  @scala.inline
  def apply(): SchemaKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValue]
  }
  
  @scala.inline
  implicit class SchemaKeyValueMutableBuilder[Self <: SchemaKeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomLabel(value: String): Self = StObject.set(x, "bottomLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomLabelUndefined: Self = StObject.set(x, "bottomLabel", js.undefined)
    
    @scala.inline
    def setButton(value: SchemaButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMultiline(value: Boolean): Self = StObject.set(x, "contentMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMultilineUndefined: Self = StObject.set(x, "contentMultiline", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setOnClick(value: SchemaOnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTopLabel(value: String): Self = StObject.set(x, "topLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLabelUndefined: Self = StObject.set(x, "topLabel", js.undefined)
  }
}
