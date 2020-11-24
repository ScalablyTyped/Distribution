package typings.fsTreeDiff.entryMod

import typings.node.fsMod.Stats
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-tree-diff/lib/entry", JSImport.Default)
@js.native
class default protected () extends Entry {
  def this(relativePath: String) = this()
  def this(relativePath: String, size: Double) = this()
  def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Double) = this()
  def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Date) = this()
  def this(relativePath: String, size: Double, mtime: Double) = this()
  def this(relativePath: String, size: Double, mtime: Date) = this()
  def this(
    relativePath: String,
    size: js.UndefOr[scala.Nothing],
    mtime: js.UndefOr[scala.Nothing],
    mode: Double
  ) = this()
  def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Double, mode: Double) = this()
  def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Date, mode: Double) = this()
  def this(relativePath: String, size: Double, mtime: js.UndefOr[scala.Nothing], mode: Double) = this()
  def this(relativePath: String, size: Double, mtime: Double, mode: Double) = this()
  def this(relativePath: String, size: Double, mtime: Date, mode: Double) = this()
}
/* static members */
@JSImport("fs-tree-diff/lib/entry", JSImport.Default)
@js.native
object default extends js.Object {
  
  def fromStat(relativePath: String, stat: Stats): Entry = js.native
  
  def isDirectory(entry: Entry): Boolean = js.native
  
  def isFile(entry: Entry): Boolean = js.native
}
