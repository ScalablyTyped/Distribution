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
    abortCompletionThrottlingMs: Int | Double = null,
    allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.undefined,
    awsRegion: String = null,
    awsSignatureVersion: `2` | `4` = null,
    aws_key: String = null,
    aws_url: String = null,
    cloudfront: js.UndefOr[Boolean] = js.undefined,
    computeContentMd5: js.UndefOr[Boolean] = js.undefined,
    cryptoHexEncodedHash256: /* data */ String | ArrayBuffer | Null => String = null,
    cryptoMd5Method: /* data */ ArrayBuffer => String = null,
    customAuthMethod: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String] = null,
    encodeFilename: js.UndefOr[Boolean] = js.undefined,
    evaporateChanged: (/* evaporate */ Evaporate, /* evaporatingCount */ Double) => Unit = null,
    localTimeOffset: Int | Double = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    maxConcurrentParts: Int | Double = null,
    maxFileSize: Int | Double = null,
    maxRetryBackoffSecs: Int | Double = null,
    mockLocalStorage: js.UndefOr[Boolean] = js.undefined,
    onlyRetryForSameFileName: js.UndefOr[Boolean] = js.undefined,
    partSize: Int | Double = null,
    progressIntervalMS: Int | Double = null,
    readableStreamPartMethod: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_] = null,
    readableStreams: js.UndefOr[Boolean] = js.undefined,
    retryBackoffPower: Int | Double = null,
    s3Acceleration: js.UndefOr[Boolean] = js.undefined,
    s3FileCacheHoursAgo: Int | Double = null,
    sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.undefined,
    signHeaders: js.Object = null,
    signParams: js.Object = null,
    signResponseHandler: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String] = null,
    signerUrl: String = null,
    timeUrl: String = null,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): CreateConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (abortCompletionThrottlingMs != null) __obj.updateDynamic("abortCompletionThrottlingMs")(abortCompletionThrottlingMs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowS3ExistenceOptimization)) __obj.updateDynamic("allowS3ExistenceOptimization")(allowS3ExistenceOptimization.asInstanceOf[js.Any])
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    if (awsSignatureVersion != null) __obj.updateDynamic("awsSignatureVersion")(awsSignatureVersion.asInstanceOf[js.Any])
    if (aws_key != null) __obj.updateDynamic("aws_key")(aws_key.asInstanceOf[js.Any])
    if (aws_url != null) __obj.updateDynamic("aws_url")(aws_url.asInstanceOf[js.Any])
    if (!js.isUndefined(cloudfront)) __obj.updateDynamic("cloudfront")(cloudfront.asInstanceOf[js.Any])
    if (!js.isUndefined(computeContentMd5)) __obj.updateDynamic("computeContentMd5")(computeContentMd5.asInstanceOf[js.Any])
    if (cryptoHexEncodedHash256 != null) __obj.updateDynamic("cryptoHexEncodedHash256")(js.Any.fromFunction1(cryptoHexEncodedHash256))
    if (cryptoMd5Method != null) __obj.updateDynamic("cryptoMd5Method")(js.Any.fromFunction1(cryptoMd5Method))
    if (customAuthMethod != null) __obj.updateDynamic("customAuthMethod")(js.Any.fromFunction5(customAuthMethod))
    if (!js.isUndefined(encodeFilename)) __obj.updateDynamic("encodeFilename")(encodeFilename.asInstanceOf[js.Any])
    if (evaporateChanged != null) __obj.updateDynamic("evaporateChanged")(js.Any.fromFunction2(evaporateChanged))
    if (localTimeOffset != null) __obj.updateDynamic("localTimeOffset")(localTimeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (maxConcurrentParts != null) __obj.updateDynamic("maxConcurrentParts")(maxConcurrentParts.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxRetryBackoffSecs != null) __obj.updateDynamic("maxRetryBackoffSecs")(maxRetryBackoffSecs.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocalStorage)) __obj.updateDynamic("mockLocalStorage")(mockLocalStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRetryForSameFileName)) __obj.updateDynamic("onlyRetryForSameFileName")(onlyRetryForSameFileName.asInstanceOf[js.Any])
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (progressIntervalMS != null) __obj.updateDynamic("progressIntervalMS")(progressIntervalMS.asInstanceOf[js.Any])
    if (readableStreamPartMethod != null) __obj.updateDynamic("readableStreamPartMethod")(js.Any.fromFunction3(readableStreamPartMethod))
    if (!js.isUndefined(readableStreams)) __obj.updateDynamic("readableStreams")(readableStreams.asInstanceOf[js.Any])
    if (retryBackoffPower != null) __obj.updateDynamic("retryBackoffPower")(retryBackoffPower.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Acceleration)) __obj.updateDynamic("s3Acceleration")(s3Acceleration.asInstanceOf[js.Any])
    if (s3FileCacheHoursAgo != null) __obj.updateDynamic("s3FileCacheHoursAgo")(s3FileCacheHoursAgo.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCanonicalRequestToSignerUrl)) __obj.updateDynamic("sendCanonicalRequestToSignerUrl")(sendCanonicalRequestToSignerUrl.asInstanceOf[js.Any])
    if (signHeaders != null) __obj.updateDynamic("signHeaders")(signHeaders.asInstanceOf[js.Any])
    if (signParams != null) __obj.updateDynamic("signParams")(signParams.asInstanceOf[js.Any])
    if (signResponseHandler != null) __obj.updateDynamic("signResponseHandler")(js.Any.fromFunction3(signResponseHandler))
    if (signerUrl != null) __obj.updateDynamic("signerUrl")(signerUrl.asInstanceOf[js.Any])
    if (timeUrl != null) __obj.updateDynamic("timeUrl")(timeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfig]
  }
}

