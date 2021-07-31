package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to choose one option from a numbered sequence of radio
  * buttons. Items can be accessed or created from a Form. When used in a quiz, these items
  * are graded.
  *
  *     // Open a form by ID and add a new scale item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addScaleItem();
  *     item.setTitle('Pick a number between 1 and 10')
  *         .setBounds(1, 10);
  */
trait ScaleItem extends StObject {
  
  def createResponse(response: Integer): ItemResponse
  
  def duplicate(): ScaleItem
  
  def getGeneralFeedback(): QuizFeedback
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getLeftLabel(): String
  
  def getLowerBound(): Integer
  
  def getPoints(): Integer
  
  def getRightLabel(): String
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def getUpperBound(): Integer
  
  def isRequired(): Boolean
  
  def setBounds(lower: Integer, upper: Integer): ScaleItem
  
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem
  
  def setHelpText(text: String): ScaleItem
  
  def setLabels(lower: String, upper: String): ScaleItem
  
  def setPoints(points: Integer): ScaleItem
  
  def setRequired(enabled: Boolean): ScaleItem
  
  def setTitle(title: String): ScaleItem
}
object ScaleItem {
  
  @scala.inline
  def apply(
    createResponse: Integer => ItemResponse,
    duplicate: () => ScaleItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getLeftLabel: () => String,
    getLowerBound: () => Integer,
    getPoints: () => Integer,
    getRightLabel: () => String,
    getTitle: () => String,
    getType: () => ItemType,
    getUpperBound: () => Integer,
    isRequired: () => Boolean,
    setBounds: (Integer, Integer) => ScaleItem,
    setGeneralFeedback: QuizFeedback => ScaleItem,
    setHelpText: String => ScaleItem,
    setLabels: (String, String) => ScaleItem,
    setPoints: Integer => ScaleItem,
    setRequired: Boolean => ScaleItem,
    setTitle: String => ScaleItem
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getLeftLabel = js.Any.fromFunction0(getLeftLabel), getLowerBound = js.Any.fromFunction0(getLowerBound), getPoints = js.Any.fromFunction0(getPoints), getRightLabel = js.Any.fromFunction0(getRightLabel), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getUpperBound = js.Any.fromFunction0(getUpperBound), isRequired = js.Any.fromFunction0(isRequired), setBounds = js.Any.fromFunction2(setBounds), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setLabels = js.Any.fromFunction2(setLabels), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ScaleItem]
  }
  
  @scala.inline
  implicit class ScaleItemMutableBuilder[Self <: ScaleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateResponse(value: Integer => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => ScaleItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getGeneralFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLeftLabel(value: () => String): Self = StObject.set(x, "getLeftLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowerBound(value: () => Integer): Self = StObject.set(x, "getLowerBound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoints(value: () => Integer): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRightLabel(value: () => String): Self = StObject.set(x, "getRightLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpperBound(value: () => Integer): Self = StObject.set(x, "getUpperBound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBounds(value: (Integer, Integer) => ScaleItem): Self = StObject.set(x, "setBounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => ScaleItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => ScaleItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabels(value: (String, String) => ScaleItem): Self = StObject.set(x, "setLabels", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPoints(value: Integer => ScaleItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => ScaleItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => ScaleItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
