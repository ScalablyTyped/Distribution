package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

