package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientDocumentPreviewTab extends StObject {
  
  var active: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var model: Any
  
  var template: String
  
  var text: String
  
  var visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object ASPxClientDocumentPreviewTab {
  
  inline def apply(
    active: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    model: Any,
    template: String,
    text: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): ASPxClientDocumentPreviewTab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDocumentPreviewTab]
  }
  
  extension [Self <: ASPxClientDocumentPreviewTab](x: Self) {
    
    inline def setActive(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setVisible(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
