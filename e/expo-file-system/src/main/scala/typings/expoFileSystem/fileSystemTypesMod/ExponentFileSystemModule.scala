package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExponentFileSystemModule extends StObject {
  
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
  implicit class ExponentFileSystemModuleMutableBuilder[Self <: ExponentFileSystemModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddListener(value: String => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBundleDirectory(value: String): Self = StObject.set(x, "bundleDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleDirectoryNull: Self = StObject.set(x, "bundleDirectory", null)
    
    @scala.inline
    def setBundledAssets(value: String): Self = StObject.set(x, "bundledAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundledAssetsNull: Self = StObject.set(x, "bundledAssets", null)
    
    @scala.inline
    def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDirectoryNull: Self = StObject.set(x, "cacheDirectory", null)
    
    @scala.inline
    def setCopyAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "copyAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyAsyncUndefined: Self = StObject.set(x, "copyAsync", js.undefined)
    
    @scala.inline
    def setDeleteAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "deleteAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteAsyncUndefined: Self = StObject.set(x, "deleteAsync", js.undefined)
    
    @scala.inline
    def setDocumentDirectory(value: String): Self = StObject.set(x, "documentDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDirectoryNull: Self = StObject.set(x, "documentDirectory", null)
    
    @scala.inline
    def setDownloadAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "downloadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadAsyncUndefined: Self = StObject.set(x, "downloadAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumablePauseAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "downloadResumablePauseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadResumablePauseAsyncUndefined: Self = StObject.set(x, "downloadResumablePauseAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumableStartAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "downloadResumableStartAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadResumableStartAsyncUndefined: Self = StObject.set(x, "downloadResumableStartAsync", js.undefined)
    
    @scala.inline
    def setGetContentUriAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "getContentUriAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContentUriAsyncUndefined: Self = StObject.set(x, "getContentUriAsync", js.undefined)
    
    @scala.inline
    def setGetFreeDiskStorageAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "getFreeDiskStorageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFreeDiskStorageAsyncUndefined: Self = StObject.set(x, "getFreeDiskStorageAsync", js.undefined)
    
    @scala.inline
    def setGetInfoAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "getInfoAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfoAsyncUndefined: Self = StObject.set(x, "getInfoAsync", js.undefined)
    
    @scala.inline
    def setGetTotalDiskCapacityAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "getTotalDiskCapacityAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTotalDiskCapacityAsyncUndefined: Self = StObject.set(x, "getTotalDiskCapacityAsync", js.undefined)
    
    @scala.inline
    def setMakeDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "makeDirectoryAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeDirectoryAsyncUndefined: Self = StObject.set(x, "makeDirectoryAsync", js.undefined)
    
    @scala.inline
    def setMoveAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "moveAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveAsyncUndefined: Self = StObject.set(x, "moveAsync", js.undefined)
    
    @scala.inline
    def setName(value: ExponentFileSystem): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "readAsStringAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadAsStringAsyncUndefined: Self = StObject.set(x, "readAsStringAsync", js.undefined)
    
    @scala.inline
    def setReadDirectoryAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "readDirectoryAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadDirectoryAsyncUndefined: Self = StObject.set(x, "readDirectoryAsync", js.undefined)
    
    @scala.inline
    def setRemoveListeners(value: Double => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartObserving(value: () => Unit): Self = StObject.set(x, "startObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartObservingUndefined: Self = StObject.set(x, "startObserving", js.undefined)
    
    @scala.inline
    def setStopObserving(value: () => Unit): Self = StObject.set(x, "stopObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopObservingUndefined: Self = StObject.set(x, "stopObserving", js.undefined)
    
    @scala.inline
    def setUploadAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "uploadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUploadAsyncUndefined: Self = StObject.set(x, "uploadAsync", js.undefined)
    
    @scala.inline
    def setWriteAsStringAsync(value: /* repeated */ js.Any => js.Promise[js.Any]): Self = StObject.set(x, "writeAsStringAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteAsStringAsyncUndefined: Self = StObject.set(x, "writeAsStringAsync", js.undefined)
  }
}
