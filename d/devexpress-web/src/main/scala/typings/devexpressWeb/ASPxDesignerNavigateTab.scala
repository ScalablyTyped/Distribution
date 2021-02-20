package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerNavigateTab extends StObject {
  
  var displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any = js.native
  
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  def refresh(): Unit = js.native
  
  var report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
  
  def resetIsModified(): Unit = js.native
  
  var undoEngine: ASPxDesignerUndoEngine = js.native
  
  var url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
}
object ASPxDesignerNavigateTab {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ASPxDesignerNavigateTabMutableBuilder[Self <: ASPxDesignerNavigateTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any
    ): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetIsModified(value: () => Unit): Self = StObject.set(x, "resetIsModified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoEngine(value: ASPxDesignerUndoEngine): Self = StObject.set(x, "undoEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
