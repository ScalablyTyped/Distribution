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

