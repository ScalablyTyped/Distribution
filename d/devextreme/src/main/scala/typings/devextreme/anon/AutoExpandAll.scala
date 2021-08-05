package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExpandAll extends StObject {
  
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, js.Any])
  ] = js.undefined
}
object AutoExpandAll {
  
  inline def apply(): AutoExpandAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExpandAll]
  }
  
  extension [Self <: AutoExpandAll](x: Self) {
    
    inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTemplate(value: template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, js.Any])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(value: (/* detailElement */ dxElement, /* detailInfo */ Watch) => js.Any): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
