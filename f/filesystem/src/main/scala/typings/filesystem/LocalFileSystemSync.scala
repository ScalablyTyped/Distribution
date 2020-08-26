package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalFileSystemSync extends js.Object {
  /**
    * Used for storage that should not be removed by the user agent without application or user permission.
    */
  var PERSISTENT: Double = js.native
  /**
    * Used for storage with no guarantee of persistence.
    */
  var TEMPORARY: Double = js.native
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
  implicit class LocalFileSystemSyncOps[Self <: LocalFileSystemSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPERSISTENT(value: Double): Self = this.set("PERSISTENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEMPORARY(value: Double): Self = this.set("TEMPORARY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestFileSystemSync(value: (Double, Double) => FileSystemSync): Self = this.set("requestFileSystemSync", js.Any.fromFunction2(value))
    @scala.inline
    def setResolveLocalFileSystemSyncURL(value: String => EntrySync): Self = this.set("resolveLocalFileSystemSyncURL", js.Any.fromFunction1(value))
    @scala.inline
    def setWebkitRequestFileSystemSync(value: (Double, Double) => FileSystemSync): Self = this.set("webkitRequestFileSystemSync", js.Any.fromFunction2(value))
  }
  
}

