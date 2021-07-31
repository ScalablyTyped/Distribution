package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExponentFileSystemModule extends StObject {
  
  def addListener(eventName: String): Unit
  
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
  
  def removeListeners(count: Double): Unit
  
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val uploadAsync: js.UndefOr[PlatformMethod] = js.undefined
  
  val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
}
object ExponentFileSystemModule {
  
  @scala.inline
  def apply(addListener: String => Unit, removeListeners: Double => Unit): ExponentFileSystemModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), name = "ExponentFileSystem", removeListeners = js.Any.fromFunction1(removeListeners), bundleDirectory = null, bundledAssets = null, cacheDirectory = null, documentDirectory = null)
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
    def setCopyAsync(value: PlatformMethod): Self = StObject.set(x, "copyAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyAsyncUndefined: Self = StObject.set(x, "copyAsync", js.undefined)
    
    @scala.inline
    def setDeleteAsync(value: PlatformMethod): Self = StObject.set(x, "deleteAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAsyncUndefined: Self = StObject.set(x, "deleteAsync", js.undefined)
    
    @scala.inline
    def setDocumentDirectory(value: String): Self = StObject.set(x, "documentDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDirectoryNull: Self = StObject.set(x, "documentDirectory", null)
    
    @scala.inline
    def setDownloadAsync(value: PlatformMethod): Self = StObject.set(x, "downloadAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadAsyncUndefined: Self = StObject.set(x, "downloadAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumablePauseAsync(value: PlatformMethod): Self = StObject.set(x, "downloadResumablePauseAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadResumablePauseAsyncUndefined: Self = StObject.set(x, "downloadResumablePauseAsync", js.undefined)
    
    @scala.inline
    def setDownloadResumableStartAsync(value: PlatformMethod): Self = StObject.set(x, "downloadResumableStartAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadResumableStartAsyncUndefined: Self = StObject.set(x, "downloadResumableStartAsync", js.undefined)
    
    @scala.inline
    def setGetContentUriAsync(value: PlatformMethod): Self = StObject.set(x, "getContentUriAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContentUriAsyncUndefined: Self = StObject.set(x, "getContentUriAsync", js.undefined)
    
    @scala.inline
    def setGetFreeDiskStorageAsync(value: PlatformMethod): Self = StObject.set(x, "getFreeDiskStorageAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFreeDiskStorageAsyncUndefined: Self = StObject.set(x, "getFreeDiskStorageAsync", js.undefined)
    
    @scala.inline
    def setGetInfoAsync(value: PlatformMethod): Self = StObject.set(x, "getInfoAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInfoAsyncUndefined: Self = StObject.set(x, "getInfoAsync", js.undefined)
    
    @scala.inline
    def setGetTotalDiskCapacityAsync(value: PlatformMethod): Self = StObject.set(x, "getTotalDiskCapacityAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTotalDiskCapacityAsyncUndefined: Self = StObject.set(x, "getTotalDiskCapacityAsync", js.undefined)
    
    @scala.inline
    def setMakeDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "makeDirectoryAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeDirectoryAsyncUndefined: Self = StObject.set(x, "makeDirectoryAsync", js.undefined)
    
    @scala.inline
    def setMoveAsync(value: PlatformMethod): Self = StObject.set(x, "moveAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveAsyncUndefined: Self = StObject.set(x, "moveAsync", js.undefined)
    
    @scala.inline
    def setName(value: ExponentFileSystem): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsStringAsync(value: PlatformMethod): Self = StObject.set(x, "readAsStringAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsStringAsyncUndefined: Self = StObject.set(x, "readAsStringAsync", js.undefined)
    
    @scala.inline
    def setReadDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "readDirectoryAsync", value.asInstanceOf[js.Any])
    
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
    def setUploadAsync(value: PlatformMethod): Self = StObject.set(x, "uploadAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadAsyncUndefined: Self = StObject.set(x, "uploadAsync", js.undefined)
    
    @scala.inline
    def setWriteAsStringAsync(value: PlatformMethod): Self = StObject.set(x, "writeAsStringAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteAsStringAsyncUndefined: Self = StObject.set(x, "writeAsStringAsync", js.undefined)
  }
}
