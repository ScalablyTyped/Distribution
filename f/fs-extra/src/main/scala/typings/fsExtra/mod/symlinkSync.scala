package typings.fsExtra.mod

import typings.node.fsMod.PathLike
import typings.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "symlinkSync")
@js.native
object symlinkSync extends js.Object {
  
  def apply(target: PathLike, path: PathLike): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
}
