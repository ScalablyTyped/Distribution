package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single choice associated with a type of Item that supports choices, like CheckboxItem, ListItem, or MultipleChoiceItem.
  *
  *     // Create a new form and add a multiple-choice item.
  *     var form = FormApp.create('Form Name');
  *     var item = form.addMultipleChoiceItem();
  *     item.setTitle('Do you prefer cats or dogs?')
  *         .setChoices([
  *             item.createChoice('Cats', FormApp.PageNavigationType.CONTINUE),
  *             item.createChoice('Dogs', FormApp.PageNavigationType.RESTART)
  *         ]);
  *
  *     // Add another page because navigation has no effect on the last page.
  *     form.addPageBreakItem().setTitle('You chose well!');
  *
  *     // Log the navigation types that each choice results in.
  *     var choices = item.getChoices();
  *     for (var i = 0; i < choices.length; i++) {
  *     Logger.log('If the respondent chooses "%s", the form will %s.',
  *                choices[i].getValue(),
  *                choices[i].getPageNavigationType());
  *     }
  */
trait Choice extends StObject {
  
  def getGotoPage(): PageBreakItem
  
  def getPageNavigationType(): PageNavigationType
  
  def getValue(): String
  
  def isCorrectAnswer(): Boolean
}
object Choice {
  
  inline def apply(
    getGotoPage: () => PageBreakItem,
    getPageNavigationType: () => PageNavigationType,
    getValue: () => String,
    isCorrectAnswer: () => Boolean
  ): Choice = {
    val __obj = js.Dynamic.literal(getGotoPage = js.Any.fromFunction0(getGotoPage), getPageNavigationType = js.Any.fromFunction0(getPageNavigationType), getValue = js.Any.fromFunction0(getValue), isCorrectAnswer = js.Any.fromFunction0(isCorrectAnswer))
    __obj.asInstanceOf[Choice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
    
    inline def setGetGotoPage(value: () => PageBreakItem): Self = StObject.set(x, "getGotoPage", js.Any.fromFunction0(value))
    
    inline def setGetPageNavigationType(value: () => PageNavigationType): Self = StObject.set(x, "getPageNavigationType", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setIsCorrectAnswer(value: () => Boolean): Self = StObject.set(x, "isCorrectAnswer", js.Any.fromFunction0(value))
  }
}
