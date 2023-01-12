package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerEditingField extends StObject {
  
  var editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  
  def editorName(): String
  
  def groupID(): String
  
  def id(): String
  
  def pageIndex(): Double
  
  var readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object ASPxClientWebDocumentViewerEditingField {
  
  inline def apply(
    editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    editorName: () => String,
    groupID: () => String,
    id: () => String,
    pageIndex: () => Double,
    readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): ASPxClientWebDocumentViewerEditingField = {
    val __obj = js.Dynamic.literal(editValue = editValue.asInstanceOf[js.Any], editorName = js.Any.fromFunction0(editorName), groupID = js.Any.fromFunction0(groupID), id = js.Any.fromFunction0(id), pageIndex = js.Any.fromFunction0(pageIndex), readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientWebDocumentViewerEditingField] (val x: Self) extends AnyVal {
    
    inline def setEditValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "editValue", value.asInstanceOf[js.Any])
    
    inline def setEditorName(value: () => String): Self = StObject.set(x, "editorName", js.Any.fromFunction0(value))
    
    inline def setGroupID(value: () => String): Self = StObject.set(x, "groupID", js.Any.fromFunction0(value))
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setPageIndex(value: () => Double): Self = StObject.set(x, "pageIndex", js.Any.fromFunction0(value))
    
    inline def setReadOnly(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
