package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A presentation.
  */
@js.native
trait Presentation extends js.Object {
  def addEditor(emailAddress: String): Presentation = js.native
  def addEditor(user: User): Presentation = js.native
  def addEditors(emailAddresses: js.Array[String]): Presentation = js.native
  def addViewer(emailAddress: String): Presentation = js.native
  def addViewer(user: User): Presentation = js.native
  def addViewers(emailAddresses: js.Array[String]): Presentation = js.native
  def appendSlide(): Slide = js.native
  def appendSlide(layout: Layout): Slide = js.native
  def appendSlide(predefinedLayout: PredefinedLayout): Slide = js.native
  def appendSlide(slide: Slide): Slide = js.native
  def appendSlide(slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): String = js.native
  def getLayouts(): js.Array[Layout] = js.native
  def getMasters(): js.Array[Master] = js.native
  def getName(): String = js.native
  def getNotesMaster(): NotesMaster = js.native
  def getNotesPageHeight(): Double = js.native
  def getNotesPageWidth(): Double = js.native
  def getPageElementById(id: String): PageElement = js.native
  def getPageHeight(): Double = js.native
  def getPageWidth(): Double = js.native
  def getSelection(): Selection = js.native
  def getSlideById(id: String): Slide = js.native
  def getSlides(): js.Array[Slide] = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def insertSlide(insertionIndex: Integer): Slide = js.native
  def insertSlide(insertionIndex: Integer, layout: Layout): Slide = js.native
  def insertSlide(insertionIndex: Integer, predefinedLayout: PredefinedLayout): Slide = js.native
  def insertSlide(insertionIndex: Integer, slide: Slide): Slide = js.native
  def insertSlide(insertionIndex: Integer, slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
  def removeEditor(emailAddress: String): Presentation = js.native
  def removeEditor(user: User): Presentation = js.native
  def removeViewer(emailAddress: String): Presentation = js.native
  def removeViewer(user: User): Presentation = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def saveAndClose(): Unit = js.native
  def setName(name: String): Unit = js.native
}

