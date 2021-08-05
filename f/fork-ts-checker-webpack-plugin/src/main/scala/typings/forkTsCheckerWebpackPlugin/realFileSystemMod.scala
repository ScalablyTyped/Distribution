package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realFileSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/file-system/RealFileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * It's an implementation of the FileSystem interface which reads and writes directly to the real file system.
    *
    * @param caseSensitive
    */
  inline def createRealFileSystem(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("createRealFileSystem")().asInstanceOf[FileSystem]
  inline def createRealFileSystem(caseSensitive: Boolean): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("createRealFileSystem")(caseSensitive.asInstanceOf[js.Any]).asInstanceOf[FileSystem]
}
