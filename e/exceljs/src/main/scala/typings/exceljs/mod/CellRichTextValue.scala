package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellRichTextValue extends _CellValue {
  
  var richText: js.Array[RichText] = js.native
}
object CellRichTextValue {
  
  @scala.inline
  def apply(richText: js.Array[RichText]): CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRichTextValue]
  }
  
  @scala.inline
  implicit class CellRichTextValueMutableBuilder[Self <: CellRichTextValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRichText(value: js.Array[RichText]): Self = StObject.set(x, "richText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextVarargs(value: RichText*): Self = StObject.set(x, "richText", js.Array(value :_*))
  }
}
