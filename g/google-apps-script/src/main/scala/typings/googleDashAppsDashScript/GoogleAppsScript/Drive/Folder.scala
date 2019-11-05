package typings.googleDashAppsDashScript.GoogleAppsScript.Drive

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A folder in Google Drive. Folders can be accessed or created from DriveApp.
  *
  *     // Log the name of every folder in the user's Drive.
  *     var folders = DriveApp.getFolders();
  *     while (folders.hasNext()) {
  *       var folder = folders.next();
  *       Logger.log(folder.getName());
  *     }
  */
@js.native
trait Folder extends js.Object {
  def addEditor(emailAddress: String): Folder = js.native
  def addEditor(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def addEditors(emailAddresses: js.Array[String]): Folder = js.native
  def addFile(child: File): Folder = js.native
  def addFolder(child: Folder): Folder = js.native
  def addViewer(emailAddress: String): Folder = js.native
  def addViewer(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def addViewers(emailAddresses: js.Array[String]): Folder = js.native
  def createFile(blob: BlobSource): File = js.native
  def createFile(name: String, content: String): File = js.native
  def createFile(name: String, content: String, mimeType: String): File = js.native
  def createFolder(name: String): Folder = js.native
  def getAccess(email: String): Permission = js.native
  def getAccess(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Permission = js.native
  def getDateCreated(): Date = js.native
  def getDescription(): String = js.native
  def getEditors(): js.Array[User] = js.native
  def getFiles(): FileIterator = js.native
  def getFilesByName(name: String): FileIterator = js.native
  def getFilesByType(mimeType: String): FileIterator = js.native
  def getFolders(): FolderIterator = js.native
  def getFoldersByName(name: String): FolderIterator = js.native
  def getId(): String = js.native
  def getLastUpdated(): Date = js.native
  def getName(): String = js.native
  def getOwner(): User = js.native
  def getParents(): FolderIterator = js.native
  def getSharingAccess(): Access = js.native
  def getSharingPermission(): Permission = js.native
  def getSize(): Integer = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def isShareableByEditors(): Boolean = js.native
  def isStarred(): Boolean = js.native
  def isTrashed(): Boolean = js.native
  def removeEditor(emailAddress: String): Folder = js.native
  def removeEditor(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def removeFile(child: File): Folder = js.native
  def removeFolder(child: Folder): Folder = js.native
  def removeViewer(emailAddress: String): Folder = js.native
  def removeViewer(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def revokePermissions(user: String): Folder = js.native
  def revokePermissions(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def searchFiles(params: String): FileIterator = js.native
  def searchFolders(params: String): FolderIterator = js.native
  def setDescription(description: String): Folder = js.native
  def setName(name: String): Folder = js.native
  def setOwner(emailAddress: String): Folder = js.native
  def setOwner(user: typings.googleDashAppsDashScript.GoogleAppsScript.Base.User): Folder = js.native
  def setShareableByEditors(shareable: Boolean): Folder = js.native
  def setSharing(accessType: Access, permissionType: Permission): Folder = js.native
  def setStarred(starred: Boolean): Folder = js.native
  def setTrashed(trashed: Boolean): Folder = js.native
}

