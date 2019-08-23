package typings.expoDashFileDashSystem.buildFileSystemMod

import typings.atUnimodulesCore.atUnimodulesCoreMod.EventEmitter
import typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.Subscription
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadOptions
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadPauseState
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadProgressCallback
import typings.expoDashFileDashSystem.buildFileSystemDotTypesMod.DownloadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-file-system/build/FileSystem", "DownloadResumable")
@js.native
class DownloadResumable protected () extends js.Object {
  def this(url: String, fileUri: String) = this()
  def this(url: String, fileUri: String, options: DownloadOptions) = this()
  def this(url: String, fileUri: String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
  def this(
    url: String,
    fileUri: String,
    options: DownloadOptions,
    callback: DownloadProgressCallback,
    resumeData: String
  ) = this()
  var _callback: js.UndefOr[DownloadProgressCallback] = js.native
  var _emitter: EventEmitter = js.native
  var _fileUri: String = js.native
  var _options: DownloadOptions = js.native
  var _resumeData: js.UndefOr[String] = js.native
  var _subscription: js.UndefOr[Subscription | Null] = js.native
  var _url: String = js.native
  var _uuid: String = js.native
  def _addSubscription(): Unit = js.native
  def _removeSubscription(): Unit = js.native
  def downloadAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
  def pauseAsync(): js.Promise[DownloadPauseState] = js.native
  def resumeAsync(): js.Promise[js.UndefOr[DownloadResult]] = js.native
  def savable(): DownloadPauseState = js.native
}

