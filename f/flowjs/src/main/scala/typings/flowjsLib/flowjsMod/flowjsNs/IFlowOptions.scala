package typings
package flowjsLib.flowjsMod.flowjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlowOptions extends js.Object {
  var allowDuplicateUploads: js.UndefOr[scala.Boolean] = js.undefined
  var chunkRetryInterval: js.UndefOr[scala.Double] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var fileParameterName: js.UndefOr[java.lang.String] = js.undefined
  var forceChunkSize: js.UndefOr[scala.Boolean] = js.undefined
  var generateUniqueIdentifier: js.UndefOr[js.Function] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var initFileFn: js.UndefOr[js.Function] = js.undefined
  var maxChunkRetries: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var permanentErrors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var preprocess: js.UndefOr[js.Function] = js.undefined
  var prioritizeFirstAndLastChunk: js.UndefOr[scala.Boolean] = js.undefined
  var progressCallbacksInterval: js.UndefOr[scala.Double] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
  var simultaneousUploads: js.UndefOr[scala.Double] = js.undefined
  var singleFile: js.UndefOr[scala.Boolean] = js.undefined
  var speedSmoothingFactor: js.UndefOr[scala.Double] = js.undefined
  var successStatuses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var testChunks: js.UndefOr[scala.Boolean] = js.undefined
  var testMethod: js.UndefOr[java.lang.String] = js.undefined
  var uploadMethod: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object IFlowOptions {
  @scala.inline
  def apply(
    allowDuplicateUploads: js.UndefOr[scala.Boolean] = js.undefined,
    chunkRetryInterval: scala.Int | scala.Double = null,
    chunkSize: scala.Int | scala.Double = null,
    fileParameterName: java.lang.String = null,
    forceChunkSize: js.UndefOr[scala.Boolean] = js.undefined,
    generateUniqueIdentifier: js.Function = null,
    headers: js.Object = null,
    initFileFn: js.Function = null,
    maxChunkRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    permanentErrors: js.Array[java.lang.String] = null,
    preprocess: js.Function = null,
    prioritizeFirstAndLastChunk: js.UndefOr[scala.Boolean] = js.undefined,
    progressCallbacksInterval: scala.Int | scala.Double = null,
    query: js.Object = null,
    simultaneousUploads: scala.Int | scala.Double = null,
    singleFile: js.UndefOr[scala.Boolean] = js.undefined,
    speedSmoothingFactor: scala.Int | scala.Double = null,
    successStatuses: js.Array[java.lang.String] = null,
    target: java.lang.String = null,
    testChunks: js.UndefOr[scala.Boolean] = js.undefined,
    testMethod: java.lang.String = null,
    uploadMethod: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
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

