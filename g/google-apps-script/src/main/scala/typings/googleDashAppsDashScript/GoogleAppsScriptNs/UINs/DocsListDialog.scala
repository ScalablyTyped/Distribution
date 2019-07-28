package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsListDialog extends js.Object {
  def addCloseHandler(handler: Handler): DocsListDialog
  def addSelectionHandler(handler: Handler): DocsListDialog
  def addView(fileType: FileType): DocsListDialog
  def getId(): String
  def getType(): String
  def setDialogTitle(title: String): DocsListDialog
  def setHeight(height: Integer): DocsListDialog
  def setInitialView(fileType: FileType): DocsListDialog
  def setMultiSelectEnabled(multiSelectEnabled: Boolean): DocsListDialog
  def setOAuthToken(oAuthToken: String): DocsListDialog
  def setWidth(width: Integer): DocsListDialog
  def showDocsPicker(): DocsListDialog
}

object DocsListDialog {
  @scala.inline
  def apply(
    addCloseHandler: Handler => DocsListDialog,
    addSelectionHandler: Handler => DocsListDialog,
    addView: FileType => DocsListDialog,
    getId: () => String,
    getType: () => String,
    setDialogTitle: String => DocsListDialog,
    setHeight: Integer => DocsListDialog,
    setInitialView: FileType => DocsListDialog,
    setMultiSelectEnabled: Boolean => DocsListDialog,
    setOAuthToken: String => DocsListDialog,
    setWidth: Integer => DocsListDialog,
    showDocsPicker: () => DocsListDialog
  ): DocsListDialog = {
    val __obj = js.Dynamic.literal(addCloseHandler = js.Any.fromFunction1(addCloseHandler), addSelectionHandler = js.Any.fromFunction1(addSelectionHandler), addView = js.Any.fromFunction1(addView), getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType), setDialogTitle = js.Any.fromFunction1(setDialogTitle), setHeight = js.Any.fromFunction1(setHeight), setInitialView = js.Any.fromFunction1(setInitialView), setMultiSelectEnabled = js.Any.fromFunction1(setMultiSelectEnabled), setOAuthToken = js.Any.fromFunction1(setOAuthToken), setWidth = js.Any.fromFunction1(setWidth), showDocsPicker = js.Any.fromFunction0(showDocsPicker))
  
    __obj.asInstanceOf[DocsListDialog]
  }
}

