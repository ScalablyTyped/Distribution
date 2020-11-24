package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/PassiveFileSystem", JSImport.Namespace)
@js.native
object passiveFileSystemMod extends js.Object {
  
  def createPassiveFileSystem(caseSensitive: js.UndefOr[scala.Nothing], realFileSystem: FileSystem): FileSystem = js.native
  /**
    * It's an implementation of FileSystem interface which reads from the real file system, but write to the in-memory file system.
    *
    * @param caseSensitive
    * @param realFileSystem
    */
  def createPassiveFileSystem(caseSensitive: Boolean, realFileSystem: FileSystem): FileSystem = js.native
}
