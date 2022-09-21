package typings.exceljs.mod

import typings.exceljs.anon.PartialCommentMargins
import typings.exceljs.anon.PartialCommentProtection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var editAs: js.UndefOr[CommentEditAs] = js.undefined
  
  var margins: js.UndefOr[PartialCommentMargins] = js.undefined
  
  var protection: js.UndefOr[PartialCommentProtection] = js.undefined
  
  var texts: js.UndefOr[js.Array[RichText]] = js.undefined
}
object Comment {
  
  inline def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setEditAs(value: CommentEditAs): Self = StObject.set(x, "editAs", value.asInstanceOf[js.Any])
    
    inline def setEditAsUndefined: Self = StObject.set(x, "editAs", js.undefined)
    
    inline def setMargins(value: PartialCommentMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setProtection(value: PartialCommentProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setTexts(value: js.Array[RichText]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTextsVarargs(value: RichText*): Self = StObject.set(x, "texts", js.Array(value*))
  }
}
