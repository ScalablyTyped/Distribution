package typings
package evaporateLib.evaporateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfig extends js.Object {
  var abortCompletionThrottlingMs: js.UndefOr[scala.Double] = js.undefined
  var allowS3ExistenceOptimization: js.UndefOr[scala.Boolean] = js.undefined
  var awsRegion: js.UndefOr[java.lang.String] = js.undefined
  var awsSignatureVersion: js.UndefOr[evaporateLib.evaporateLibStrings.`2` | evaporateLib.evaporateLibStrings.`4`] = js.undefined
  var aws_key: js.UndefOr[java.lang.String] = js.undefined
  var aws_url: js.UndefOr[java.lang.String] = js.undefined
  var bucket: java.lang.String
  var cloudfront: js.UndefOr[scala.Boolean] = js.undefined
  var computeContentMd5: js.UndefOr[scala.Boolean] = js.undefined
  var cryptoHexEncodedHash256: js.UndefOr[
    scala.Null | (js.Function1[/* data */ java.lang.String | stdLib.ArrayBuffer | scala.Null, java.lang.String])
  ] = js.undefined
  var cryptoMd5Method: js.UndefOr[scala.Null | (js.Function1[/* data */ stdLib.ArrayBuffer, java.lang.String])] = js.undefined
  var customAuthMethod: js.UndefOr[
    scala.Null | (js.Function5[
      /* signParams */ java.lang.String, 
      /* signHeaders */ java.lang.String, 
      /* stringToSign */ java.lang.String, 
      /* signatureDateTime */ java.lang.String, 
      /* canonicalRequest */ java.lang.String, 
      js.Promise[java.lang.String]
    ])
  ] = js.undefined
  var encodeFilename: js.UndefOr[scala.Boolean] = js.undefined
  var evaporateChanged: js.UndefOr[
    js.Function2[/* evaporate */ Evaporate, /* evaporatingCount */ scala.Double, scala.Unit]
  ] = js.undefined
  var localTimeOffset: js.UndefOr[scala.Double] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var maxConcurrentParts: js.UndefOr[scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var maxRetryBackoffSecs: js.UndefOr[scala.Double] = js.undefined
  var mockLocalStorage: js.UndefOr[scala.Boolean] = js.undefined
  var onlyRetryForSameFileName: js.UndefOr[scala.Boolean] = js.undefined
  var partSize: js.UndefOr[scala.Double] = js.undefined
  var progressIntervalMS: js.UndefOr[scala.Double] = js.undefined
  var readableStreamPartMethod: js.UndefOr[
    scala.Null | (js.Function3[
      /* file */ stdLib.File, 
      /* start */ scala.Double, 
      /* end */ scala.Double, 
      stdLib.ReadableStream[_]
    ])
  ] = js.undefined
  var readableStreams: js.UndefOr[scala.Boolean] = js.undefined
  var retryBackoffPower: js.UndefOr[scala.Double] = js.undefined
  var s3Acceleration: js.UndefOr[scala.Boolean] = js.undefined
  var s3FileCacheHoursAgo: js.UndefOr[scala.Null | scala.Double] = js.undefined
  var sendCanonicalRequestToSignerUrl: js.UndefOr[scala.Boolean] = js.undefined
  var signHeaders: js.UndefOr[js.Object] = js.undefined
  var signParams: js.UndefOr[js.Object] = js.undefined
  var signResponseHandler: js.UndefOr[
    scala.Null | (js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ java.lang.String, 
      /* signatureDateTime */ java.lang.String, 
      js.Promise[java.lang.String]
    ])
  ] = js.undefined
  var signerUrl: js.UndefOr[java.lang.String] = js.undefined
  var timeUrl: js.UndefOr[java.lang.String] = js.undefined
  var xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateConfig {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    abortCompletionThrottlingMs: scala.Int | scala.Double = null,
    allowS3ExistenceOptimization: js.UndefOr[scala.Boolean] = js.undefined,
    awsRegion: java.lang.String = null,
    awsSignatureVersion: evaporateLib.evaporateLibStrings.`2` | evaporateLib.evaporateLibStrings.`4` = null,
    aws_key: java.lang.String = null,
    aws_url: java.lang.String = null,
    cloudfront: js.UndefOr[scala.Boolean] = js.undefined,
    computeContentMd5: js.UndefOr[scala.Boolean] = js.undefined,
    cryptoHexEncodedHash256: /* data */ java.lang.String | stdLib.ArrayBuffer | scala.Null => java.lang.String = null,
    cryptoMd5Method: /* data */ stdLib.ArrayBuffer => java.lang.String = null,
    customAuthMethod: (/* signParams */ java.lang.String, /* signHeaders */ java.lang.String, /* stringToSign */ java.lang.String, /* signatureDateTime */ java.lang.String, /* canonicalRequest */ java.lang.String) => js.Promise[java.lang.String] = null,
    encodeFilename: js.UndefOr[scala.Boolean] = js.undefined,
    evaporateChanged: (/* evaporate */ Evaporate, /* evaporatingCount */ scala.Double) => scala.Unit = null,
    localTimeOffset: scala.Int | scala.Double = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    maxConcurrentParts: scala.Int | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    maxRetryBackoffSecs: scala.Int | scala.Double = null,
    mockLocalStorage: js.UndefOr[scala.Boolean] = js.undefined,
    onlyRetryForSameFileName: js.UndefOr[scala.Boolean] = js.undefined,
    partSize: scala.Int | scala.Double = null,
    progressIntervalMS: scala.Int | scala.Double = null,
    readableStreamPartMethod: (/* file */ stdLib.File, /* start */ scala.Double, /* end */ scala.Double) => stdLib.ReadableStream[_] = null,
    readableStreams: js.UndefOr[scala.Boolean] = js.undefined,
    retryBackoffPower: scala.Int | scala.Double = null,
    s3Acceleration: js.UndefOr[scala.Boolean] = js.undefined,
    s3FileCacheHoursAgo: scala.Int | scala.Double = null,
    sendCanonicalRequestToSignerUrl: js.UndefOr[scala.Boolean] = js.undefined,
    signHeaders: js.Object = null,
    signParams: js.Object = null,
    signResponseHandler: (/* response */ js.Any, /* stringToSign */ java.lang.String, /* signatureDateTime */ java.lang.String) => js.Promise[java.lang.String] = null,
    signerUrl: java.lang.String = null,
    timeUrl: java.lang.String = null,
    xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (abortCompletionThrottlingMs != null) __obj.updateDynamic("abortCompletionThrottlingMs")(abortCompletionThrottlingMs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowS3ExistenceOptimization)) __obj.updateDynamic("allowS3ExistenceOptimization")(allowS3ExistenceOptimization)
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion)
    if (awsSignatureVersion != null) __obj.updateDynamic("awsSignatureVersion")(awsSignatureVersion.asInstanceOf[js.Any])
    if (aws_key != null) __obj.updateDynamic("aws_key")(aws_key)
    if (aws_url != null) __obj.updateDynamic("aws_url")(aws_url)
    if (!js.isUndefined(cloudfront)) __obj.updateDynamic("cloudfront")(cloudfront)
    if (!js.isUndefined(computeContentMd5)) __obj.updateDynamic("computeContentMd5")(computeContentMd5)
    if (cryptoHexEncodedHash256 != null) __obj.updateDynamic("cryptoHexEncodedHash256")(js.Any.fromFunction1(cryptoHexEncodedHash256))
    if (cryptoMd5Method != null) __obj.updateDynamic("cryptoMd5Method")(js.Any.fromFunction1(cryptoMd5Method))
    if (customAuthMethod != null) __obj.updateDynamic("customAuthMethod")(js.Any.fromFunction5(customAuthMethod))
    if (!js.isUndefined(encodeFilename)) __obj.updateDynamic("encodeFilename")(encodeFilename)
    if (evaporateChanged != null) __obj.updateDynamic("evaporateChanged")(js.Any.fromFunction2(evaporateChanged))
    if (localTimeOffset != null) __obj.updateDynamic("localTimeOffset")(localTimeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (maxConcurrentParts != null) __obj.updateDynamic("maxConcurrentParts")(maxConcurrentParts.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxRetryBackoffSecs != null) __obj.updateDynamic("maxRetryBackoffSecs")(maxRetryBackoffSecs.asInstanceOf[js.Any])
    if (!js.isUndefined(mockLocalStorage)) __obj.updateDynamic("mockLocalStorage")(mockLocalStorage)
    if (!js.isUndefined(onlyRetryForSameFileName)) __obj.updateDynamic("onlyRetryForSameFileName")(onlyRetryForSameFileName)
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (progressIntervalMS != null) __obj.updateDynamic("progressIntervalMS")(progressIntervalMS.asInstanceOf[js.Any])
    if (readableStreamPartMethod != null) __obj.updateDynamic("readableStreamPartMethod")(js.Any.fromFunction3(readableStreamPartMethod))
    if (!js.isUndefined(readableStreams)) __obj.updateDynamic("readableStreams")(readableStreams)
    if (retryBackoffPower != null) __obj.updateDynamic("retryBackoffPower")(retryBackoffPower.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Acceleration)) __obj.updateDynamic("s3Acceleration")(s3Acceleration)
    if (s3FileCacheHoursAgo != null) __obj.updateDynamic("s3FileCacheHoursAgo")(s3FileCacheHoursAgo.asInstanceOf[js.Any])
    if (!js.isUndefined(sendCanonicalRequestToSignerUrl)) __obj.updateDynamic("sendCanonicalRequestToSignerUrl")(sendCanonicalRequestToSignerUrl)
    if (signHeaders != null) __obj.updateDynamic("signHeaders")(signHeaders)
    if (signParams != null) __obj.updateDynamic("signParams")(signParams)
    if (signResponseHandler != null) __obj.updateDynamic("signResponseHandler")(js.Any.fromFunction3(signResponseHandler))
    if (signerUrl != null) __obj.updateDynamic("signerUrl")(signerUrl)
    if (timeUrl != null) __obj.updateDynamic("timeUrl")(timeUrl)
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials)
    __obj.asInstanceOf[CreateConfig]
  }
}

