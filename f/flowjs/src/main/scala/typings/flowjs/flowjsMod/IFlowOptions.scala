package typings.flowjs.flowjsMod

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
    chunkRetryInterval: Int | Double = null,
    chunkSize: Int | Double = null,
    fileParameterName: String = null,
    forceChunkSize: js.UndefOr[Boolean] = js.undefined,
    generateUniqueIdentifier: js.Function = null,
    headers: js.Object = null,
    initFileFn: js.Function = null,
    maxChunkRetries: Int | Double = null,
    method: String = null,
    permanentErrors: js.Array[String] = null,
    preprocess: js.Function = null,
    prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.undefined,
    progressCallbacksInterval: Int | Double = null,
    query: js.Object = null,
    simultaneousUploads: Int | Double = null,
    singleFile: js.UndefOr[Boolean] = js.undefined,
    speedSmoothingFactor: Int | Double = null,
    successStatuses: js.Array[String] = null,
    target: String = null,
    testChunks: js.UndefOr[Boolean] = js.undefined,
    testMethod: String = null,
    uploadMethod: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IFlowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicateUploads)) __obj.updateDynamic("allowDuplicateUploads")(allowDuplicateUploads)
    if (chunkRetryInterval != null) __obj.updateDynamic("chunkRetryInterval")(chunkRetryInterval.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (fileParameterName != null) __obj.updateDynamic("fileParameterName")(fileParameterName)
    if (!js.isUndefined(forceChunkSize)) __obj.updateDynamic("forceChunkSize")(forceChunkSize)
    if (generateUniqueIdentifier != null) __obj.updateDynamic("generateUniqueIdentifier")(generateUniqueIdentifier)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (initFileFn != null) __obj.updateDynamic("initFileFn")(initFileFn)
    if (maxChunkRetries != null) __obj.updateDynamic("maxChunkRetries")(maxChunkRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (permanentErrors != null) __obj.updateDynamic("permanentErrors")(permanentErrors)
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (!js.isUndefined(prioritizeFirstAndLastChunk)) __obj.updateDynamic("prioritizeFirstAndLastChunk")(prioritizeFirstAndLastChunk)
    if (progressCallbacksInterval != null) __obj.updateDynamic("progressCallbacksInterval")(progressCallbacksInterval.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (simultaneousUploads != null) __obj.updateDynamic("simultaneousUploads")(simultaneousUploads.asInstanceOf[js.Any])
    if (!js.isUndefined(singleFile)) __obj.updateDynamic("singleFile")(singleFile)
    if (speedSmoothingFactor != null) __obj.updateDynamic("speedSmoothingFactor")(speedSmoothingFactor.asInstanceOf[js.Any])
    if (successStatuses != null) __obj.updateDynamic("successStatuses")(successStatuses)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(testChunks)) __obj.updateDynamic("testChunks")(testChunks)
    if (testMethod != null) __obj.updateDynamic("testMethod")(testMethod)
    if (uploadMethod != null) __obj.updateDynamic("uploadMethod")(uploadMethod)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[IFlowOptions]
  }
}

