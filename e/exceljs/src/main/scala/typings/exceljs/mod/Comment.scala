package typings.exceljs.mod

import typings.exceljs.anon.PartialCommentMargins
import typings.exceljs.anon.PartialCommentProtection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  var editAs: js.UndefOr[CommentEditAs] = js.native
  
  var margins: js.UndefOr[PartialCommentMargins] = js.native
  
  var protection: js.UndefOr[PartialCommentProtection] = js.native
  
  var texts: js.UndefOr[js.Array[RichText]] = js.native
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditAs(value: CommentEditAs): Self = StObject.set(x, "editAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditAsUndefined: Self = StObject.set(x, "editAs", js.undefined)
    
    @scala.inline
    def setMargins(value: PartialCommentMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    @scala.inline
    def setProtection(value: PartialCommentProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setTexts(value: js.Array[RichText]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setTextsVarargs(value: RichText*): Self = StObject.set(x, "texts", js.Array(value :_*))
  }
}
