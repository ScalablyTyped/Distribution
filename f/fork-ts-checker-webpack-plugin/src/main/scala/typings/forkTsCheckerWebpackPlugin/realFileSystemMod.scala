package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/RealFileSystem", JSImport.Namespace)
@js.native
object realFileSystemMod extends js.Object {
  
  /**
    * It's an implementation of the FileSystem interface which reads and writes directly to the real file system.
    *
    * @param caseSensitive
    */
  def createRealFileSystem(): FileSystem = js.native
  def createRealFileSystem(caseSensitive: Boolean): FileSystem = js.native
}
