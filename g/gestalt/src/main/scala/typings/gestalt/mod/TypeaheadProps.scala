package typings.gestalt.mod

import typings.gestalt.anon.EventFocusEvent
import typings.gestalt.anon.EventSyntheticEventValueString
import typings.gestalt.anon.EventValueString
import typings.gestalt.anon.Item
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadProps extends StObject {
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var noResultText: String
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventValueString, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ EventSyntheticEventValueString, Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* args */ Item, Unit]] = js.undefined
  
  var options: js.Array[typings.gestalt.anon.Label]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TypeaheadProps {
  
  @scala.inline
  def apply(id: String, noResultText: String, options: js.Array[typings.gestalt.anon.Label]): TypeaheadProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps]
  }
  
  @scala.inline
  implicit class TypeaheadPropsMutableBuilder[Self <: TypeaheadProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNoResultText(value: String): Self = StObject.set(x, "noResultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: /* args */ EventValueString => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ EventSyntheticEventValueString => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* args */ EventFocusEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* args */ Item => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[typings.gestalt.anon.Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: typings.gestalt.anon.Label*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
