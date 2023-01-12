package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcApiMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVideoUploaderMod {
  
  object VideoEncodingStatusChecker {
    
    @JSImport("facebook-nodejs-business-sdk/src/video-uploader", "VideoEncodingStatusChecker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatus(api: default, videoId: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(api.asInstanceOf[js.Any], videoId.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def waitUntilReady(api: default, videoId: Double, interval: Double, timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilReady")(api.asInstanceOf[js.Any], videoId.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("facebook-nodejs-business-sdk/src/video-uploader", "VideoUploadRequest")
  @js.native
  open class VideoUploadRequest protected () extends StObject {
    def this(api: default) = this()
    
    var _api: default = js.native
    
    var _files: Record[String, Any] = js.native
    
    var _params: Record[String, Any] = js.native
    
    def send(path: String): Record[String, Any] = js.native
    def send(path: js.Array[String]): Record[String, Any] = js.native
    
    def setParams(params: Record[String, Any]): Unit = js.native
    def setParams(params: Record[String, Any], files: Record[String, Any]): Unit = js.native
  }
  
  @JSImport("facebook-nodejs-business-sdk/src/video-uploader", "VideoUploader")
  @js.native
  open class VideoUploader () extends StObject {
    
    var _session: js.UndefOr[VideoUploadSession | Null] = js.native
    
    def upload(video: typings.facebookNodejsBusinessSdk.srcObjectsAdVideoMod.default, waitForEncoding: Boolean): Record[String, Any] = js.native
  }
  
  trait SlideshowSpec extends StObject {
    
    var duration_ms: Double
    
    var images_urls: js.Array[String]
    
    var transition_ms: Double
  }
  object SlideshowSpec {
    
    inline def apply(duration_ms: Double, images_urls: js.Array[String], transition_ms: Double): SlideshowSpec = {
      val __obj = js.Dynamic.literal(duration_ms = duration_ms.asInstanceOf[js.Any], images_urls = images_urls.asInstanceOf[js.Any], transition_ms = transition_ms.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideshowSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideshowSpec] (val x: Self) extends AnyVal {
      
      inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
      
      inline def setImages_urls(value: js.Array[String]): Self = StObject.set(x, "images_urls", value.asInstanceOf[js.Any])
      
      inline def setImages_urlsVarargs(value: String*): Self = StObject.set(x, "images_urls", js.Array(value*))
      
      inline def setTransition_ms(value: Double): Self = StObject.set(x, "transition_ms", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoUploadFinishRequestManager
    extends StObject
       with VideoUploadRequestManager
  object VideoUploadFinishRequestManager {
    
    inline def apply(
      _api: default,
      getParamsFromContext: VideoUploadRequestContext => Record[String, Any],
      sendRequest: VideoUploadRequestContext => Record[String, Any]
    ): VideoUploadFinishRequestManager = {
      val __obj = js.Dynamic.literal(_api = _api.asInstanceOf[js.Any], getParamsFromContext = js.Any.fromFunction1(getParamsFromContext), sendRequest = js.Any.fromFunction1(sendRequest))
      __obj.asInstanceOf[VideoUploadFinishRequestManager]
    }
  }
  
  @js.native
  trait VideoUploadRequestContext extends StObject {
    
    var _accountId: String = js.native
    
    var _endOffset: Double = js.native
    
    var _fileName: String = js.native
    
    var _filePath: String = js.native
    
    var _fileSize: Double = js.native
    
    var _name: String = js.native
    
    var _sessionId: String = js.native
    
    var _slideshowSpec: SlideshowSpec = js.native
    
    var _startOffset: Double = js.native
    
    var _videoFileChunk: String = js.native
    
    def accountId: String = js.native
    def accountId_=(accountId: String): Unit = js.native
    
    def endOffset: Double = js.native
    def endOffset_=(endOffset: Double): Unit = js.native
    
    def fileName: String = js.native
    def fileName_=(fileName: String): Unit = js.native
    
    def filePath: String = js.native
    def filePath_=(filePath: String): Unit = js.native
    
    def fileSize: Double = js.native
    def fileSize_=(fileSize: Double): Unit = js.native
    
    def name: String = js.native
    def name_=(name: String): Unit = js.native
    
    def sessionId: String = js.native
    def sessionId_=(sessionId: String): Unit = js.native
    
    def slideshowSpec: SlideshowSpec = js.native
    def slideshowSpec_=(slideshowSpec: SlideshowSpec): Unit = js.native
    
    def startOffset: Double = js.native
    def startOffset_=(startOffset: Double): Unit = js.native
    
    def videoFileChunk: String = js.native
    def videoFileChunk_=(videoFileChunk: String): Unit = js.native
  }
  
  trait VideoUploadRequestManager extends StObject {
    
    var _api: default
    
    def getParamsFromContext(context: VideoUploadRequestContext): Record[String, Any]
    
    def sendRequest(context: VideoUploadRequestContext): Record[String, Any]
  }
  object VideoUploadRequestManager {
    
    inline def apply(
      _api: default,
      getParamsFromContext: VideoUploadRequestContext => Record[String, Any],
      sendRequest: VideoUploadRequestContext => Record[String, Any]
    ): VideoUploadRequestManager = {
      val __obj = js.Dynamic.literal(_api = _api.asInstanceOf[js.Any], getParamsFromContext = js.Any.fromFunction1(getParamsFromContext), sendRequest = js.Any.fromFunction1(sendRequest))
      __obj.asInstanceOf[VideoUploadRequestManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoUploadRequestManager] (val x: Self) extends AnyVal {
      
      inline def setGetParamsFromContext(value: VideoUploadRequestContext => Record[String, Any]): Self = StObject.set(x, "getParamsFromContext", js.Any.fromFunction1(value))
      
      inline def setSendRequest(value: VideoUploadRequestContext => Record[String, Any]): Self = StObject.set(x, "sendRequest", js.Any.fromFunction1(value))
      
      inline def set_api(value: default): Self = StObject.set(x, "_api", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoUploadSession extends StObject {
    
    var _accountId: String
    
    var _api: default
    
    var _endOffset: Double
    
    var _filePath: js.UndefOr[String | Null] = js.undefined
    
    var _finishRequestManager: VideoUploadFinishRequestManager
    
    var _sessionId: String
    
    var _slideshowSpec: js.UndefOr[SlideshowSpec | Null] = js.undefined
    
    var _startOffset: Double
    
    var _startRequestManager: VideoUploadStartRequestManager
    
    var _transferRequestManager: VideoUploadTransferRequestManager
    
    var _video: typings.facebookNodejsBusinessSdk.srcObjectsAdVideoMod.default
    
    var _waitForEncoding: Boolean
    
    def getFinishRequestContext(): VideoUploadRequestContext
    
    def getStartRequestContext(): VideoUploadRequestContext
    
    def getTransferRequestContext(): VideoUploadRequestContext
    
    def start(): Record[String, Any]
  }
  object VideoUploadSession {
    
    inline def apply(
      _accountId: String,
      _api: default,
      _endOffset: Double,
      _finishRequestManager: VideoUploadFinishRequestManager,
      _sessionId: String,
      _startOffset: Double,
      _startRequestManager: VideoUploadStartRequestManager,
      _transferRequestManager: VideoUploadTransferRequestManager,
      _video: typings.facebookNodejsBusinessSdk.srcObjectsAdVideoMod.default,
      _waitForEncoding: Boolean,
      getFinishRequestContext: () => VideoUploadRequestContext,
      getStartRequestContext: () => VideoUploadRequestContext,
      getTransferRequestContext: () => VideoUploadRequestContext,
      start: () => Record[String, Any]
    ): VideoUploadSession = {
      val __obj = js.Dynamic.literal(_accountId = _accountId.asInstanceOf[js.Any], _api = _api.asInstanceOf[js.Any], _endOffset = _endOffset.asInstanceOf[js.Any], _finishRequestManager = _finishRequestManager.asInstanceOf[js.Any], _sessionId = _sessionId.asInstanceOf[js.Any], _startOffset = _startOffset.asInstanceOf[js.Any], _startRequestManager = _startRequestManager.asInstanceOf[js.Any], _transferRequestManager = _transferRequestManager.asInstanceOf[js.Any], _video = _video.asInstanceOf[js.Any], _waitForEncoding = _waitForEncoding.asInstanceOf[js.Any], getFinishRequestContext = js.Any.fromFunction0(getFinishRequestContext), getStartRequestContext = js.Any.fromFunction0(getStartRequestContext), getTransferRequestContext = js.Any.fromFunction0(getTransferRequestContext), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[VideoUploadSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoUploadSession] (val x: Self) extends AnyVal {
      
      inline def setGetFinishRequestContext(value: () => VideoUploadRequestContext): Self = StObject.set(x, "getFinishRequestContext", js.Any.fromFunction0(value))
      
      inline def setGetStartRequestContext(value: () => VideoUploadRequestContext): Self = StObject.set(x, "getStartRequestContext", js.Any.fromFunction0(value))
      
      inline def setGetTransferRequestContext(value: () => VideoUploadRequestContext): Self = StObject.set(x, "getTransferRequestContext", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Record[String, Any]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def set_accountId(value: String): Self = StObject.set(x, "_accountId", value.asInstanceOf[js.Any])
      
      inline def set_api(value: default): Self = StObject.set(x, "_api", value.asInstanceOf[js.Any])
      
      inline def set_endOffset(value: Double): Self = StObject.set(x, "_endOffset", value.asInstanceOf[js.Any])
      
      inline def set_filePath(value: String): Self = StObject.set(x, "_filePath", value.asInstanceOf[js.Any])
      
      inline def set_filePathNull: Self = StObject.set(x, "_filePath", null)
      
      inline def set_filePathUndefined: Self = StObject.set(x, "_filePath", js.undefined)
      
      inline def set_finishRequestManager(value: VideoUploadFinishRequestManager): Self = StObject.set(x, "_finishRequestManager", value.asInstanceOf[js.Any])
      
      inline def set_sessionId(value: String): Self = StObject.set(x, "_sessionId", value.asInstanceOf[js.Any])
      
      inline def set_slideshowSpec(value: SlideshowSpec): Self = StObject.set(x, "_slideshowSpec", value.asInstanceOf[js.Any])
      
      inline def set_slideshowSpecNull: Self = StObject.set(x, "_slideshowSpec", null)
      
      inline def set_slideshowSpecUndefined: Self = StObject.set(x, "_slideshowSpec", js.undefined)
      
      inline def set_startOffset(value: Double): Self = StObject.set(x, "_startOffset", value.asInstanceOf[js.Any])
      
      inline def set_startRequestManager(value: VideoUploadStartRequestManager): Self = StObject.set(x, "_startRequestManager", value.asInstanceOf[js.Any])
      
      inline def set_transferRequestManager(value: VideoUploadTransferRequestManager): Self = StObject.set(x, "_transferRequestManager", value.asInstanceOf[js.Any])
      
      inline def set_video(value: typings.facebookNodejsBusinessSdk.srcObjectsAdVideoMod.default): Self = StObject.set(x, "_video", value.asInstanceOf[js.Any])
      
      inline def set_waitForEncoding(value: Boolean): Self = StObject.set(x, "_waitForEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoUploadStartRequestManager
    extends StObject
       with VideoUploadRequestManager
  object VideoUploadStartRequestManager {
    
    inline def apply(
      _api: default,
      getParamsFromContext: VideoUploadRequestContext => Record[String, Any],
      sendRequest: VideoUploadRequestContext => Record[String, Any]
    ): VideoUploadStartRequestManager = {
      val __obj = js.Dynamic.literal(_api = _api.asInstanceOf[js.Any], getParamsFromContext = js.Any.fromFunction1(getParamsFromContext), sendRequest = js.Any.fromFunction1(sendRequest))
      __obj.asInstanceOf[VideoUploadStartRequestManager]
    }
  }
  
  trait VideoUploadTransferRequestManager
    extends StObject
       with VideoUploadRequestManager {
    
    var _endOffset: Double
    
    var _startOffset: Double
  }
  object VideoUploadTransferRequestManager {
    
    inline def apply(
      _api: default,
      _endOffset: Double,
      _startOffset: Double,
      getParamsFromContext: VideoUploadRequestContext => Record[String, Any],
      sendRequest: VideoUploadRequestContext => Record[String, Any]
    ): VideoUploadTransferRequestManager = {
      val __obj = js.Dynamic.literal(_api = _api.asInstanceOf[js.Any], _endOffset = _endOffset.asInstanceOf[js.Any], _startOffset = _startOffset.asInstanceOf[js.Any], getParamsFromContext = js.Any.fromFunction1(getParamsFromContext), sendRequest = js.Any.fromFunction1(sendRequest))
      __obj.asInstanceOf[VideoUploadTransferRequestManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoUploadTransferRequestManager] (val x: Self) extends AnyVal {
      
      inline def set_endOffset(value: Double): Self = StObject.set(x, "_endOffset", value.asInstanceOf[js.Any])
      
      inline def set_startOffset(value: Double): Self = StObject.set(x, "_startOffset", value.asInstanceOf[js.Any])
    }
  }
}
