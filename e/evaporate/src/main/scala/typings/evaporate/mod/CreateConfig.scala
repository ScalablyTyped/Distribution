package typings.evaporate.mod

import typings.evaporate.evaporateStrings.`2`
import typings.evaporate.evaporateStrings.`4`
import typings.std.ArrayBuffer
import typings.std.File
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfig extends js.Object {
  var abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined
  var allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.undefined
  var awsRegion: js.UndefOr[String] = js.undefined
  var awsSignatureVersion: js.UndefOr[`2` | `4`] = js.undefined
  var aws_key: js.UndefOr[String] = js.undefined
  var aws_url: js.UndefOr[String] = js.undefined
  var bucket: String
  var cloudfront: js.UndefOr[Boolean] = js.undefined
  var computeContentMd5: js.UndefOr[Boolean] = js.undefined
  var cryptoHexEncodedHash256: js.UndefOr[Null | (js.Function1[/* data */ String | ArrayBuffer | Null, String])] = js.undefined
  var cryptoMd5Method: js.UndefOr[Null | (js.Function1[/* data */ ArrayBuffer, String])] = js.undefined
  var customAuthMethod: js.UndefOr[
    Null | (js.Function5[
      /* signParams */ String, 
      /* signHeaders */ String, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      /* canonicalRequest */ String, 
      js.Promise[String]
    ])
  ] = js.undefined
  var encodeFilename: js.UndefOr[Boolean] = js.undefined
  var evaporateChanged: js.UndefOr[js.Function2[/* evaporate */ Evaporate, /* evaporatingCount */ Double, Unit]] = js.undefined
  var localTimeOffset: js.UndefOr[Double] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var maxConcurrentParts: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined
  var mockLocalStorage: js.UndefOr[Boolean] = js.undefined
  var onlyRetryForSameFileName: js.UndefOr[Boolean] = js.undefined
  var partSize: js.UndefOr[Double] = js.undefined
  var progressIntervalMS: js.UndefOr[Double] = js.undefined
  var readableStreamPartMethod: js.UndefOr[
    Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]])
  ] = js.undefined
  var readableStreams: js.UndefOr[Boolean] = js.undefined
  var retryBackoffPower: js.UndefOr[Double] = js.undefined
  var s3Acceleration: js.UndefOr[Boolean] = js.undefined
  var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.undefined
  var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined
  var signHeaders: js.UndefOr[js.Object] = js.undefined
  var signParams: js.UndefOr[js.Object] = js.undefined
  var signResponseHandler: js.UndefOr[
    Null | (js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      js.Promise[String]
    ])
  ] = js.undefined
  var signerUrl: js.UndefOr[String] = js.undefined
  var timeUrl: js.UndefOr[String] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object CreateConfig {
  @scala.inline
  def apply(
    bucket: String,
    abortCompletionThrottlingMs: js.UndefOr[Double] = js.undefined,
    allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.undefined,
    awsRegion: String = null,
    awsSignatureVersion: `2` | `4` = null,
    aws_key: String = null,
    aws_url: String = null,
    cloudfront: js.UndefOr[Boolean] = js.undefined,
    computeContentMd5: js.UndefOr[Boolean] = js.undefined,
    cryptoHexEncodedHash256: js.UndefOr[Null | (/* data */ String | ArrayBuffer | Null => String)] = js.undefined,
    cryptoMd5Method: js.UndefOr[Null | (/* data */ ArrayBuffer => String)] = js.undefined,
    customAuthMethod: js.UndefOr[
      Null | ((/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String])
    ] = js.undefined,
    encodeFilename: js.UndefOr[Boolean] = js.undefined,
    evaporateChanged: (/* evaporate */ Evaporate, /* evaporatingCount */ Double) => Unit = null,
    localTimeOffset: js.UndefOr[Double] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    maxConcurrentParts: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    maxRetryBackoffSecs: js.UndefOr[Double] = js.undefined,
    mockLocalStorage: js.UndefOr[Boolean] = js.undefined,
    onlyRetryForSameFileName: js.UndefOr[Boolean] = js.undefined,
    partSize: js.UndefOr[Double] = js.undefined,
    progressIntervalMS: js.UndefOr[Double] = js.undefined,
    readableStreamPartMethod: js.UndefOr[
      Null | ((/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_])
    ] = js.undefined,
    readableStreams: js.UndefOr[Boolean] = js.undefined,
    retryBackoffPower: js.UndefOr[Double] = js.undefined,
    s3Acceleration: js.UndefOr[Boolean] = js.undefined,
    s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.undefined,
    sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined,
    signHeaders: js.Object = null,
    signParams: js.Object = null,
    signResponseHandler: js.UndefOr[
      Null | ((/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String])
    ] = js.undefined,
    signerUrl: String = null,
    timeUrl: String = null,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): CreateConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (!js.isUndefined(abortCompletionThrottlingMs)) __obj.updateDynamic("abortCompletionThrottlingMs")(abortCompletionThrottlingMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowS3ExistenceOptimization)) __obj.updateDynamic("allowS3ExistenceOptimization")(allowS3ExistenceOptimization.get.asInstanceOf[js.Any])
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    if (awsSignatureVersion != null) __obj.updateDynamic("awsSignatureVersion")(awsSignatureVersion.asInstanceOf[js.Any])
    if (aws_key != null) __obj.updateDynamic("aws_key")(aws_key.asInstanceOf[js.Any])
    if (aws_url != null) __obj.updateDynamic("aws_url")(aws_url.asInstanceOf[js.Any])
    if (!js.isUndefined(cloudfront)) __obj.updateDynamic("cloudfront")(cloudfront.get.asInstanceOf[js.Any])
    if (!js.isUndefined(computeContentMd5)) __obj.updateDynamic("computeContentMd5")(computeContentMd5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cryptoHexEncodedHash256)) __obj.updateDynamic("cryptoHexEncodedHash256")(if (cryptoHexEncodedHash256 != null) js.Any.fromFunction1(cryptoHexEncodedHash256.asInstanceOf[/* data */ String | ArrayBuffer | Null => String]) else null)
    if (!js.isUndefined(cryptoMd5Method)) __obj.updateDynamic("cryptoMd5Method")(if (cryptoMd5Method != null) js.Any.fromFunction1(cryptoMd5Method.asInstanceOf[/* data */ ArrayBuffer => String]) else null)
    if (!js.isUndefined(customAuthMethod)) __obj.updateDynamic("customAuthMethod")(if (customAuthMethod != null) js.Any.fromFunction5(customAuthMethod.asInstanceOf[(/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]]) else null)
    if (!js.isUndefined(encodeFilename)) __obj.updateDynamic("encodeFilename")(encodeFilename.get.asInstanceOf[js.Any])
    if (evaporateChanged != null) __obj.updateDynamic("evaporateChanged")(js.Any.fromFunction2(evaporateChanged))
    if (!js.isUndefined(localTimeOffset)) __obj.updateDynamic("localTimeOffset")(localTimeOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentParts)) __obj.updateDynamic("maxConcurrentParts")(maxConcurrentParts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryBackoffSecs)) __obj.updateDynamic("maxRetryBackoffSecs")(maxRetryBackoffSecs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocalStorage)) __obj.updateDynamic("mockLocalStorage")(mockLocalStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRetryForSameFileName)) __obj.updateDynamic("onlyRetryForSameFileName")(onlyRetryForSameFileName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partSize)) __obj.updateDynamic("partSize")(partSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressIntervalMS)) __obj.updateDynamic("progressIntervalMS")(progressIntervalMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readableStreamPartMethod)) __obj.updateDynamic("readableStreamPartMethod")(if (readableStreamPartMethod != null) js.Any.fromFunction3(readableStreamPartMethod.asInstanceOf[(/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_]]) else null)
    if (!js.isUndefined(readableStreams)) __obj.updateDynamic("readableStreams")(readableStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryBackoffPower)) __obj.updateDynamic("retryBackoffPower")(retryBackoffPower.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Acceleration)) __obj.updateDynamic("s3Acceleration")(s3Acceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3FileCacheHoursAgo)) __obj.updateDynamic("s3FileCacheHoursAgo")(s3FileCacheHoursAgo.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCanonicalRequestToSignerUrl)) __obj.updateDynamic("sendCanonicalRequestToSignerUrl")(sendCanonicalRequestToSignerUrl.get.asInstanceOf[js.Any])
    if (signHeaders != null) __obj.updateDynamic("signHeaders")(signHeaders.asInstanceOf[js.Any])
    if (signParams != null) __obj.updateDynamic("signParams")(signParams.asInstanceOf[js.Any])
    if (!js.isUndefined(signResponseHandler)) __obj.updateDynamic("signResponseHandler")(if (signResponseHandler != null) js.Any.fromFunction3(signResponseHandler.asInstanceOf[(/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]]) else null)
    if (signerUrl != null) __obj.updateDynamic("signerUrl")(signerUrl.asInstanceOf[js.Any])
    if (timeUrl != null) __obj.updateDynamic("timeUrl")(timeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfig]
  }
}

