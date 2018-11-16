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

