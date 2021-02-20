package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to enter a block of text. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new paragraph text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addParagraphTextItem();
  *     item.setTitle('What is your address?');
  */
@js.native
trait ParagraphTextItem extends StObject {
  
  def clearValidation(): ParagraphTextItem = js.native
  
  def createResponse(response: String): ItemResponse = js.native
  
  def duplicate(): ParagraphTextItem = js.native
  
  def getGeneralFeedback(): QuizFeedback = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getPoints(): Integer = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def isRequired(): Boolean = js.native
  
  def setGeneralFeedback(feedback: QuizFeedback): ParagraphTextItem = js.native
  
  def setHelpText(text: String): ParagraphTextItem = js.native
  
  def setPoints(points: Integer): ParagraphTextItem = js.native
  
  def setRequired(enabled: Boolean): ParagraphTextItem = js.native
  
  def setTitle(title: String): ParagraphTextItem = js.native
  
  def setValidation(validation: ParagraphTextValidation): ParagraphTextItem = js.native
}
object ParagraphTextItem {
  
  @scala.inline
  def apply(
    clearValidation: () => ParagraphTextItem,
    createResponse: String => ItemResponse,
    duplicate: () => ParagraphTextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => ParagraphTextItem,
    setHelpText: String => ParagraphTextItem,
    setPoints: Integer => ParagraphTextItem,
    setRequired: Boolean => ParagraphTextItem,
    setTitle: String => ParagraphTextItem,
    setValidation: ParagraphTextValidation => ParagraphTextItem
  ): ParagraphTextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[ParagraphTextItem]
  }
  
  @scala.inline
  implicit class ParagraphTextItemMutableBuilder[Self <: ParagraphTextItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearValidation(value: () => ParagraphTextItem): Self = StObject.set(x, "clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: String => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => ParagraphTextItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
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
    def setSetGeneralFeedback(value: QuizFeedback => ParagraphTextItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => ParagraphTextItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: Integer => ParagraphTextItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => ParagraphTextItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => ParagraphTextItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: ParagraphTextValidation => ParagraphTextItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
