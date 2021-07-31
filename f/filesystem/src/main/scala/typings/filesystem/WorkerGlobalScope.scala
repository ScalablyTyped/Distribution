package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.filesystem.LocalFileSystemSync because var conflicts: PERSISTENT, TEMPORARY. Inlined requestFileSystemSync, resolveLocalFileSystemSyncURL, webkitRequestFileSystemSync */ @js.native
trait WorkerGlobalScope
  extends StObject
     with LocalFileSystem {
  
  /**
    * Requests a filesystem in which to store application data.
    * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
    */
  def requestFileSystemSync(`type`: Double, size: Double): FileSystemSync = js.native
  
  /**
    * Allows the user to look up the Entry for a file or directory referred to by a local URL.
    * @param url A URL referring to a local file in a filesystem accessable via this API.
    */
  def resolveLocalFileSystemSyncURL(url: String): EntrySync = js.native
  
  /**
    * see requestFileSystemSync
    */
  def webkitRequestFileSystemSync(`type`: Double, size: Double): FileSystemSync = js.native
}
