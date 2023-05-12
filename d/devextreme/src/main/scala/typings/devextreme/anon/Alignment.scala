package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxForm.LabelLocation
import typings.devextreme.mod.DevExpress.ui.dxForm.SimpleItemLabelTemplateData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  /**
    * Specifies the label&apos;s horizontal alignment. Applies only if the labelMode is &apos;outside&apos;.
    */
  var alignment: js.UndefOr[typings.devextreme.mod.DevExpress.common.HorizontalAlignment] = js.undefined
  
  /**
    * Specifies the location of a label against the editor. Applies only if the labelMode is &apos;outside&apos;.
    */
  var location: js.UndefOr[LabelLocation] = js.undefined
  
  /**
    * Specifies whether or not a colon is displayed at the end of the current label.
    */
  var showColon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* itemData */ SimpleItemLabelTemplateData, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the label text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the label is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Alignment {
  
  inline def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alignment] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: typings.devextreme.mod.DevExpress.common.HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setLocation(value: LabelLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setShowColon(value: Boolean): Self = StObject.set(x, "showColon", value.asInstanceOf[js.Any])
    
    inline def setShowColonUndefined: Self = StObject.set(x, "showColon", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* itemData */ SimpleItemLabelTemplateData, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* itemData */ SimpleItemLabelTemplateData, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
