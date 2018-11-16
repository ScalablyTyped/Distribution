package typings
package evaporateLib.evaporateMod.EvaporateNs

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
      stdLib.Promise[java.lang.String]
    ])
  ] = js.undefined
  var encodeFilename: js.UndefOr[scala.Boolean] = js.undefined
  var evaporateChanged: js.UndefOr[
    js.Function2[
      /* evaporate */ evaporateLib.evaporateMod.Evaporate, 
      /* evaporatingCount */ scala.Double, 
      scala.Unit
    ]
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
      stdLib.ReadableStream
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
      stdLib.Promise[java.lang.String]
    ])
  ] = js.undefined
  var signerUrl: js.UndefOr[java.lang.String] = js.undefined
  var timeUrl: js.UndefOr[java.lang.String] = js.undefined
  var xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

