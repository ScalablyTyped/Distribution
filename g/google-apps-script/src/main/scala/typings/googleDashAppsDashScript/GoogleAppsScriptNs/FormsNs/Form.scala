package typings.googleDashAppsDashScript.GoogleAppsScriptNs.FormsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Date
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
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
  def addEditor(emailAddress: String): Form = js.native
  def addEditor(user: User): Form = js.native
  def addEditors(emailAddresses: js.Array[String]): Form = js.native
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
  def canEditResponse(): Boolean = js.native
  def collectsEmail(): Boolean = js.native
  def createResponse(): FormResponse = js.native
  def deleteAllResponses(): Form = js.native
  def deleteItem(index: Integer): Unit = js.native
  def deleteItem(item: Item): Unit = js.native
  def deleteResponse(responseId: String): Form = js.native
  def getConfirmationMessage(): String = js.native
  def getCustomClosedFormMessage(): String = js.native
  def getDescription(): String = js.native
  def getDestinationId(): String = js.native
  def getDestinationType(): DestinationType = js.native
  def getEditUrl(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): String = js.native
  def getItemById(id: Integer): Item = js.native
  def getItems(): js.Array[Item] = js.native
  def getItems(itemType: ItemType): js.Array[Item] = js.native
  def getPublishedUrl(): String = js.native
  def getResponse(responseId: String): FormResponse = js.native
  def getResponses(): js.Array[FormResponse] = js.native
  def getResponses(timestamp: Date): js.Array[FormResponse] = js.native
  def getShuffleQuestions(): Boolean = js.native
  def getSummaryUrl(): String = js.native
  def getTitle(): String = js.native
  def hasLimitOneResponsePerUser(): Boolean = js.native
  def hasProgressBar(): Boolean = js.native
  def hasRespondAgainLink(): Boolean = js.native
  def isAcceptingResponses(): Boolean = js.native
  def isPublishingSummary(): Boolean = js.native
  def isQuiz(): Boolean = js.native
  def moveItem(from: Integer, to: Integer): Item = js.native
  def moveItem(item: Item, toIndex: Integer): Item = js.native
  def removeDestination(): Form = js.native
  def removeEditor(emailAddress: String): Form = js.native
  def removeEditor(user: User): Form = js.native
  def requiresLogin(): Boolean = js.native
  def setAcceptingResponses(enabled: Boolean): Form = js.native
  def setAllowResponseEdits(enabled: Boolean): Form = js.native
  def setCollectEmail(collect: Boolean): Form = js.native
  def setConfirmationMessage(message: String): Form = js.native
  def setCustomClosedFormMessage(message: String): Form = js.native
  def setDescription(description: String): Form = js.native
  def setDestination(`type`: DestinationType, id: String): Form = js.native
  def setIsQuiz(enabled: Boolean): Form = js.native
  def setLimitOneResponsePerUser(enabled: Boolean): Form = js.native
  def setProgressBar(enabled: Boolean): Form = js.native
  def setPublishingSummary(enabled: Boolean): Form = js.native
  def setRequireLogin(requireLogin: Boolean): Form = js.native
  def setShowLinkToRespondAgain(enabled: Boolean): Form = js.native
  def setShuffleQuestions(shuffle: Boolean): Form = js.native
  def setTitle(title: String): Form = js.native
  def shortenFormUrl(url: String): String = js.native
  def submitGrades(responses: js.Array[FormResponse]): Form = js.native
}

