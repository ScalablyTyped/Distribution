package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to the form as a whole. A FormResponse can be used in three ways: to access
  * the answers submitted by a respondent (see getItemResponses()), to programmatically
  * submit a response to the form (see withItemResponse(response) and submit()), and to generate a URL for the form which pre-fills fields using the provided
  * answers. FormResponses can be created or accessed from a Form.
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
@js.native
trait FormResponse extends js.Object {
  
  def getEditResponseUrl(): String = js.native
  
  def getGradableItemResponses(): js.Array[ItemResponse] = js.native
  
  def getGradableResponseForItem(item: Item): ItemResponse = js.native
  
  def getId(): String = js.native
  
  def getItemResponses(): js.Array[ItemResponse] = js.native
  
  def getRespondentEmail(): String = js.native
  
  def getResponseForItem(item: Item): ItemResponse = js.native
  
  def getTimestamp(): Date = js.native
  
  def submit(): FormResponse = js.native
  
  def toPrefilledUrl(): String = js.native
  
  def withItemGrade(gradedResponse: ItemResponse): FormResponse = js.native
  
  def withItemResponse(response: ItemResponse): FormResponse = js.native
}
object FormResponse {
  
  @scala.inline
  def apply(
    getEditResponseUrl: () => String,
    getGradableItemResponses: () => js.Array[ItemResponse],
    getGradableResponseForItem: Item => ItemResponse,
    getId: () => String,
    getItemResponses: () => js.Array[ItemResponse],
    getRespondentEmail: () => String,
    getResponseForItem: Item => ItemResponse,
    getTimestamp: () => Date,
    submit: () => FormResponse,
    toPrefilledUrl: () => String,
    withItemGrade: ItemResponse => FormResponse,
    withItemResponse: ItemResponse => FormResponse
  ): FormResponse = {
    val __obj = js.Dynamic.literal(getEditResponseUrl = js.Any.fromFunction0(getEditResponseUrl), getGradableItemResponses = js.Any.fromFunction0(getGradableItemResponses), getGradableResponseForItem = js.Any.fromFunction1(getGradableResponseForItem), getId = js.Any.fromFunction0(getId), getItemResponses = js.Any.fromFunction0(getItemResponses), getRespondentEmail = js.Any.fromFunction0(getRespondentEmail), getResponseForItem = js.Any.fromFunction1(getResponseForItem), getTimestamp = js.Any.fromFunction0(getTimestamp), submit = js.Any.fromFunction0(submit), toPrefilledUrl = js.Any.fromFunction0(toPrefilledUrl), withItemGrade = js.Any.fromFunction1(withItemGrade), withItemResponse = js.Any.fromFunction1(withItemResponse))
    __obj.asInstanceOf[FormResponse]
  }
  
  @scala.inline
  implicit class FormResponseOps[Self <: FormResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEditResponseUrl(value: () => String): Self = this.set("getEditResponseUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGradableItemResponses(value: () => js.Array[ItemResponse]): Self = this.set("getGradableItemResponses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGradableResponseForItem(value: Item => ItemResponse): Self = this.set("getGradableResponseForItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemResponses(value: () => js.Array[ItemResponse]): Self = this.set("getItemResponses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRespondentEmail(value: () => String): Self = this.set("getRespondentEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponseForItem(value: Item => ItemResponse): Self = this.set("getResponseForItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTimestamp(value: () => Date): Self = this.set("getTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubmit(value: () => FormResponse): Self = this.set("submit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToPrefilledUrl(value: () => String): Self = this.set("toPrefilledUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithItemGrade(value: ItemResponse => FormResponse): Self = this.set("withItemGrade", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithItemResponse(value: ItemResponse => FormResponse): Self = this.set("withItemResponse", js.Any.fromFunction1(value))
  }
}
