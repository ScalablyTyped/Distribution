package typings
package filesystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- filesystemLib.LocalFileSystemSync because var conflicts: PERSISTENT, TEMPORARY. Inlined requestFileSystemSync, resolveLocalFileSystemSyncURL, webkitRequestFileSystemSync */ @js.native
trait WorkerGlobalScope extends LocalFileSystem {
  /**
    * Requests a filesystem in which to store application data.
    * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
    */
  def requestFileSystemSync(`type`: scala.Double, size: scala.Double): FileSystemSync = js.native
  /**
    * Allows the user to look up the Entry for a file or directory referred to by a local URL.
    * @param url A URL referring to a local file in a filesystem accessable via this API.
    */
  def resolveLocalFileSystemSyncURL(url: java.lang.String): EntrySync = js.native
  /**
    * see requestFileSystemSync
    */
  def webkitRequestFileSystemSync(`type`: scala.Double, size: scala.Double): FileSystemSync = js.native
}

