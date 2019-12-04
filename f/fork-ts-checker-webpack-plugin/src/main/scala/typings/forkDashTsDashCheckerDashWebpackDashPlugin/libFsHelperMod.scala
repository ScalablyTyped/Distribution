package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/FsHelper", JSImport.Namespace)
@js.native
object libFsHelperMod extends js.Object {
  def fileExistsSync(filePath: PathLike): Boolean = js.native
  def throwIfIsInvalidSourceFileError(filepath: String, error: js.Any): Unit = js.native
}

