package typings
package filesystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalFileSystem extends js.Object {
  /**
    * Used for storage that should not be removed by the user agent without application or user permission.
    */
  var PERSISTENT: scala.Double = js.native
  /**
    * Used for storage with no guarantee of persistence.
    */
  var TEMPORARY: scala.Double = js.native
  /**
    * Requests a filesystem in which to store application data.
    * @param type Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size This is an indicator of how much storage space, in bytes, the application expects to need.
    * @param successCallback The callback that is called when the user agent provides a filesystem.
    * @param errorCallback A callback that is called when errors happen, or when the request to obtain the filesystem is denied.
    */
  def requestFileSystem(`type`: scala.Double, size: scala.Double, successCallback: FileSystemCallback): scala.Unit = js.native
  def requestFileSystem(
    `type`: scala.Double,
    size: scala.Double,
    successCallback: FileSystemCallback,
    errorCallback: ErrorCallback
  ): scala.Unit = js.native
  /**
    * Allows the user to look up the Entry for a file or directory referred to by a local URL.
    * @param url A URL referring to a local file in a filesystem accessable via this API.
    * @param successCallback A callback that is called to report the Entry to which the supplied URL refers.
    * @param errorCallback A callback that is called when errors happen, or when the request to obtain the Entry is denied.
    */
  def resolveLocalFileSystemURL(url: java.lang.String, successCallback: EntryCallback): scala.Unit = js.native
  def resolveLocalFileSystemURL(url: java.lang.String, successCallback: EntryCallback, errorCallback: ErrorCallback): scala.Unit = js.native
  /**
    * see requestFileSystem.
    */
  def webkitRequestFileSystem(`type`: scala.Double, size: scala.Double, successCallback: FileSystemCallback): scala.Unit = js.native
  def webkitRequestFileSystem(
    `type`: scala.Double,
    size: scala.Double,
    successCallback: FileSystemCallback,
    errorCallback: ErrorCallback
  ): scala.Unit = js.native
}

