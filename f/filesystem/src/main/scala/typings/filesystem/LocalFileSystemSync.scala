package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalFileSystemSync extends StObject {
  
  /**
    * Used for storage that should not be removed by the user agent without application or user permission.
    */
  var PERSISTENT: Double
  
  /**
    * Used for storage with no guarantee of persistence.
    */
  var TEMPORARY: Double
  
  /**
    * Requests a filesystem in which to store application data.
    * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
    */
  def requestFileSystemSync(`type`: Double, size: Double): FileSystemSync
  
  /**
    * Allows the user to look up the Entry for a file or directory referred to by a local URL.
    * @param url A URL referring to a local file in a filesystem accessable via this API.
    */
  def resolveLocalFileSystemSyncURL(url: String): EntrySync
  
  /**
    * see requestFileSystemSync
    */
  def webkitRequestFileSystemSync(`type`: Double, size: Double): FileSystemSync
}
object LocalFileSystemSync {
  
  @scala.inline
  def apply(
    PERSISTENT: Double,
    TEMPORARY: Double,
    requestFileSystemSync: (Double, Double) => FileSystemSync,
    resolveLocalFileSystemSyncURL: String => EntrySync,
    webkitRequestFileSystemSync: (Double, Double) => FileSystemSync
  ): LocalFileSystemSync = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT.asInstanceOf[js.Any], TEMPORARY = TEMPORARY.asInstanceOf[js.Any], requestFileSystemSync = js.Any.fromFunction2(requestFileSystemSync), resolveLocalFileSystemSyncURL = js.Any.fromFunction1(resolveLocalFileSystemSyncURL), webkitRequestFileSystemSync = js.Any.fromFunction2(webkitRequestFileSystemSync))
    __obj.asInstanceOf[LocalFileSystemSync]
  }
  
  @scala.inline
  implicit class LocalFileSystemSyncMutableBuilder[Self <: LocalFileSystemSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPERSISTENT(value: Double): Self = StObject.set(x, "PERSISTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFileSystemSync(value: (Double, Double) => FileSystemSync): Self = StObject.set(x, "requestFileSystemSync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveLocalFileSystemSyncURL(value: String => EntrySync): Self = StObject.set(x, "resolveLocalFileSystemSyncURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTEMPORARY(value: Double): Self = StObject.set(x, "TEMPORARY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitRequestFileSystemSync(value: (Double, Double) => FileSystemSync): Self = StObject.set(x, "webkitRequestFileSystemSync", js.Any.fromFunction2(value))
  }
}
