package typings.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typings.expoDashFileDashSystem.expoDashFileDashSystemStrings.ExponentFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentFileSystemModule extends js.Object {
  val bundleDirectory: String | Null
  val bundledAssets: String | Null
  val cacheDirectory: String | Null
  val copyAsync: js.UndefOr[PlatformMethod] = js.undefined
  val deleteAsync: js.UndefOr[PlatformMethod] = js.undefined
  val documentDirectory: String | Null
  val downloadAsync: js.UndefOr[PlatformMethod] = js.undefined
  val downloadResumablePauseAsync: js.UndefOr[PlatformMethod] = js.undefined
  val downloadResumableStartAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getContentUriAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getFreeDiskStorageAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getInfoAsync: js.UndefOr[PlatformMethod] = js.undefined
  val getTotalDiskCapacityAsync: js.UndefOr[PlatformMethod] = js.undefined
  val makeDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
  val moveAsync: js.UndefOr[PlatformMethod] = js.undefined
  val name: ExponentFileSystem
  val readAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
  val readDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
  def addListener(eventName: String): Unit
  def removeListeners(count: Double): Unit
}

object ExponentFileSystemModule {
  @scala.inline
  def apply(
    addListener: String => Unit,
    name: ExponentFileSystem,
    removeListeners: Double => Unit,
    bundleDirectory: String = null,
    bundledAssets: String = null,
    cacheDirectory: String = null,
    copyAsync: PlatformMethod = null,
    deleteAsync: PlatformMethod = null,
    documentDirectory: String = null,
    downloadAsync: PlatformMethod = null,
    downloadResumablePauseAsync: PlatformMethod = null,
    downloadResumableStartAsync: PlatformMethod = null,
    getContentUriAsync: PlatformMethod = null,
    getFreeDiskStorageAsync: PlatformMethod = null,
    getInfoAsync: PlatformMethod = null,
    getTotalDiskCapacityAsync: PlatformMethod = null,
    makeDirectoryAsync: PlatformMethod = null,
    moveAsync: PlatformMethod = null,
    readAsStringAsync: PlatformMethod = null,
    readDirectoryAsync: PlatformMethod = null,
    startObserving: () => Unit = null,
    stopObserving: () => Unit = null,
    writeAsStringAsync: PlatformMethod = null
  ): ExponentFileSystemModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), name = name, removeListeners = js.Any.fromFunction1(removeListeners))
    if (bundleDirectory != null) __obj.updateDynamic("bundleDirectory")(bundleDirectory)
    if (bundledAssets != null) __obj.updateDynamic("bundledAssets")(bundledAssets)
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (copyAsync != null) __obj.updateDynamic("copyAsync")(copyAsync)
    if (deleteAsync != null) __obj.updateDynamic("deleteAsync")(deleteAsync)
    if (documentDirectory != null) __obj.updateDynamic("documentDirectory")(documentDirectory)
    if (downloadAsync != null) __obj.updateDynamic("downloadAsync")(downloadAsync)
    if (downloadResumablePauseAsync != null) __obj.updateDynamic("downloadResumablePauseAsync")(downloadResumablePauseAsync)
    if (downloadResumableStartAsync != null) __obj.updateDynamic("downloadResumableStartAsync")(downloadResumableStartAsync)
    if (getContentUriAsync != null) __obj.updateDynamic("getContentUriAsync")(getContentUriAsync)
    if (getFreeDiskStorageAsync != null) __obj.updateDynamic("getFreeDiskStorageAsync")(getFreeDiskStorageAsync)
    if (getInfoAsync != null) __obj.updateDynamic("getInfoAsync")(getInfoAsync)
    if (getTotalDiskCapacityAsync != null) __obj.updateDynamic("getTotalDiskCapacityAsync")(getTotalDiskCapacityAsync)
    if (makeDirectoryAsync != null) __obj.updateDynamic("makeDirectoryAsync")(makeDirectoryAsync)
    if (moveAsync != null) __obj.updateDynamic("moveAsync")(moveAsync)
    if (readAsStringAsync != null) __obj.updateDynamic("readAsStringAsync")(readAsStringAsync)
    if (readDirectoryAsync != null) __obj.updateDynamic("readDirectoryAsync")(readDirectoryAsync)
    if (startObserving != null) __obj.updateDynamic("startObserving")(js.Any.fromFunction0(startObserving))
    if (stopObserving != null) __obj.updateDynamic("stopObserving")(js.Any.fromFunction0(stopObserving))
    if (writeAsStringAsync != null) __obj.updateDynamic("writeAsStringAsync")(writeAsStringAsync)
    __obj.asInstanceOf[ExponentFileSystemModule]
  }
}

