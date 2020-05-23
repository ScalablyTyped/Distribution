package typings.evaporate.mod

import typings.std.File
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<evaporate.evaporate.CreateConfig, evaporate.evaporate.AddOverrideOptionKeys> */
trait AddOverrideOptions extends js.Object {
  var abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined
  var aws_key: js.UndefOr[String] = js.undefined
  var aws_url: js.UndefOr[String] = js.undefined
  var bucket: String
  var customAuthMethod: js.UndefOr[
    js.Function5[
      /* signParams */ String, 
      /* signHeaders */ String, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      /* canonicalRequest */ String, 
      js.Promise[String]
    ]
  ] = js.undefined
  var localTimeOffset: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined
  var mockLocalStorage: js.UndefOr[Boolean] = js.undefined
  var partSize: js.UndefOr[Double] = js.undefined
  var progressIntervalMS: js.UndefOr[Double] = js.undefined
  var readableStreamPartMethod: js.UndefOr[
    js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]]
  ] = js.undefined
  var readableStreams: js.UndefOr[Boolean] = js.undefined
  var retryBackoffPower: js.UndefOr[Double] = js.undefined
  var s3Acceleration: js.UndefOr[Boolean] = js.undefined
  var s3FileCacheHoursAgo: js.UndefOr[Double] = js.undefined
  var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined
  var signHeaders: js.UndefOr[js.Object] = js.undefined
  var signParams: js.UndefOr[js.Object] = js.undefined
  var signResponseHandler: js.UndefOr[
    js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      js.Promise[String]
    ]
  ] = js.undefined
  var signerUrl: js.UndefOr[String] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object AddOverrideOptions {
  @scala.inline
  def apply(
    bucket: String,
    abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined,
    aws_key: String = null,
    aws_url: String = null,
    customAuthMethod: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String] = null,
    localTimeOffset: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined,
    mockLocalStorage: js.UndefOr[Boolean] = js.undefined,
    partSize: js.UndefOr[Double] = js.undefined,
    progressIntervalMS: js.UndefOr[Double] = js.undefined,
    readableStreamPartMethod: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_] = null,
    readableStreams: js.UndefOr[Boolean] = js.undefined,
    retryBackoffPower: js.UndefOr[Double] = js.undefined,
    s3Acceleration: js.UndefOr[Boolean] = js.undefined,
    s3FileCacheHoursAgo: js.UndefOr[Double] = js.undefined,
    sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined,
    signHeaders: js.Object = null,
    signParams: js.Object = null,
    signResponseHandler: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String] = null,
    signerUrl: String = null,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): AddOverrideOptions = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(abortCompletionThrottlingMs)) __obj.updateDynamic("abortCompletionThrottlingMs")(abortCompletionThrottlingMs.get.asInstanceOf[js.Any])
    if (aws_key != null) __obj.updateDynamic("aws_key")(aws_key.asInstanceOf[js.Any])
    if (aws_url != null) __obj.updateDynamic("aws_url")(aws_url.asInstanceOf[js.Any])
    if (customAuthMethod != null) __obj.updateDynamic("customAuthMethod")(js.Any.fromFunction5(customAuthMethod))
    if (!js.isUndefined(localTimeOffset)) __obj.updateDynamic("localTimeOffset")(localTimeOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryBackoffSecs)) __obj.updateDynamic("maxRetryBackoffSecs")(maxRetryBackoffSecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocalStorage)) __obj.updateDynamic("mockLocalStorage")(mockLocalStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partSize)) __obj.updateDynamic("partSize")(partSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressIntervalMS)) __obj.updateDynamic("progressIntervalMS")(progressIntervalMS.get.asInstanceOf[js.Any])
    if (readableStreamPartMethod != null) __obj.updateDynamic("readableStreamPartMethod")(js.Any.fromFunction3(readableStreamPartMethod))
    if (!js.isUndefined(readableStreams)) __obj.updateDynamic("readableStreams")(readableStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryBackoffPower)) __obj.updateDynamic("retryBackoffPower")(retryBackoffPower.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Acceleration)) __obj.updateDynamic("s3Acceleration")(s3Acceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3FileCacheHoursAgo)) __obj.updateDynamic("s3FileCacheHoursAgo")(s3FileCacheHoursAgo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCanonicalRequestToSignerUrl)) __obj.updateDynamic("sendCanonicalRequestToSignerUrl")(sendCanonicalRequestToSignerUrl.get.asInstanceOf[js.Any])
    if (signHeaders != null) __obj.updateDynamic("signHeaders")(signHeaders.asInstanceOf[js.Any])
    if (signParams != null) __obj.updateDynamic("signParams")(signParams.asInstanceOf[js.Any])
    if (signResponseHandler != null) __obj.updateDynamic("signResponseHandler")(js.Any.fromFunction3(signResponseHandler))
    if (signerUrl != null) __obj.updateDynamic("signerUrl")(signerUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOverrideOptions]
  }
}

