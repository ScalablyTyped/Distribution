package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerNavigateTab extends StObject {
  
  var displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any
  
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  def refresh(): Unit
  
  var report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  
  def resetIsModified(): Unit
  
  var undoEngine: ASPxDesignerUndoEngine
  
  var url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
}
object ASPxDesignerNavigateTab {
  
  inline def apply(
    displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any,
    isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    refresh: () => Unit,
    report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    resetIsModified: () => Unit,
    undoEngine: ASPxDesignerUndoEngine,
    url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  ): ASPxDesignerNavigateTab = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), report = report.asInstanceOf[js.Any], resetIsModified = js.Any.fromFunction0(resetIsModified), undoEngine = undoEngine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerNavigateTab]
  }
  
  extension [Self <: ASPxDesignerNavigateTab](x: Self) {
    
    inline def setDisplayName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any
    ): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setReport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setResetIsModified(value: () => Unit): Self = StObject.set(x, "resetIsModified", js.Any.fromFunction0(value))
    
    inline def setUndoEngine(value: ASPxDesignerUndoEngine): Self = StObject.set(x, "undoEngine", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
