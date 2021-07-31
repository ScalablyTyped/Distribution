package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to enter a single line of text. Items can be accessed
  * or created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTextItem();
  *     item.setTitle('What is your name?');
  */
trait TextItem extends StObject {
  
  def clearValidation(): TextItem
  
  def createResponse(response: String): ItemResponse
  
  def duplicate(): TextItem
  
  def getGeneralFeedback(): QuizFeedback
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getPoints(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def isRequired(): Boolean
  
  def setGeneralFeedback(feedback: QuizFeedback): TextItem
  
  def setHelpText(text: String): TextItem
  
  def setPoints(points: Integer): TextItem
  
  def setRequired(enabled: Boolean): TextItem
  
  def setTitle(title: String): TextItem
  
  def setValidation(validation: TextValidation): TextItem
}
object TextItem {
  
  @scala.inline
  def apply(
    clearValidation: () => TextItem,
    createResponse: String => ItemResponse,
    duplicate: () => TextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => TextItem,
    setHelpText: String => TextItem,
    setPoints: Integer => TextItem,
    setRequired: Boolean => TextItem,
    setTitle: String => TextItem,
    setValidation: TextValidation => TextItem
  ): TextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[TextItem]
  }
  
  @scala.inline
  implicit class TextItemMutableBuilder[Self <: TextItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearValidation(value: () => TextItem): Self = StObject.set(x, "clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: String => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => TextItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getGeneralFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoints(value: () => Integer): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => TextItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => TextItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: Integer => TextItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => TextItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => TextItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: TextValidation => TextItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
