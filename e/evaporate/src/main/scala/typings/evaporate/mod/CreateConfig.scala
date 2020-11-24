package typings.evaporate.mod

import typings.evaporate.evaporateStrings.`2`
import typings.evaporate.evaporateStrings.`4`
import typings.std.ArrayBuffer
import typings.std.File
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfig extends js.Object {
  
  var abortCompletionThrottlingMs: js.UndefOr[Double] = js.native
  
  var allowS3ExistenceOptimization: js.UndefOr[Boolean] = js.native
  
  var awsRegion: js.UndefOr[String] = js.native
  
  var awsSignatureVersion: js.UndefOr[`2` | `4`] = js.native
  
  var aws_key: js.UndefOr[String] = js.native
  
  var aws_url: js.UndefOr[String] = js.native
  
  var bucket: String = js.native
  
  var cloudfront: js.UndefOr[Boolean] = js.native
  
  var computeContentMd5: js.UndefOr[Boolean] = js.native
  
  var cryptoHexEncodedHash256: js.UndefOr[Null | (js.Function1[/* data */ String | ArrayBuffer | Null, String])] = js.native
  
  var cryptoMd5Method: js.UndefOr[Null | (js.Function1[/* data */ ArrayBuffer, String])] = js.native
  
  var customAuthMethod: js.UndefOr[
    Null | (js.Function5[
      /* signParams */ String, 
      /* signHeaders */ String, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      /* canonicalRequest */ String, 
      js.Promise[String]
    ])
  ] = js.native
  
  var encodeFilename: js.UndefOr[Boolean] = js.native
  
  var evaporateChanged: js.UndefOr[js.Function2[/* evaporate */ Evaporate, /* evaporatingCount */ Double, Unit]] = js.native
  
  var localTimeOffset: js.UndefOr[Double] = js.native
  
  var logging: js.UndefOr[Boolean] = js.native
  
  var maxConcurrentParts: js.UndefOr[Double] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var maxRetryBackoffSecs: js.UndefOr[Double] = js.native
  
  var mockLocalStorage: js.UndefOr[Boolean] = js.native
  
  var onlyRetryForSameFileName: js.UndefOr[Boolean] = js.native
  
  var partSize: js.UndefOr[Double] = js.native
  
  var progressIntervalMS: js.UndefOr[Double] = js.native
  
  var readableStreamPartMethod: js.UndefOr[
    Null | (js.Function3[/* file */ File, /* start */ Double, /* end */ Double, ReadableStream[_]])
  ] = js.native
  
  var readableStreams: js.UndefOr[Boolean] = js.native
  
  var retryBackoffPower: js.UndefOr[Double] = js.native
  
  var s3Acceleration: js.UndefOr[Boolean] = js.native
  
  var s3FileCacheHoursAgo: js.UndefOr[Null | Double] = js.native
  
  var sendCanonicalRequestToSignerUrl: js.UndefOr[Boolean] = js.native
  
  var signHeaders: js.UndefOr[js.Object] = js.native
  
  var signParams: js.UndefOr[js.Object] = js.native
  
  var signResponseHandler: js.UndefOr[
    Null | (js.Function3[
      /* response */ js.Any, 
      /* stringToSign */ String, 
      /* signatureDateTime */ String, 
      js.Promise[String]
    ])
  ] = js.native
  
  var signerUrl: js.UndefOr[String] = js.native
  
  var timeUrl: js.UndefOr[String] = js.native
  
  var xhrWithCredentials: js.UndefOr[Boolean] = js.native
}
object CreateConfig {
  
  @scala.inline
  def apply(bucket: String): CreateConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfig]
  }
  
  @scala.inline
  implicit class CreateConfigOps[Self <: CreateConfig] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortCompletionThrottlingMs(value: Double): Self = this.set("abortCompletionThrottlingMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortCompletionThrottlingMs: Self = this.set("abortCompletionThrottlingMs", js.undefined)
    
    @scala.inline
    def setAllowS3ExistenceOptimization(value: Boolean): Self = this.set("allowS3ExistenceOptimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowS3ExistenceOptimization: Self = this.set("allowS3ExistenceOptimization", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: String): Self = this.set("awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("awsRegion", js.undefined)
    
    @scala.inline
    def setAwsSignatureVersion(value: `2` | `4`): Self = this.set("awsSignatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsSignatureVersion: Self = this.set("awsSignatureVersion", js.undefined)
    
    @scala.inline
    def setAws_key(value: String): Self = this.set("aws_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAws_key: Self = this.set("aws_key", js.undefined)
    
    @scala.inline
    def setAws_url(value: String): Self = this.set("aws_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAws_url: Self = this.set("aws_url", js.undefined)
    
    @scala.inline
    def setCloudfront(value: Boolean): Self = this.set("cloudfront", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudfront: Self = this.set("cloudfront", js.undefined)
    
    @scala.inline
    def setComputeContentMd5(value: Boolean): Self = this.set("computeContentMd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeContentMd5: Self = this.set("computeContentMd5", js.undefined)
    
    @scala.inline
    def setCryptoHexEncodedHash256(value: /* data */ String | ArrayBuffer | Null => String): Self = this.set("cryptoHexEncodedHash256", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCryptoHexEncodedHash256: Self = this.set("cryptoHexEncodedHash256", js.undefined)
    
    @scala.inline
    def setCryptoHexEncodedHash256Null: Self = this.set("cryptoHexEncodedHash256", null)
    
    @scala.inline
    def setCryptoMd5Method(value: /* data */ ArrayBuffer => String): Self = this.set("cryptoMd5Method", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCryptoMd5Method: Self = this.set("cryptoMd5Method", js.undefined)
    
    @scala.inline
    def setCryptoMd5MethodNull: Self = this.set("cryptoMd5Method", null)
    
    @scala.inline
    def setCustomAuthMethod(
      value: (/* signParams */ String, /* signHeaders */ String, /* stringToSign */ String, /* signatureDateTime */ String, /* canonicalRequest */ String) => js.Promise[String]
    ): Self = this.set("customAuthMethod", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteCustomAuthMethod: Self = this.set("customAuthMethod", js.undefined)
    
    @scala.inline
    def setCustomAuthMethodNull: Self = this.set("customAuthMethod", null)
    
    @scala.inline
    def setEncodeFilename(value: Boolean): Self = this.set("encodeFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeFilename: Self = this.set("encodeFilename", js.undefined)
    
    @scala.inline
    def setEvaporateChanged(value: (/* evaporate */ Evaporate, /* evaporatingCount */ Double) => Unit): Self = this.set("evaporateChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEvaporateChanged: Self = this.set("evaporateChanged", js.undefined)
    
    @scala.inline
    def setLocalTimeOffset(value: Double): Self = this.set("localTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalTimeOffset: Self = this.set("localTimeOffset", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMaxConcurrentParts(value: Double): Self = this.set("maxConcurrentParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentParts: Self = this.set("maxConcurrentParts", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = this.set("maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFileSize: Self = this.set("maxFileSize", js.undefined)
    
    @scala.inline
    def setMaxRetryBackoffSecs(value: Double): Self = this.set("maxRetryBackoffSecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetryBackoffSecs: Self = this.set("maxRetryBackoffSecs", js.undefined)
    
    @scala.inline
    def setMockLocalStorage(value: Boolean): Self = this.set("mockLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMockLocalStorage: Self = this.set("mockLocalStorage", js.undefined)
    
    @scala.inline
    def setOnlyRetryForSameFileName(value: Boolean): Self = this.set("onlyRetryForSameFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyRetryForSameFileName: Self = this.set("onlyRetryForSameFileName", js.undefined)
    
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    
    @scala.inline
    def setProgressIntervalMS(value: Double): Self = this.set("progressIntervalMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressIntervalMS: Self = this.set("progressIntervalMS", js.undefined)
    
    @scala.inline
    def setReadableStreamPartMethod(value: (/* file */ File, /* start */ Double, /* end */ Double) => ReadableStream[_]): Self = this.set("readableStreamPartMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReadableStreamPartMethod: Self = this.set("readableStreamPartMethod", js.undefined)
    
    @scala.inline
    def setReadableStreamPartMethodNull: Self = this.set("readableStreamPartMethod", null)
    
    @scala.inline
    def setReadableStreams(value: Boolean): Self = this.set("readableStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableStreams: Self = this.set("readableStreams", js.undefined)
    
    @scala.inline
    def setRetryBackoffPower(value: Double): Self = this.set("retryBackoffPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryBackoffPower: Self = this.set("retryBackoffPower", js.undefined)
    
    @scala.inline
    def setS3Acceleration(value: Boolean): Self = this.set("s3Acceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Acceleration: Self = this.set("s3Acceleration", js.undefined)
    
    @scala.inline
    def setS3FileCacheHoursAgo(value: Double): Self = this.set("s3FileCacheHoursAgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3FileCacheHoursAgo: Self = this.set("s3FileCacheHoursAgo", js.undefined)
    
    @scala.inline
    def setS3FileCacheHoursAgoNull: Self = this.set("s3FileCacheHoursAgo", null)
    
    @scala.inline
    def setSendCanonicalRequestToSignerUrl(value: Boolean): Self = this.set("sendCanonicalRequestToSignerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendCanonicalRequestToSignerUrl: Self = this.set("sendCanonicalRequestToSignerUrl", js.undefined)
    
    @scala.inline
    def setSignHeaders(value: js.Object): Self = this.set("signHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignHeaders: Self = this.set("signHeaders", js.undefined)
    
    @scala.inline
    def setSignParams(value: js.Object): Self = this.set("signParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignParams: Self = this.set("signParams", js.undefined)
    
    @scala.inline
    def setSignResponseHandler(
      value: (/* response */ js.Any, /* stringToSign */ String, /* signatureDateTime */ String) => js.Promise[String]
    ): Self = this.set("signResponseHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSignResponseHandler: Self = this.set("signResponseHandler", js.undefined)
    
    @scala.inline
    def setSignResponseHandlerNull: Self = this.set("signResponseHandler", null)
    
    @scala.inline
    def setSignerUrl(value: String): Self = this.set("signerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerUrl: Self = this.set("signerUrl", js.undefined)
    
    @scala.inline
    def setTimeUrl(value: String): Self = this.set("timeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUrl: Self = this.set("timeUrl", js.undefined)
    
    @scala.inline
    def setXhrWithCredentials(value: Boolean): Self = this.set("xhrWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrWithCredentials: Self = this.set("xhrWithCredentials", js.undefined)
  }
}
