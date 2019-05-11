package typings
package googleDashGaxLib.buildSrcGaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/gax", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): js.Any = js.native
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double],
    otherArgs: js.Object
  ): js.Any = js.native
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: ClientConfig,
    configOverrides: ClientConfig,
    retryNames: org.scalablytyped.runtime.StringDictionary[scala.Double],
    otherArgs: js.Object,
    promise: stdLib.PromiseConstructor
  ): js.Any = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Double,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Null,
    rpcTimeoutMultiplier: scala.Null,
    maxRpcTimeoutMillis: scala.Null,
    totalTimeoutMillis: scala.Double
  ): BackoffSettings = js.native
  def createBundleOptions(options: BundlingConfig): googleDashGaxLib.buildSrcBundlingMod.BundleOptions = js.native
  def createMaxRetriesBackoffSettings(
    initialRetryDelayMillis: scala.Double,
    retryDelayMultiplier: scala.Double,
    maxRetryDelayMillis: scala.Double,
    initialRpcTimeoutMillis: scala.Double,
    rpcTimeoutMultiplier: scala.Double,
    maxRpcTimeoutMillis: scala.Double,
    maxRetries: scala.Double
  ): BackoffSettings = js.native
  def createRetryOptions(retryCodes: js.Array[scala.Double], backoffSettings: BackoffSettings): RetryOptions = js.native
}

