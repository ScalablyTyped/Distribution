package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passiveFileSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/PassiveFileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * It's an implementation of FileSystem interface which reads from the real file system, but write to the in-memory file system.
    *
    * @param caseSensitive
    * @param realFileSystem
    */
  @scala.inline
  def createPassiveFileSystem(caseSensitive: Boolean, realFileSystem: FileSystem): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("createPassiveFileSystem")(caseSensitive.asInstanceOf[js.Any], realFileSystem.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
  @scala.inline
  def createPassiveFileSystem(caseSensitive: Unit, realFileSystem: FileSystem): FileSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("createPassiveFileSystem")(caseSensitive.asInstanceOf[js.Any], realFileSystem.asInstanceOf[js.Any])).asInstanceOf[FileSystem]
}
