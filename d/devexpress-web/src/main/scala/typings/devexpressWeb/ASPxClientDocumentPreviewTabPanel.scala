package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientDocumentPreviewTabPanel extends StObject {
  
  var collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  var tabs: js.Array[ASPxClientDocumentPreviewTab] = js.native
  
  var width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
}
object ASPxClientDocumentPreviewTabPanel {
  
  @scala.inline
  def apply(
    collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    tabs: js.Array[ASPxClientDocumentPreviewTab],
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
  ): ASPxClientDocumentPreviewTabPanel = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDocumentPreviewTabPanel]
  }
  
  @scala.inline
  implicit class ASPxClientDocumentPreviewTabPanelMutableBuilder[Self <: ASPxClientDocumentPreviewTabPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabs(value: js.Array[ASPxClientDocumentPreviewTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: ASPxClientDocumentPreviewTab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    
    @scala.inline
    def setWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
