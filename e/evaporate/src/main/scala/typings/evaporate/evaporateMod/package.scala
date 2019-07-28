package typings.evaporate

import typings.evaporate.evaporateStrings.abortCompletionThrottlingMs
import typings.evaporate.evaporateStrings.allowS3ExistenceOptimization
import typings.evaporate.evaporateStrings.awsRegion
import typings.evaporate.evaporateStrings.awsSignatureVersion
import typings.evaporate.evaporateStrings.aws_key
import typings.evaporate.evaporateStrings.aws_url
import typings.evaporate.evaporateStrings.bucket
import typings.evaporate.evaporateStrings.cloudfront
import typings.evaporate.evaporateStrings.computeContentMd5
import typings.evaporate.evaporateStrings.cryptoHexEncodedHash256
import typings.evaporate.evaporateStrings.cryptoMd5Method
import typings.evaporate.evaporateStrings.customAuthMethod
import typings.evaporate.evaporateStrings.encodeFilename
import typings.evaporate.evaporateStrings.localTimeOffset
import typings.evaporate.evaporateStrings.logging
import typings.evaporate.evaporateStrings.maxConcurrentParts
import typings.evaporate.evaporateStrings.maxFileSize
import typings.evaporate.evaporateStrings.maxRetryBackoffSecs
import typings.evaporate.evaporateStrings.mockLocalStorage
import typings.evaporate.evaporateStrings.onlyRetryForSameFileName
import typings.evaporate.evaporateStrings.partSize
import typings.evaporate.evaporateStrings.progressIntervalMS
import typings.evaporate.evaporateStrings.readableStreamPartMethod
import typings.evaporate.evaporateStrings.readableStreams
import typings.evaporate.evaporateStrings.retryBackoffPower
import typings.evaporate.evaporateStrings.s3Acceleration
import typings.evaporate.evaporateStrings.s3FileCacheHoursAgo
import typings.evaporate.evaporateStrings.sendCanonicalRequestToSignerUrl
import typings.evaporate.evaporateStrings.signHeaders
import typings.evaporate.evaporateStrings.signParams
import typings.evaporate.evaporateStrings.signResponseHandler
import typings.evaporate.evaporateStrings.signerUrl
import typings.evaporate.evaporateStrings.timeUrl
import typings.evaporate.evaporateStrings.xhrWithCredentials
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object evaporateMod {
  type AddOverrideOptionKeys = Exclude[
    readableStreams | readableStreamPartMethod | bucket | logging | maxConcurrentParts | partSize | retryBackoffPower | maxRetryBackoffSecs | progressIntervalMS | cloudfront | s3Acceleration | mockLocalStorage | encodeFilename | computeContentMd5 | allowS3ExistenceOptimization | onlyRetryForSameFileName | timeUrl | cryptoMd5Method | cryptoHexEncodedHash256 | aws_url | aws_key | awsRegion | awsSignatureVersion | signerUrl | sendCanonicalRequestToSignerUrl | s3FileCacheHoursAgo | signParams | signHeaders | customAuthMethod | maxFileSize | signResponseHandler | xhrWithCredentials | localTimeOffset | abortCompletionThrottlingMs, 
    ImmutableOptionKeys
  ]
  type AddOverrideOptions = Pick[CreateConfig, AddOverrideOptionKeys]
}
