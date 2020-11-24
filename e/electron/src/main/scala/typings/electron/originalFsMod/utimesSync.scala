package typings.electron.originalFsMod

import typings.node.fsMod.PathLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "utimesSync")
@js.native
object utimesSync extends js.Object {
  
  def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): Unit = js.native
}
