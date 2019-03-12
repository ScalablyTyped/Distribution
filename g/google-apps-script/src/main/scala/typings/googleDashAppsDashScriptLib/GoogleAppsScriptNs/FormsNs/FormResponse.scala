package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormResponse extends js.Object {
  def getEditResponseUrl(): java.lang.String
  def getGradableItemResponses(): js.Array[ItemResponse]
  def getGradableResponseForItem(item: Item): ItemResponse
  def getId(): java.lang.String
  def getItemResponses(): js.Array[ItemResponse]
  def getRespondentEmail(): java.lang.String
  def getResponseForItem(item: Item): ItemResponse
  def getTimestamp(): stdLib.Date
  def submit(): FormResponse
  def toPrefilledUrl(): java.lang.String
  def withItemGrade(gradedResponse: ItemResponse): FormResponse
  def withItemResponse(response: ItemResponse): FormResponse
}

object FormResponse {
  @scala.inline
  def apply(
    getEditResponseUrl: () => java.lang.String,
    getGradableItemResponses: () => js.Array[ItemResponse],
    getGradableResponseForItem: Item => ItemResponse,
    getId: () => java.lang.String,
    getItemResponses: () => js.Array[ItemResponse],
    getRespondentEmail: () => java.lang.String,
    getResponseForItem: Item => ItemResponse,
    getTimestamp: () => stdLib.Date,
    submit: () => FormResponse,
    toPrefilledUrl: () => java.lang.String,
    withItemGrade: ItemResponse => FormResponse,
    withItemResponse: ItemResponse => FormResponse
  ): FormResponse = {
    val __obj = js.Dynamic.literal(getEditResponseUrl = js.Any.fromFunction0(getEditResponseUrl), getGradableItemResponses = js.Any.fromFunction0(getGradableItemResponses), getGradableResponseForItem = js.Any.fromFunction1(getGradableResponseForItem), getId = js.Any.fromFunction0(getId), getItemResponses = js.Any.fromFunction0(getItemResponses), getRespondentEmail = js.Any.fromFunction0(getRespondentEmail), getResponseForItem = js.Any.fromFunction1(getResponseForItem), getTimestamp = js.Any.fromFunction0(getTimestamp), submit = js.Any.fromFunction0(submit), toPrefilledUrl = js.Any.fromFunction0(toPrefilledUrl), withItemGrade = js.Any.fromFunction1(withItemGrade), withItemResponse = js.Any.fromFunction1(withItemResponse))
  
    __obj.asInstanceOf[FormResponse]
  }
}

