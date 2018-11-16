package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  def addCheckboxGridItem(): CheckboxGridItem = js.native
  def addCheckboxItem(): CheckboxItem = js.native
  def addDateItem(): DateItem = js.native
  def addDateTimeItem(): DateTimeItem = js.native
  def addDurationItem(): DurationItem = js.native
  def addEditor(emailAddress: java.lang.String): Form = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Form = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Form = js.native
  def addGridItem(): GridItem = js.native
  def addImageItem(): ImageItem = js.native
  def addListItem(): ListItem = js.native
  def addMultipleChoiceItem(): MultipleChoiceItem = js.native
  def addPageBreakItem(): PageBreakItem = js.native
  def addParagraphTextItem(): ParagraphTextItem = js.native
  def addScaleItem(): ScaleItem = js.native
  def addSectionHeaderItem(): SectionHeaderItem = js.native
  def addTextItem(): TextItem = js.native
  def addTimeItem(): TimeItem = js.native
  def addVideoItem(): VideoItem = js.native
  def canEditResponse(): scala.Boolean = js.native
  def collectsEmail(): scala.Boolean = js.native
  def createResponse(): FormResponse = js.native
  def deleteAllResponses(): Form = js.native
  def deleteItem(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def deleteItem(item: Item): scala.Unit = js.native
  def deleteResponse(responseId: java.lang.String): Form = js.native
  def getConfirmationMessage(): java.lang.String = js.native
  def getCustomClosedFormMessage(): java.lang.String = js.native
  def getDescription(): java.lang.String = js.native
  def getDestinationId(): java.lang.String = js.native
  def getDestinationType(): DestinationType = js.native
  def getEditUrl(): java.lang.String = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getId(): java.lang.String = js.native
  def getItemById(id: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Item = js.native
  def getItems(): js.Array[Item] = js.native
  def getItems(itemType: ItemType): js.Array[Item] = js.native
  def getPublishedUrl(): java.lang.String = js.native
  def getResponse(responseId: java.lang.String): FormResponse = js.native
  def getResponses(): js.Array[FormResponse] = js.native
  def getResponses(timestamp: stdLib.Date): js.Array[FormResponse] = js.native
  def getShuffleQuestions(): scala.Boolean = js.native
  def getSummaryUrl(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def hasLimitOneResponsePerUser(): scala.Boolean = js.native
  def hasProgressBar(): scala.Boolean = js.native
  def hasRespondAgainLink(): scala.Boolean = js.native
  def isAcceptingResponses(): scala.Boolean = js.native
  def isPublishingSummary(): scala.Boolean = js.native
  def isQuiz(): scala.Boolean = js.native
  def moveItem(
    from: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    to: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Item = js.native
  def moveItem(item: Item, toIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Item = js.native
  def removeDestination(): Form = js.native
  def removeEditor(emailAddress: java.lang.String): Form = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Form = js.native
  def requiresLogin(): scala.Boolean = js.native
  def setAcceptingResponses(enabled: scala.Boolean): Form = js.native
  def setAllowResponseEdits(enabled: scala.Boolean): Form = js.native
  def setCollectEmail(collect: scala.Boolean): Form = js.native
  def setConfirmationMessage(message: java.lang.String): Form = js.native
  def setCustomClosedFormMessage(message: java.lang.String): Form = js.native
  def setDescription(description: java.lang.String): Form = js.native
  def setDestination(`type`: DestinationType, id: java.lang.String): Form = js.native
  def setIsQuiz(enabled: scala.Boolean): Form = js.native
  def setLimitOneResponsePerUser(enabled: scala.Boolean): Form = js.native
  def setProgressBar(enabled: scala.Boolean): Form = js.native
  def setPublishingSummary(enabled: scala.Boolean): Form = js.native
  def setRequireLogin(requireLogin: scala.Boolean): Form = js.native
  def setShowLinkToRespondAgain(enabled: scala.Boolean): Form = js.native
  def setShuffleQuestions(shuffle: scala.Boolean): Form = js.native
  def setTitle(title: java.lang.String): Form = js.native
  def shortenFormUrl(url: java.lang.String): java.lang.String = js.native
  def submitGrades(responses: js.Array[FormResponse]): Form = js.native
}

