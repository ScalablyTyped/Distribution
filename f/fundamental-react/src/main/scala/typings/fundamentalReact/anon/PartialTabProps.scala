package typings.fundamentalReact.anon

import typings.fundamentalReact.iconMod.IconGlyph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
trait PartialTabProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  
  var glyph: js.UndefOr[IconGlyph] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var linkProps: js.UndefOr[js.Any] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var tabContentProps: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialTabProps {
  
  inline def apply(): PartialTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabProps]
  }
  
  extension [Self <: PartialTabProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
    
    inline def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
    
    inline def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setTabContentProps(value: js.Any): Self = StObject.set(x, "tabContentProps", value.asInstanceOf[js.Any])
    
    inline def setTabContentPropsUndefined: Self = StObject.set(x, "tabContentProps", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
