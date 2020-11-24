package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.forkTsCheckerWebpackPlugin.anon.PartialWatchFileSystemOpt
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchFileSystem extends js.Object {
  
  def watch(files: Iterable[String], dirs: Iterable[String], missing: Iterable[String]): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function,
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: PartialWatchFileSystemOpt
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: PartialWatchFileSystemOpt,
    callback: js.UndefOr[scala.Nothing],
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: PartialWatchFileSystemOpt,
    callback: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: js.UndefOr[scala.Nothing],
    options: PartialWatchFileSystemOpt,
    callback: js.Function,
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(files: Iterable[String], dirs: Iterable[String], missing: Iterable[String], startTime: Double): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function,
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: PartialWatchFileSystemOpt
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: PartialWatchFileSystemOpt,
    callback: js.UndefOr[scala.Nothing],
    callbackUndelayed: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: PartialWatchFileSystemOpt,
    callback: js.Function
  ): Watcher = js.native
  def watch(
    files: Iterable[String],
    dirs: Iterable[String],
    missing: Iterable[String],
    startTime: Double,
    options: PartialWatchFileSystemOpt,
    callback: js.Function,
    callbackUndelayed: js.Function
  ): Watcher = js.native
  
  var watcher: Watchpack = js.native
  
  var wfs: js.UndefOr[typings.forkTsCheckerWebpackPlugin.anon.Watcher] = js.native
}
