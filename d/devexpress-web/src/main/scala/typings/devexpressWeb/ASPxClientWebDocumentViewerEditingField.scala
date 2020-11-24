package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxClientWebDocumentViewerEditingField extends js.Object {
  
  var editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any = js.native
  
  def editorName(): String = js.native
  
  def groupID(): String = js.native
  
  def id(): String = js.native
  
  def pageIndex(): Double = js.native
  
  var readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
}
object ASPxClientWebDocumentViewerEditingField {
  
  @scala.inline
  def apply(
    editValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any,
    editorName: () => String,
    groupID: () => String,
    id: () => String,
    pageIndex: () => Double,
    readOnly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ): ASPxClientWebDocumentViewerEditingField = {
    val __obj = js.Dynamic.literal(editValue = editValue.asInstanceOf[js.Any], editorName = js.Any.fromFunction0(editorName), groupID = js.Any.fromFunction0(groupID), id = js.Any.fromFunction0(id), pageIndex = js.Any.fromFunction0(pageIndex), readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingField]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerEditingFieldOps[Self <: ASPxClientWebDocumentViewerEditingField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEditValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ js.Any
    ): Self = this.set("editValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorName(value: () => String): Self = this.set("editorName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupID(value: () => String): Self = this.set("groupID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: () => String): Self = this.set("id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPageIndex(value: () => Double): Self = this.set("pageIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadOnly(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("readOnly", value.asInstanceOf[js.Any])
  }
}
