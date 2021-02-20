package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoExpandAll extends StObject {
  
  var autoExpandAll: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _])
  ] = js.native
}
object AutoExpandAll {
  
  @scala.inline
  def apply(): AutoExpandAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExpandAll]
  }
  
  @scala.inline
  implicit class AutoExpandAllMutableBuilder[Self <: AutoExpandAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setTemplate(value: template | (js.Function2[/* detailElement */ dxElement, /* detailInfo */ Watch, _])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction2(value: (/* detailElement */ dxElement, /* detailInfo */ Watch) => _): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
