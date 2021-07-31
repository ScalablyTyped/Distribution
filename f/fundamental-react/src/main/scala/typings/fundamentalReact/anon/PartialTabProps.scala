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
  
  @scala.inline
  def apply(): PartialTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabProps]
  }
  
  @scala.inline
  implicit class PartialTabPropsMutableBuilder[Self <: PartialTabProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
    
    @scala.inline
    def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLinkProps(value: js.Any): Self = StObject.set(x, "linkProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkPropsUndefined: Self = StObject.set(x, "linkProps", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setTabContentProps(value: js.Any): Self = StObject.set(x, "tabContentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabContentPropsUndefined: Self = StObject.set(x, "tabContentProps", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
