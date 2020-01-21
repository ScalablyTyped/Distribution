package typings.evaporate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddOverrideOptionKeys = typings.std.Exclude[
    typings.evaporate.evaporateStrings.readableStreams | typings.evaporate.evaporateStrings.readableStreamPartMethod | typings.evaporate.evaporateStrings.bucket | typings.evaporate.evaporateStrings.logging | typings.evaporate.evaporateStrings.maxConcurrentParts | typings.evaporate.evaporateStrings.partSize | typings.evaporate.evaporateStrings.retryBackoffPower | typings.evaporate.evaporateStrings.maxRetryBackoffSecs | typings.evaporate.evaporateStrings.progressIntervalMS | typings.evaporate.evaporateStrings.cloudfront | typings.evaporate.evaporateStrings.s3Acceleration | typings.evaporate.evaporateStrings.mockLocalStorage | typings.evaporate.evaporateStrings.encodeFilename | typings.evaporate.evaporateStrings.computeContentMd5 | typings.evaporate.evaporateStrings.allowS3ExistenceOptimization | typings.evaporate.evaporateStrings.onlyRetryForSameFileName | typings.evaporate.evaporateStrings.timeUrl | typings.evaporate.evaporateStrings.cryptoMd5Method | typings.evaporate.evaporateStrings.cryptoHexEncodedHash256 | typings.evaporate.evaporateStrings.aws_url | typings.evaporate.evaporateStrings.aws_key | typings.evaporate.evaporateStrings.awsRegion | typings.evaporate.evaporateStrings.awsSignatureVersion | typings.evaporate.evaporateStrings.signerUrl | typings.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl | typings.evaporate.evaporateStrings.s3FileCacheHoursAgo | typings.evaporate.evaporateStrings.signParams | typings.evaporate.evaporateStrings.signHeaders | typings.evaporate.evaporateStrings.customAuthMethod | typings.evaporate.evaporateStrings.maxFileSize | typings.evaporate.evaporateStrings.signResponseHandler | typings.evaporate.evaporateStrings.xhrWithCredentials | typings.evaporate.evaporateStrings.localTimeOffset | typings.evaporate.evaporateStrings.abortCompletionThrottlingMs, 
    typings.evaporate.mod.ImmutableOptionKeys
  ]
  type AddOverrideOptions = typings.std.Pick[typings.evaporate.mod.CreateConfig, typings.evaporate.mod.AddOverrideOptionKeys]
}
