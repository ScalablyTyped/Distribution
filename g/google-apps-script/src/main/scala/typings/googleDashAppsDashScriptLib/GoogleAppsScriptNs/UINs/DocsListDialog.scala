package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocsListDialog extends js.Object {
  def addCloseHandler(handler: Handler): DocsListDialog
  def addSelectionHandler(handler: Handler): DocsListDialog
  def addView(fileType: FileType): DocsListDialog
  def getId(): java.lang.String
  def getType(): java.lang.String
  def setDialogTitle(title: java.lang.String): DocsListDialog
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DocsListDialog
  def setInitialView(fileType: FileType): DocsListDialog
  def setMultiSelectEnabled(multiSelectEnabled: scala.Boolean): DocsListDialog
  def setOAuthToken(oAuthToken: java.lang.String): DocsListDialog
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DocsListDialog
  def showDocsPicker(): DocsListDialog
}

object DocsListDialog {
  @scala.inline
  def apply(
    addCloseHandler: Handler => DocsListDialog,
    addSelectionHandler: Handler => DocsListDialog,
    addView: FileType => DocsListDialog,
    getId: () => java.lang.String,
    getType: () => java.lang.String,
    setDialogTitle: java.lang.String => DocsListDialog,
    setHeight: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => DocsListDialog,
    setInitialView: FileType => DocsListDialog,
    setMultiSelectEnabled: scala.Boolean => DocsListDialog,
    setOAuthToken: java.lang.String => DocsListDialog,
    setWidth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => DocsListDialog,
    showDocsPicker: () => DocsListDialog
  ): DocsListDialog = {
    val __obj = js.Dynamic.literal(addCloseHandler = js.Any.fromFunction1(addCloseHandler), addSelectionHandler = js.Any.fromFunction1(addSelectionHandler), addView = js.Any.fromFunction1(addView), getId = js.Any.fromFunction0(getId), getType = js.Any.fromFunction0(getType), setDialogTitle = js.Any.fromFunction1(setDialogTitle), setHeight = js.Any.fromFunction1(setHeight), setInitialView = js.Any.fromFunction1(setInitialView), setMultiSelectEnabled = js.Any.fromFunction1(setMultiSelectEnabled), setOAuthToken = js.Any.fromFunction1(setOAuthToken), setWidth = js.Any.fromFunction1(setWidth), showDocsPicker = js.Any.fromFunction0(showDocsPicker))
  
    __obj.asInstanceOf[DocsListDialog]
  }
}

