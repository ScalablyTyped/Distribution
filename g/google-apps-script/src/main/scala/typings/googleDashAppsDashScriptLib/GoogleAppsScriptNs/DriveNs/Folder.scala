package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  def addEditor(emailAddress: java.lang.String): Folder = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Folder = js.native
  def addFile(child: File): Folder = js.native
  def addFolder(child: Folder): Folder = js.native
  def addViewer(emailAddress: java.lang.String): Folder = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): Folder = js.native
  def createFile(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): File = js.native
  def createFile(name: java.lang.String, content: java.lang.String): File = js.native
  def createFile(name: java.lang.String, content: java.lang.String, mimeType: java.lang.String): File = js.native
  def createFolder(name: java.lang.String): Folder = js.native
  def getAccess(email: java.lang.String): Permission = js.native
  def getAccess(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Permission = js.native
  def getDateCreated(): stdLib.Date = js.native
  def getDescription(): java.lang.String = js.native
  def getEditors(): js.Array[User] = js.native
  def getFiles(): FileIterator = js.native
  def getFilesByName(name: java.lang.String): FileIterator = js.native
  def getFilesByType(mimeType: java.lang.String): FileIterator = js.native
  def getFolders(): FolderIterator = js.native
  def getFoldersByName(name: java.lang.String): FolderIterator = js.native
  def getId(): java.lang.String = js.native
  def getLastUpdated(): stdLib.Date = js.native
  def getName(): java.lang.String = js.native
  def getOwner(): User = js.native
  def getParents(): FolderIterator = js.native
  def getSharingAccess(): Access = js.native
  def getSharingPermission(): Permission = js.native
  def getSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[User] = js.native
  def isShareableByEditors(): scala.Boolean = js.native
  def isStarred(): scala.Boolean = js.native
  def isTrashed(): scala.Boolean = js.native
  def removeEditor(emailAddress: java.lang.String): Folder = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def removeFile(child: File): Folder = js.native
  def removeFolder(child: Folder): Folder = js.native
  def removeViewer(emailAddress: java.lang.String): Folder = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def revokePermissions(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def revokePermissions(user: java.lang.String): Folder = js.native
  def searchFiles(params: java.lang.String): FileIterator = js.native
  def searchFolders(params: java.lang.String): FolderIterator = js.native
  def setDescription(description: java.lang.String): Folder = js.native
  def setName(name: java.lang.String): Folder = js.native
  def setOwner(emailAddress: java.lang.String): Folder = js.native
  def setOwner(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Folder = js.native
  def setShareableByEditors(shareable: scala.Boolean): Folder = js.native
  def setSharing(accessType: Access, permissionType: Permission): Folder = js.native
  def setStarred(starred: scala.Boolean): Folder = js.native
  def setTrashed(trashed: scala.Boolean): Folder = js.native
}

