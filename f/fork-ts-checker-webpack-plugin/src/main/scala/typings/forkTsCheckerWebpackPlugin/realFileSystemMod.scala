package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realFileSystemMod {
  
  /**
    * It's an implementation of the FileSystem interface which reads and writes directly to the real file system.
    *
    * @param caseSensitive
    */
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/RealFileSystem", "createRealFileSystem")
  @js.native
  def createRealFileSystem(): FileSystem = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/RealFileSystem", "createRealFileSystem")
  @js.native
  def createRealFileSystem(caseSensitive: Boolean): FileSystem = js.native
}
