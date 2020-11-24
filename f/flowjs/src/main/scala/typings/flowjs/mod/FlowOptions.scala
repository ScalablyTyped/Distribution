package typings.flowjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowOptions extends js.Object {
  
  var allowDuplicateUploads: js.UndefOr[Boolean] = js.native
  
  var chunkRetryInterval: js.UndefOr[Double] = js.native
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var fileParameterName: js.UndefOr[String] = js.native
  
  var forceChunkSize: js.UndefOr[Boolean] = js.native
  
  var generateUniqueIdentifier: js.UndefOr[js.Function1[/* file */ FlowFile, _]] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var initFileFn: js.UndefOr[js.Function2[/* file */ FlowFile, /* chunk */ FlowChunk, Unit]] = js.native
  
  var maxChunkRetries: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var permanentErrors: js.UndefOr[js.Array[String]] = js.native
  
  var preprocess: js.UndefOr[js.Function1[/* chunk */ FlowChunk, Unit]] = js.native
  
  var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.native
  
  var progressCallbacksInterval: js.UndefOr[Double] = js.native
  
  var query: js.UndefOr[js.Object] = js.native
  
  var readFileFn: js.UndefOr[
    js.Function5[
      /* file */ FlowFile, 
      /* startByte */ Double, 
      /* endByte */ Double, 
      /* fileType */ String, 
      /* chunk */ FlowChunk, 
      Unit
    ]
  ] = js.native
  
  var simultaneousUploads: js.UndefOr[Double] = js.native
  
  var singleFile: js.UndefOr[Boolean] = js.native
  
  var speedSmoothingFactor: js.UndefOr[Double] = js.native
  
  var successStatuses: js.UndefOr[js.Array[String]] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var testChunks: js.UndefOr[Boolean] = js.native
  
  var testMethod: js.UndefOr[String] = js.native
  
  var uploadMethod: js.UndefOr[String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object FlowOptions {
  
  @scala.inline
  def apply(): FlowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowOptions]
  }
  
  @scala.inline
  implicit class FlowOptionsOps[Self <: FlowOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDuplicateUploads(value: Boolean): Self = this.set("allowDuplicateUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicateUploads: Self = this.set("allowDuplicateUploads", js.undefined)
    
    @scala.inline
    def setChunkRetryInterval(value: Double): Self = this.set("chunkRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkRetryInterval: Self = this.set("chunkRetryInterval", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setFileParameterName(value: String): Self = this.set("fileParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileParameterName: Self = this.set("fileParameterName", js.undefined)
    
    @scala.inline
    def setForceChunkSize(value: Boolean): Self = this.set("forceChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceChunkSize: Self = this.set("forceChunkSize", js.undefined)
    
    @scala.inline
    def setGenerateUniqueIdentifier(value: /* file */ FlowFile => _): Self = this.set("generateUniqueIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGenerateUniqueIdentifier: Self = this.set("generateUniqueIdentifier", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setInitFileFn(value: (/* file */ FlowFile, /* chunk */ FlowChunk) => Unit): Self = this.set("initFileFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInitFileFn: Self = this.set("initFileFn", js.undefined)
    
    @scala.inline
    def setMaxChunkRetries(value: Double): Self = this.set("maxChunkRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxChunkRetries: Self = this.set("maxChunkRetries", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPermanentErrorsVarargs(value: String*): Self = this.set("permanentErrors", js.Array(value :_*))
    
    @scala.inline
    def setPermanentErrors(value: js.Array[String]): Self = this.set("permanentErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanentErrors: Self = this.set("permanentErrors", js.undefined)
    
    @scala.inline
    def setPreprocess(value: /* chunk */ FlowChunk => Unit): Self = this.set("preprocess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    
    @scala.inline
    def setPrioritizeFirstAndLastChunk(value: Boolean): Self = this.set("prioritizeFirstAndLastChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrioritizeFirstAndLastChunk: Self = this.set("prioritizeFirstAndLastChunk", js.undefined)
    
    @scala.inline
    def setProgressCallbacksInterval(value: Double): Self = this.set("progressCallbacksInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressCallbacksInterval: Self = this.set("progressCallbacksInterval", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setReadFileFn(
      value: (/* file */ FlowFile, /* startByte */ Double, /* endByte */ Double, /* fileType */ String, /* chunk */ FlowChunk) => Unit
    ): Self = this.set("readFileFn", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteReadFileFn: Self = this.set("readFileFn", js.undefined)
    
    @scala.inline
    def setSimultaneousUploads(value: Double): Self = this.set("simultaneousUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimultaneousUploads: Self = this.set("simultaneousUploads", js.undefined)
    
    @scala.inline
    def setSingleFile(value: Boolean): Self = this.set("singleFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleFile: Self = this.set("singleFile", js.undefined)
    
    @scala.inline
    def setSpeedSmoothingFactor(value: Double): Self = this.set("speedSmoothingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedSmoothingFactor: Self = this.set("speedSmoothingFactor", js.undefined)
    
    @scala.inline
    def setSuccessStatusesVarargs(value: String*): Self = this.set("successStatuses", js.Array(value :_*))
    
    @scala.inline
    def setSuccessStatuses(value: js.Array[String]): Self = this.set("successStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessStatuses: Self = this.set("successStatuses", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTestChunks(value: Boolean): Self = this.set("testChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestChunks: Self = this.set("testChunks", js.undefined)
    
    @scala.inline
    def setTestMethod(value: String): Self = this.set("testMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMethod: Self = this.set("testMethod", js.undefined)
    
    @scala.inline
    def setUploadMethod(value: String): Self = this.set("uploadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadMethod: Self = this.set("uploadMethod", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
