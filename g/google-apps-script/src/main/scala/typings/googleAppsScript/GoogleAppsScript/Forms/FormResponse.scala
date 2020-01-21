package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait FormResponse extends js.Object {
  def getEditResponseUrl(): String
  def getGradableItemResponses(): js.Array[ItemResponse]
  def getGradableResponseForItem(item: Item): ItemResponse
  def getId(): String
  def getItemResponses(): js.Array[ItemResponse]
  def getRespondentEmail(): String
  def getResponseForItem(item: Item): ItemResponse
  def getTimestamp(): Date
  def submit(): FormResponse
  def toPrefilledUrl(): String
  def withItemGrade(gradedResponse: ItemResponse): FormResponse
  def withItemResponse(response: ItemResponse): FormResponse
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
}

