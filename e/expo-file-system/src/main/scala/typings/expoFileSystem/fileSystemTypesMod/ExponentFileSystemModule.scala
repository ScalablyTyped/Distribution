package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExponentFileSystemModule extends js.Object {
  
  def addListener(eventName: String): Unit = js.native
  
  val bundleDirectory: String | Null = js.native
  
  val bundledAssets: String | Null = js.native
  
  val cacheDirectory: String | Null = js.native
  
  val copyAsync: js.UndefOr[PlatformMethod] = js.native
  
  val deleteAsync: js.UndefOr[PlatformMethod] = js.native
  
  val documentDirectory: String | Null = js.native
  
  val downloadAsync: js.UndefOr[PlatformMethod] = js.native
  
  val downloadResumablePauseAsync: js.UndefOr[PlatformMethod] = js.native
  
  val downloadResumableStartAsync: js.UndefOr[PlatformMethod] = js.native
  
  val getContentUriAsync: js.UndefOr[PlatformMethod] = js.native
  
  val getFreeDiskStorageAsync: js.UndefOr[PlatformMethod] = js.native
  
  val getInfoAsync: js.UndefOr[PlatformMethod] = js.native
  
  val getTotalDiskCapacityAsync: js.UndefOr[PlatformMethod] = js.native
  
  val makeDirectoryAsync: js.UndefOr[PlatformMethod] = js.native
  
  val moveAsync: js.UndefOr[PlatformMethod] = js.native
  
  val name: ExponentFileSystem = js.native
  
  val readAsStringAsync: js.UndefOr[PlatformMethod] = js.native
  
  val readDirectoryAsync: js.UndefOr[PlatformMethod] = js.native
  
  def removeListeners(count: Double): Unit = js.native
  
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.native
  
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.native
  
  val uploadAsync: js.UndefOr[PlatformMethod] = js.native
  
  val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.native
}
object ExponentFileSystemModule {
  
  @scala.inline
  def apply(addListener: String => Unit, name: ExponentFileSystem, removeListeners: Double => Unit): ExponentFileSystemModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), name = name.asInstanceOf[js.Any], removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[ExponentFileSystemModule]
  }
  
  @scala.inline
  implicit class ExponentFileSystemModuleOps[Self <: ExponentFileSystemModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: String => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: ExponentFileSystem): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListeners(value: Double => Unit): Self = this.set("removeListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBundleDirectory(value: String): Self = this.set("bundleDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleDirectoryNull: Self = this.set("bundleDirectory", null)
    
    @scala.inline
    def setBundledAssets(value: String): Self = this.set("bundledAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundledAssetsNull: Self = this.set("bundledAssets", null)
    
    @scala.inline
    def setCacheDirectory(value: String): Self = this.set("cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDirectoryNull: Self = this.set("cacheDirectory", null)
    
    @scala.inline
    def setCopyAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("copyAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCopyAsync: Self = this.set("copyAsync", js.undefined)
    
    @scala.inline
    def setDeleteAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("deleteAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeleteAsync: Self = this.set("deleteAsync", js.undefined)
    
    @scala.inline
    def setDocumentDirectory(value: String): Self = this.set("documentDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDirectoryNull: Self = this.set("documentDirectory", null)
    
    @scala.inline
    def setDownloadAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("downloadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDownloadAsync: Self = this.set("downloadAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumablePauseAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("downloadResumablePauseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDownloadResumablePauseAsync: Self = this.set("downloadResumablePauseAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumableStartAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("downloadResumableStartAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDownloadResumableStartAsync: Self = this.set("downloadResumableStartAsync", js.undefined)
    
    @scala.inline
    def setGetContentUriAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("getContentUriAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetContentUriAsync: Self = this.set("getContentUriAsync", js.undefined)
    
    @scala.inline
    def setGetFreeDiskStorageAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("getFreeDiskStorageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFreeDiskStorageAsync: Self = this.set("getFreeDiskStorageAsync", js.undefined)
    
    @scala.inline
    def setGetInfoAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("getInfoAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetInfoAsync: Self = this.set("getInfoAsync", js.undefined)
    
    @scala.inline
    def setGetTotalDiskCapacityAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("getTotalDiskCapacityAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetTotalDiskCapacityAsync: Self = this.set("getTotalDiskCapacityAsync", js.undefined)
    
    @scala.inline
    def setMakeDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("makeDirectoryAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMakeDirectoryAsync: Self = this.set("makeDirectoryAsync", js.undefined)
    
    @scala.inline
    def setMoveAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("moveAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveAsync: Self = this.set("moveAsync", js.undefined)
    
    @scala.inline
    def setReadAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("readAsStringAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadAsStringAsync: Self = this.set("readAsStringAsync", js.undefined)
    
    @scala.inline
    def setReadDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("readDirectoryAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReadDirectoryAsync: Self = this.set("readDirectoryAsync", js.undefined)
    
    @scala.inline
    def setStartObserving(value: () => Unit): Self = this.set("startObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStartObserving: Self = this.set("startObserving", js.undefined)
    
    @scala.inline
    def setStopObserving(value: () => Unit): Self = this.set("stopObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopObserving: Self = this.set("stopObserving", js.undefined)
    
    @scala.inline
    def setUploadAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("uploadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUploadAsync: Self = this.set("uploadAsync", js.undefined)
    
    @scala.inline
    def setWriteAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = this.set("writeAsStringAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWriteAsStringAsync: Self = this.set("writeAsStringAsync", js.undefined)
  }
}
