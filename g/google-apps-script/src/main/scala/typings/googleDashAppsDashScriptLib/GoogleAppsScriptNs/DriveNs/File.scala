package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  def addCommenter(emailAddress: java.lang.String): File = js.native
  def addCommenter(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def addCommenters(emailAddresses: js.Array[java.lang.String]): File = js.native
  def addEditor(emailAddress: java.lang.String): File = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): File = js.native
  def addViewer(emailAddress: java.lang.String): File = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): File = js.native
  def getAccess(email: java.lang.String): Permission = js.native
  def getAccess(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Permission = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getDateCreated(): stdLib.Date = js.native
  def getDescription(): java.lang.String = js.native
  def getDownloadUrl(): java.lang.String = js.native
  def getEditors(): js.Array[User] = js.native
  def getId(): java.lang.String = js.native
  def getLastUpdated(): stdLib.Date = js.native
  def getMimeType(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getOwner(): User = js.native
  def getParents(): FolderIterator = js.native
  def getSharingAccess(): Access = js.native
  def getSharingPermission(): Permission = js.native
  def getSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getThumbnail(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[User] = js.native
  def isShareableByEditors(): scala.Boolean = js.native
  def isStarred(): scala.Boolean = js.native
  def isTrashed(): scala.Boolean = js.native
  def makeCopy(): File = js.native
  def makeCopy(destination: Folder): File = js.native
  def makeCopy(name: java.lang.String): File = js.native
  def makeCopy(name: java.lang.String, destination: Folder): File = js.native
  def removeCommenter(emailAddress: java.lang.String): File = js.native
  def removeCommenter(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def removeEditor(emailAddress: java.lang.String): File = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def removeViewer(emailAddress: java.lang.String): File = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def revokePermissions(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def revokePermissions(user: java.lang.String): File = js.native
  def setContent(content: java.lang.String): File = js.native
  def setDescription(description: java.lang.String): File = js.native
  def setName(name: java.lang.String): File = js.native
  def setOwner(emailAddress: java.lang.String): File = js.native
  def setOwner(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): File = js.native
  def setShareableByEditors(shareable: scala.Boolean): File = js.native
  def setSharing(accessType: Access, permissionType: Permission): File = js.native
  def setStarred(starred: scala.Boolean): File = js.native
  def setTrashed(trashed: scala.Boolean): File = js.native
}

