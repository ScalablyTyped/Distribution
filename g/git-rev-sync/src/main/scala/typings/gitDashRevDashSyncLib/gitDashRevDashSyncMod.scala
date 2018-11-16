package typings
package gitDashRevDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-rev-sync", JSImport.Namespace)
@js.native
object gitDashRevDashSyncMod extends js.Object {
  def branch(): scala.Unit = js.native
  def branch(branch: java.lang.String): scala.Unit = js.native
  def count(): scala.Double = js.native
  def date(): stdLib.Date = js.native
  def isDirty(): scala.Boolean = js.native
  def isTagDirty(): scala.Boolean = js.native
  def long(): java.lang.String = js.native
  def long(filePath: java.lang.String): java.lang.String = js.native
  def message(): java.lang.String = js.native
  def remoteUrl(): java.lang.String = js.native
  def short(): java.lang.String = js.native
  def short(filePath: java.lang.String): java.lang.String = js.native
  def short(filePath: java.lang.String, length: scala.Double): java.lang.String = js.native
  def tag(): java.lang.String = js.native
  def tag(makeDirty: scala.Boolean): java.lang.String = js.native
}

