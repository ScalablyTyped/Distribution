package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Typeofts
import typings.std.Date
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.System
import typings.typescript.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledTypeScriptSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/reporter/ControlledTypeScriptSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createControlledTypeScriptSystem(typescript: Typeofts): ControlledTypeScriptSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlledTypeScriptSystem")(typescript.asInstanceOf[js.Any]).asInstanceOf[ControlledTypeScriptSystem]
  @scala.inline
  def createControlledTypeScriptSystem(typescript: Typeofts, mode: FileSystemMode): ControlledTypeScriptSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("createControlledTypeScriptSystem")(typescript.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[ControlledTypeScriptSystem]
  
  @js.native
  trait ControlledTypeScriptSystem
    extends StObject
       with System {
    
    def clearCache(): Unit = js.native
    
    @JSName("clearTimeout")
    def clearTimeout_MControlledTypeScriptSystem(timeoutId: js.Any): Unit = js.native
    
    @JSName("deleteFile")
    def deleteFile_MControlledTypeScriptSystem(path: String): Unit = js.native
    
    @JSName("getFileSize")
    def getFileSize_MControlledTypeScriptSystem(path: String): Double = js.native
    
    @JSName("getModifiedTime")
    def getModifiedTime_MControlledTypeScriptSystem(path: String): js.UndefOr[Date] = js.native
    
    def invokeFileChanged(path: String): Unit = js.native
    
    def invokeFileCreated(path: String): Unit = js.native
    
    def invokeFileDeleted(path: String): Unit = js.native
    
    @JSName("setModifiedTime")
    def setModifiedTime_MControlledTypeScriptSystem(path: String, time: Date): Unit = js.native
    
    @JSName("setTimeout")
    def setTimeout_MControlledTypeScriptSystem(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): js.Any = js.native
    
    def waitForQueued(): js.Promise[Unit] = js.native
    
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: WatchOptions): FileWatcher = js.native
    @JSName("watchDirectory")
    def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: WatchOptions): FileWatcher = js.native
    
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: WatchOptions): FileWatcher = js.native
    @JSName("watchFile")
    def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: WatchOptions): FileWatcher = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
  */
  trait FileSystemMode extends StObject
  object FileSystemMode {
    
    @scala.inline
    def readonly: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly = "readonly".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly]
    
    @scala.inline
    def `write-references`: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references` = "write-references".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`]
    
    @scala.inline
    def `write-tsbuildinfo`: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo` = "write-tsbuildinfo".asInstanceOf[typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`]
  }
}
