package typings.gitRevSync

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git-rev-sync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def branch(): Unit = js.native
  def branch(branch: String): Unit = js.native
  def count(): Double = js.native
  def date(): Date = js.native
  def isDirty(): Boolean = js.native
  def isTagDirty(): Boolean = js.native
  def long(): String = js.native
  def long(filePath: String): String = js.native
  def message(): String = js.native
  def remoteUrl(): String = js.native
  def short(): String = js.native
  def short(filePath: String): String = js.native
  def short(filePath: String, length: Double): String = js.native
  def tag(): String = js.native
  def tag(makeDirty: Boolean): String = js.native
}

