package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to indicate a length of time. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new duration item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDurationItem();
  *     item.setTitle('How long can you hold your breath?');
  */
trait DurationItem extends StObject {
  
  def createResponse(hours: Integer, minutes: Integer, seconds: Integer): ItemResponse
  
  def duplicate(): DurationItem
  
  def getGeneralFeedback(): QuizFeedback
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getPoints(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def isRequired(): Boolean
  
  def setGeneralFeedback(feedback: QuizFeedback): DurationItem
  
  def setHelpText(text: String): DurationItem
  
  def setPoints(points: Integer): DurationItem
  
  def setRequired(enabled: Boolean): DurationItem
  
  def setTitle(title: String): DurationItem
}
object DurationItem {
  
  inline def apply(
    createResponse: (Integer, Integer, Integer) => ItemResponse,
    duplicate: () => DurationItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => DurationItem,
    setHelpText: String => DurationItem,
    setPoints: Integer => DurationItem,
    setRequired: Boolean => DurationItem,
    setTitle: String => DurationItem
  ): DurationItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction3(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[DurationItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationItem] (val x: Self) extends AnyVal {
    
    inline def setCreateResponse(value: (Integer, Integer, Integer) => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction3(value))
    
    inline def setDuplicate(value: () => DurationItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    inline def setGetGeneralFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getGeneralFeedback", js.Any.fromFunction0(value))
    
    inline def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetPoints(value: () => Integer): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    inline def setSetGeneralFeedback(value: QuizFeedback => DurationItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => DurationItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetPoints(value: Integer => DurationItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    inline def setSetRequired(value: Boolean => DurationItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => DurationItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
