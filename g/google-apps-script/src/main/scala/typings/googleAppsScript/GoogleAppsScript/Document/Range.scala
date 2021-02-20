package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range of elements in a document. The user's selection is represented as a Range, among
  * other uses. Scripts can only access the selection of the user who is running the script, and only
  * if the script is bound to the document.
  *
  *     // Bold all selected text.
  *     var selection = DocumentApp.getActiveDocument().getSelection();
  *     if (selection) {
  *       var elements = selection.getRangeElements();
  *       for (var i = 0; i < elements.length; i++) {
  *         var element = elements[i];
  *
  *         // Only modify elements that can be edited as text; skip images and other non-text elements.
  *         if (element.getElement().editAsText) {
  *           var text = element.getElement().editAsText();
  *
  *           // Bold the selected part of the element, or the full element if it's completely selected.
  *           if (element.isPartial()) {
  *             text.setBold(element.getStartOffset(), element.getEndOffsetInclusive(), true);
  *           } else {
  *             text.setBold(true);
  *           }
  *         }
  *       }
  *     }
  */
@js.native
trait Range extends StObject {
  
  def getRangeElements(): js.Array[RangeElement] = js.native
  
  /** @deprecated DO NOT USE */ def getSelectedElements(): js.Array[RangeElement] = js.native
}
object Range {
  
  @scala.inline
  def apply(getRangeElements: () => js.Array[RangeElement], getSelectedElements: () => js.Array[RangeElement]): Range = {
    val __obj = js.Dynamic.literal(getRangeElements = js.Any.fromFunction0(getRangeElements), getSelectedElements = js.Any.fromFunction0(getSelectedElements))
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRangeElements(value: () => js.Array[RangeElement]): Self = StObject.set(x, "getRangeElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedElements(value: () => js.Array[RangeElement]): Self = StObject.set(x, "getSelectedElements", js.Any.fromFunction0(value))
  }
}
