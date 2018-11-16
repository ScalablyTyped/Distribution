package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveApp extends js.Object {
  var Access: js.Any = js.native
  var Permission: js.Any = js.native
  /**
         * Adds the given file to the root of the user's Drive.
         * This method does not move the file out of its existing parent folder;
         * a file can have more than one parent simultaneously.
         */
  def addFile(child: File): Folder = js.native
  /**
         * Adds the given folder to the root of the user's Drive.
         * This method does not move the folder out of its existing parent folder;
         * a folder can have more than one parent simultaneously.
         */
  def addFolder(child: Folder): Folder = js.native
  /**
         * Resumes a file iteration using a continuation token from a previous iterator.
         * This method is useful if processing an iterator in one execution would exceed
         * the maximum execution time. Continuation tokens are generally valid for one week.
         */
  def continueFileIterator(continuationToken: java.lang.String): FileIterator = js.native
  /**
         * Resumes a folder iteration using a continuation token from a previous iterator.
         * This method is useful if processing an iterator in one execution would exceed
         * the maximum execution time. Continuation tokens are generally valid for one week.
         */
  def continueFolderIterator(continuationToken: java.lang.String): FolderIterator = js.native
  /** Creates a file in the root of the user's Drive from a given Blob of arbitrary data. */
  def createFile(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): File = js.native
  /**
         * Creates a text file in the root of the user's Drive with the given name
         * and contents. Throws an exception if content is larger than 50 MB.
         */
  def createFile(name: java.lang.String, content: java.lang.String): File = js.native
  /**
         * Creates a file in the root of the user's Drive with the given name, contents, and MIME type.
         * Throws an exception if content is larger than 10MB.
         */
  def createFile(name: java.lang.String, content: java.lang.String, mimeType: java.lang.String): File = js.native
  /** Creates a folder in the root of the user's Drive with the given name. */
  def createFolder(name: java.lang.String): Folder = js.native
  /**
         * Gets the file with the given ID.
         * Throws a scripting exception if the file does not exist or
         * the user does not have permission to access it.
         */
  def getFileById(id: java.lang.String): File = js.native
  /** Gets a collection of all files in the user's Drive. */
  def getFiles(): FileIterator = js.native
  /** Gets a collection of all files in the user's Drive that have the given name. */
  def getFilesByName(name: java.lang.String): FileIterator = js.native
  /** Gets a collection of all files in the user's Drive that have the given MIME type. */
  def getFilesByType(mimeType: java.lang.String): FileIterator = js.native
  /**
         * Gets the folder with the given ID. Throws a scripting exception if the folder
         * does not exist or the user does not have permission to access it.
         */
  def getFolderById(id: java.lang.String): Folder = js.native
  /** Gets a collection of all folders in the user's Drive. */
  def getFolders(): FolderIterator = js.native
  /** Gets a collection of all folders in the user's Drive that have the given name. */
  def getFoldersByName(name: java.lang.String): FolderIterator = js.native
  /** Gets the folder at the root of the user's Drive. */
  def getRootFolder(): Folder = js.native
  /** Gets the number of bytes the user is allowed to store in Drive. */
  def getStorageLimit(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  /** Gets the number of bytes the user is currently storing in Drive. */
  def getStorageUsed(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  /** Gets a collection of all the files in the trash of the user's Drive. */
  def getTrashedFiles(): FileIterator = js.native
  /** Gets a collection of all the folders in the trash of the user's Drive. */
  def getTrashedFolders(): FolderIterator = js.native
  /**
         * Removes the given file from the root of the user's Drive.
         * This method does not delete the file, but if a file is removed from all
         * of its parents, it cannot be seen in Drive except by searching for it
         * or using the "All items" view.
         */
  def removeFile(child: File): Folder = js.native
  /**
         * Removes the given folder from the root of the user's Drive.
         * This method does not delete the folder or its contents, but if a folder
         * is removed from all of its parents, it cannot be seen in Drive except
         * by searching for it or using the "All items" view.
         */
  def removeFolder(child: Folder): Folder = js.native
  /**
         * Gets a collection of all files in the user's Drive that match the given search criteria.
         * The search criteria are detailed the Google Drive SDK documentation.
         * Note that the params argument is a query string that may contain string values,
         * so take care to escape quotation marks correctly
         * (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"').
         */
  def searchFiles(params: java.lang.String): FileIterator = js.native
  /**
         * Gets a collection of all folders in the user's Drive that match the given search criteria.
         * The search criteria are detailed the Google Drive SDK documentation.
         * Note that the params argument is a query string that may contain string values,
         * so take care to escape quotation marks correctly
         * (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"').
         */
  def searchFolders(params: java.lang.String): FolderIterator = js.native
}

