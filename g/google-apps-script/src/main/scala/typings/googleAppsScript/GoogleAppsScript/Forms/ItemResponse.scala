package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to one question item within a form. Item responses can be accessed from FormResponse and created from any Item that asks the respondent to answer a question.
  *
  *     // Open a form by ID and log the responses to each question.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var formResponses = form.getResponses();
  *     for (var i = 0; i < formResponses.length; i++) {
  *       var formResponse = formResponses[i];
  *       var itemResponses = formResponse.getItemResponses();
  *       for (var j = 0; j < itemResponses.length; j++) {
  *         var itemResponse = itemResponses[j];
  *         Logger.log('Response #%s to the question "%s" was "%s"',
  *             (i + 1).toString(),
  *             itemResponse.getItem().getTitle(),
  *             itemResponse.getResponse());
  *       }
  *     }
  */
trait ItemResponse extends StObject {
  
  def getFeedback(): QuizFeedback
  
  def getItem(): Item
  
  def getResponse(): (js.Array[js.Array[String] | String]) | String
  
  def getScore(): Double
  
  def setFeedback(feedback: Any): ItemResponse
  
  def setScore(score: Any): ItemResponse
}
object ItemResponse {
  
  inline def apply(
    getFeedback: () => QuizFeedback,
    getItem: () => Item,
    getResponse: () => (js.Array[js.Array[String] | String]) | String,
    getScore: () => Double,
    setFeedback: Any => ItemResponse,
    setScore: Any => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
    inline def setGetFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getFeedback", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: () => Item): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
    
    inline def setGetResponse(value: () => (js.Array[js.Array[String] | String]) | String): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
    
    inline def setGetScore(value: () => Double): Self = StObject.set(x, "getScore", js.Any.fromFunction0(value))
    
    inline def setSetFeedback(value: Any => ItemResponse): Self = StObject.set(x, "setFeedback", js.Any.fromFunction1(value))
    
    inline def setSetScore(value: Any => ItemResponse): Self = StObject.set(x, "setScore", js.Any.fromFunction1(value))
  }
}
