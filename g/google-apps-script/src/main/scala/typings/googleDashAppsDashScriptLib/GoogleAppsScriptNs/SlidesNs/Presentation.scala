package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presentation extends js.Object {
  def addEditor(emailAddress: java.lang.String): Presentation = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Presentation = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Presentation = js.native
  def addViewer(emailAddress: java.lang.String): Presentation = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Presentation = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): Presentation = js.native
  def appendSlide(): Slide = js.native
  def appendSlide(layout: Layout): Slide = js.native
  def appendSlide(predefinedLayout: PredefinedLayout): Slide = js.native
  def appendSlide(slide: Slide): Slide = js.native
  def appendSlide(slide: Slide, linkingMode: SlideLinkingMode): Slide = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getId(): java.lang.String = js.native
  def getLayouts(): js.Array[Layout] = js.native
  def getMasters(): js.Array[Master] = js.native
  def getName(): java.lang.String = js.native
  def getNotesMaster(): NotesMaster = js.native
  def getNotesPageHeight(): scala.Double = js.native
  def getNotesPageWidth(): scala.Double = js.native
  def getPageElementById(id: java.lang.String): PageElement = js.native
  def getPageHeight(): scala.Double = js.native
  def getPageWidth(): scala.Double = js.native
  def getSelection(): Selection = js.native
  def getSlideById(id: java.lang.String): Slide = js.native
  def getSlides(): js.Array[Slide] = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def insertSlide(insertionIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Slide = js.native
  def insertSlide(insertionIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, layout: Layout): Slide = js.native
  def insertSlide(
    insertionIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    predefinedLayout: PredefinedLayout
  ): Slide = js.native
  def insertSlide(insertionIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, slide: Slide): Slide = js.native
  def insertSlide(
    insertionIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    slide: Slide,
    linkingMode: SlideLinkingMode
  ): Slide = js.native
  def removeEditor(emailAddress: java.lang.String): Presentation = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Presentation = js.native
  def removeViewer(emailAddress: java.lang.String): Presentation = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Presentation = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String, matchCase: scala.Boolean): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def saveAndClose(): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
}

