package typings.electron.originalFsMod

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("original-fs", "link")
@js.native
object link extends js.Object {
  
  def apply(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
}
