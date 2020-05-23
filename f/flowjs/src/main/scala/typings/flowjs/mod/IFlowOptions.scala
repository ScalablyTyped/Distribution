package typings.flowjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlowOptions extends js.Object {
  var allowDuplicateUploads: js.UndefOr[Boolean] = js.undefined
  var chunkRetryInterval: js.UndefOr[Double] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var fileParameterName: js.UndefOr[String] = js.undefined
  var forceChunkSize: js.UndefOr[Boolean] = js.undefined
  var generateUniqueIdentifier: js.UndefOr[js.Function] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var initFileFn: js.UndefOr[js.Function] = js.undefined
  var maxChunkRetries: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var permanentErrors: js.UndefOr[js.Array[String]] = js.undefined
  var preprocess: js.UndefOr[js.Function] = js.undefined
  var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined
  var progressCallbacksInterval: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var simultaneousUploads: js.UndefOr[Double] = js.undefined
  var singleFile: js.UndefOr[Boolean] = js.undefined
  var speedSmoothingFactor: js.UndefOr[Double] = js.undefined
  var successStatuses: js.UndefOr[js.Array[String]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var testChunks: js.UndefOr[Boolean] = js.undefined
  var testMethod: js.UndefOr[String] = js.undefined
  var uploadMethod: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object IFlowOptions {
  @scala.inline
  def apply(
    allowDuplicateUploads: js.UndefOr[Boolean] = js.undefined,
    chunkRetryInterval: js.UndefOr[Double] = js.undefined,
    chunkSize: js.UndefOr[Double] = js.undefined,
    fileParameterName: String = null,
    forceChunkSize: js.UndefOr[Boolean] = js.undefined,
    generateUniqueIdentifier: js.Function = null,
    headers: js.Object = null,
    initFileFn: js.Function = null,
    maxChunkRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    permanentErrors: js.Array[String] = null,
    preprocess: js.Function = null,
    prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined,
    progressCallbacksInterval: js.UndefOr[Double] = js.undefined,
    query: js.Object = null,
    simultaneousUploads: js.UndefOr[Double] = js.undefined,
    singleFile: js.UndefOr[Boolean] = js.undefined,
    speedSmoothingFactor: js.UndefOr[Double] = js.undefined,
    successStatuses: js.Array[String] = null,
    target: String = null,
    testChunks: js.UndefOr[Boolean] = js.undefined,
    testMethod: String = null,
    uploadMethod: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IFlowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicateUploads)) __obj.updateDynamic("allowDuplicateUploads")(allowDuplicateUploads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkRetryInterval)) __obj.updateDynamic("chunkRetryInterval")(chunkRetryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (fileParameterName != null) __obj.updateDynamic("fileParameterName")(fileParameterName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceChunkSize)) __obj.updateDynamic("forceChunkSize")(forceChunkSize.get.asInstanceOf[js.Any])
    if (generateUniqueIdentifier != null) __obj.updateDynamic("generateUniqueIdentifier")(generateUniqueIdentifier.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (initFileFn != null) __obj.updateDynamic("initFileFn")(initFileFn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxChunkRetries)) __obj.updateDynamic("maxChunkRetries")(maxChunkRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (permanentErrors != null) __obj.updateDynamic("permanentErrors")(permanentErrors.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess.asInstanceOf[js.Any])
    if (!js.isUndefined(prioritizeFirstAndLastChunk)) __obj.updateDynamic("prioritizeFirstAndLastChunk")(prioritizeFirstAndLastChunk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressCallbacksInterval)) __obj.updateDynamic("progressCallbacksInterval")(progressCallbacksInterval.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousUploads)) __obj.updateDynamic("simultaneousUploads")(simultaneousUploads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleFile)) __obj.updateDynamic("singleFile")(singleFile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speedSmoothingFactor)) __obj.updateDynamic("speedSmoothingFactor")(speedSmoothingFactor.get.asInstanceOf[js.Any])
    if (successStatuses != null) __obj.updateDynamic("successStatuses")(successStatuses.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(testChunks)) __obj.updateDynamic("testChunks")(testChunks.get.asInstanceOf[js.Any])
    if (testMethod != null) __obj.updateDynamic("testMethod")(testMethod.asInstanceOf[js.Any])
    if (uploadMethod != null) __obj.updateDynamic("uploadMethod")(uploadMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlowOptions]
  }
}

