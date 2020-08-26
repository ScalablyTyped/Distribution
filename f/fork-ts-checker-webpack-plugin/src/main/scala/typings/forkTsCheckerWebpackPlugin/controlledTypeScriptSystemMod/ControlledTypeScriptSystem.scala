package typings.forkTsCheckerWebpackPlugin.controlledTypeScriptSystemMod

import typings.std.Date
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.System
import typings.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledTypeScriptSystem extends System {
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
  def pollAndInvokeCreatedOrDeleted(): Unit = js.native
  @JSName("setModifiedTime")
  def setModifiedTime_MControlledTypeScriptSystem(path: String, time: Date): Unit = js.native
  @JSName("setTimeout")
  def setTimeout_MControlledTypeScriptSystem(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): js.Any = js.native
  def waitForQueued(): js.Promise[Unit] = js.native
  @JSName("watchDirectory")
  def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MControlledTypeScriptSystem(
    path: String,
    callback: DirectoryWatcherCallback,
    recursive: js.UndefOr[scala.Nothing],
    options: WatchOptions
  ): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
  @JSName("watchDirectory")
  def watchDirectory_MControlledTypeScriptSystem(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: WatchOptions): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MControlledTypeScriptSystem(
    path: String,
    callback: FileWatcherCallback,
    pollingInterval: js.UndefOr[scala.Nothing],
    options: WatchOptions
  ): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
  @JSName("watchFile")
  def watchFile_MControlledTypeScriptSystem(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: WatchOptions): FileWatcher = js.native
}

