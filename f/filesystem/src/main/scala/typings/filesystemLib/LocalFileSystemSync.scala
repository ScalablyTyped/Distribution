package typings
package filesystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocalFileSystemSync extends js.Object {
  /**
       * Used for storage that should not be removed by the user agent without application or user permission.
       */
  var PERSISTENT: scala.Double
  /**
       * Used for storage with no guarantee of persistence.
       */
  var TEMPORARY: scala.Double
  /**
       * Requests a filesystem in which to store application data.
       * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
       * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
       */
  def requestFileSystemSync(`type`: scala.Double, size: scala.Double): FileSystemSync
  /**
       * Allows the user to look up the Entry for a file or directory referred to by a local URL.
       * @param url A URL referring to a local file in a filesystem accessable via this API.
       */
  def resolveLocalFileSystemSyncURL(url: java.lang.String): EntrySync
  /**
       * see requestFileSystemSync
       */
  def webkitRequestFileSystemSync(`type`: scala.Double, size: scala.Double): FileSystemSync
}

