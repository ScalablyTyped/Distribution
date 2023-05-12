package typings.expoFileSystem

import typings.expoFileSystem.expoFileSystemStrings.ExponentFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesMod {
  
  trait ExponentFileSystemModule extends StObject {
    
    def addListener(eventName: String): Unit
    
    val bundleDirectory: String | Null
    
    val bundledAssets: String | Null
    
    val cacheDirectory: String | Null
    
    val copyAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val createSAFFileAsync: js.UndefOr[PlatformMethod] = js.undefined
    
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
    
    val makeSAFDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val moveAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val name: ExponentFileSystem
    
    val networkTaskCancelAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val readAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val readDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val readSAFDirectoryAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    def removeListeners(count: Double): Unit
    
    val requestDirectoryPermissionsAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val uploadAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val uploadTaskStartAsync: js.UndefOr[PlatformMethod] = js.undefined
    
    val writeAsStringAsync: js.UndefOr[PlatformMethod] = js.undefined
  }
  object ExponentFileSystemModule {
    
    inline def apply(addListener: String => Unit, removeListeners: Double => Unit): ExponentFileSystemModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), name = "ExponentFileSystem", removeListeners = js.Any.fromFunction1(removeListeners), bundleDirectory = null, bundledAssets = null, cacheDirectory = null, documentDirectory = null)
      __obj.asInstanceOf[ExponentFileSystemModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExponentFileSystemModule] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: String => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setBundleDirectory(value: String): Self = StObject.set(x, "bundleDirectory", value.asInstanceOf[js.Any])
      
      inline def setBundleDirectoryNull: Self = StObject.set(x, "bundleDirectory", null)
      
      inline def setBundledAssets(value: String): Self = StObject.set(x, "bundledAssets", value.asInstanceOf[js.Any])
      
      inline def setBundledAssetsNull: Self = StObject.set(x, "bundledAssets", null)
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryNull: Self = StObject.set(x, "cacheDirectory", null)
      
      inline def setCopyAsync(value: PlatformMethod): Self = StObject.set(x, "copyAsync", value.asInstanceOf[js.Any])
      
      inline def setCopyAsyncUndefined: Self = StObject.set(x, "copyAsync", js.undefined)
      
      inline def setCreateSAFFileAsync(value: PlatformMethod): Self = StObject.set(x, "createSAFFileAsync", value.asInstanceOf[js.Any])
      
      inline def setCreateSAFFileAsyncUndefined: Self = StObject.set(x, "createSAFFileAsync", js.undefined)
      
      inline def setDeleteAsync(value: PlatformMethod): Self = StObject.set(x, "deleteAsync", value.asInstanceOf[js.Any])
      
      inline def setDeleteAsyncUndefined: Self = StObject.set(x, "deleteAsync", js.undefined)
      
      inline def setDocumentDirectory(value: String): Self = StObject.set(x, "documentDirectory", value.asInstanceOf[js.Any])
      
      inline def setDocumentDirectoryNull: Self = StObject.set(x, "documentDirectory", null)
      
      inline def setDownloadAsync(value: PlatformMethod): Self = StObject.set(x, "downloadAsync", value.asInstanceOf[js.Any])
      
      inline def setDownloadAsyncUndefined: Self = StObject.set(x, "downloadAsync", js.undefined)
      
      inline def setDownloadResumablePauseAsync(value: PlatformMethod): Self = StObject.set(x, "downloadResumablePauseAsync", value.asInstanceOf[js.Any])
      
      inline def setDownloadResumablePauseAsyncUndefined: Self = StObject.set(x, "downloadResumablePauseAsync", js.undefined)
      
      inline def setDownloadResumableStartAsync(value: PlatformMethod): Self = StObject.set(x, "downloadResumableStartAsync", value.asInstanceOf[js.Any])
      
      inline def setDownloadResumableStartAsyncUndefined: Self = StObject.set(x, "downloadResumableStartAsync", js.undefined)
      
      inline def setGetContentUriAsync(value: PlatformMethod): Self = StObject.set(x, "getContentUriAsync", value.asInstanceOf[js.Any])
      
      inline def setGetContentUriAsyncUndefined: Self = StObject.set(x, "getContentUriAsync", js.undefined)
      
      inline def setGetFreeDiskStorageAsync(value: PlatformMethod): Self = StObject.set(x, "getFreeDiskStorageAsync", value.asInstanceOf[js.Any])
      
      inline def setGetFreeDiskStorageAsyncUndefined: Self = StObject.set(x, "getFreeDiskStorageAsync", js.undefined)
      
      inline def setGetInfoAsync(value: PlatformMethod): Self = StObject.set(x, "getInfoAsync", value.asInstanceOf[js.Any])
      
      inline def setGetInfoAsyncUndefined: Self = StObject.set(x, "getInfoAsync", js.undefined)
      
      inline def setGetTotalDiskCapacityAsync(value: PlatformMethod): Self = StObject.set(x, "getTotalDiskCapacityAsync", value.asInstanceOf[js.Any])
      
      inline def setGetTotalDiskCapacityAsyncUndefined: Self = StObject.set(x, "getTotalDiskCapacityAsync", js.undefined)
      
      inline def setMakeDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "makeDirectoryAsync", value.asInstanceOf[js.Any])
      
      inline def setMakeDirectoryAsyncUndefined: Self = StObject.set(x, "makeDirectoryAsync", js.undefined)
      
      inline def setMakeSAFDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "makeSAFDirectoryAsync", value.asInstanceOf[js.Any])
      
      inline def setMakeSAFDirectoryAsyncUndefined: Self = StObject.set(x, "makeSAFDirectoryAsync", js.undefined)
      
      inline def setMoveAsync(value: PlatformMethod): Self = StObject.set(x, "moveAsync", value.asInstanceOf[js.Any])
      
      inline def setMoveAsyncUndefined: Self = StObject.set(x, "moveAsync", js.undefined)
      
      inline def setName(value: ExponentFileSystem): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNetworkTaskCancelAsync(value: PlatformMethod): Self = StObject.set(x, "networkTaskCancelAsync", value.asInstanceOf[js.Any])
      
      inline def setNetworkTaskCancelAsyncUndefined: Self = StObject.set(x, "networkTaskCancelAsync", js.undefined)
      
      inline def setReadAsStringAsync(value: PlatformMethod): Self = StObject.set(x, "readAsStringAsync", value.asInstanceOf[js.Any])
      
      inline def setReadAsStringAsyncUndefined: Self = StObject.set(x, "readAsStringAsync", js.undefined)
      
      inline def setReadDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "readDirectoryAsync", value.asInstanceOf[js.Any])
      
      inline def setReadDirectoryAsyncUndefined: Self = StObject.set(x, "readDirectoryAsync", js.undefined)
      
      inline def setReadSAFDirectoryAsync(value: PlatformMethod): Self = StObject.set(x, "readSAFDirectoryAsync", value.asInstanceOf[js.Any])
      
      inline def setReadSAFDirectoryAsyncUndefined: Self = StObject.set(x, "readSAFDirectoryAsync", js.undefined)
      
      inline def setRemoveListeners(value: Double => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1(value))
      
      inline def setRequestDirectoryPermissionsAsync(value: PlatformMethod): Self = StObject.set(x, "requestDirectoryPermissionsAsync", value.asInstanceOf[js.Any])
      
      inline def setRequestDirectoryPermissionsAsyncUndefined: Self = StObject.set(x, "requestDirectoryPermissionsAsync", js.undefined)
      
      inline def setStartObserving(value: () => Unit): Self = StObject.set(x, "startObserving", js.Any.fromFunction0(value))
      
      inline def setStartObservingUndefined: Self = StObject.set(x, "startObserving", js.undefined)
      
      inline def setStopObserving(value: () => Unit): Self = StObject.set(x, "stopObserving", js.Any.fromFunction0(value))
      
      inline def setStopObservingUndefined: Self = StObject.set(x, "stopObserving", js.undefined)
      
      inline def setUploadAsync(value: PlatformMethod): Self = StObject.set(x, "uploadAsync", value.asInstanceOf[js.Any])
      
      inline def setUploadAsyncUndefined: Self = StObject.set(x, "uploadAsync", js.undefined)
      
      inline def setUploadTaskStartAsync(value: PlatformMethod): Self = StObject.set(x, "uploadTaskStartAsync", value.asInstanceOf[js.Any])
      
      inline def setUploadTaskStartAsyncUndefined: Self = StObject.set(x, "uploadTaskStartAsync", js.undefined)
      
      inline def setWriteAsStringAsync(value: PlatformMethod): Self = StObject.set(x, "writeAsStringAsync", value.asInstanceOf[js.Any])
      
      inline def setWriteAsStringAsyncUndefined: Self = StObject.set(x, "writeAsStringAsync", js.undefined)
    }
  }
  
  @js.native
  trait PlatformMethod extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
}
