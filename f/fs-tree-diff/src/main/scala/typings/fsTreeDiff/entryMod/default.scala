package typings.fsTreeDiff.entryMod

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-tree-diff/lib/entry", JSImport.Default)
@js.native
class default protected () extends Entry {
  def this(relativePath: String) = this()
  def this(relativePath: String, size: Double) = this()
  def this(relativePath: String, size: Double, mtime: Double) = this()
  def this(relativePath: String, size: Double, mtime: Date) = this()
  def this(relativePath: String, size: Double, mtime: Double, mode: Double) = this()
  def this(relativePath: String, size: Double, mtime: Date, mode: Double) = this()
  /* CompleteClass */
  override var relativePath: String = js.native
  /* CompleteClass */
  override def isDirectory(): Boolean = js.native
}

/* static members */
@JSImport("fs-tree-diff/lib/entry", JSImport.Default)
@js.native
object default extends js.Object {
  def fromStat(relativePath: String, stat: Stats): Entry = js.native
  def isDirectory(entry: Entry): Boolean = js.native
  def isFile(entry: Entry): Boolean = js.native
}

