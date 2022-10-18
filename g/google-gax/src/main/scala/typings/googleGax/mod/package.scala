package typings.googleGax.mod

import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GaxCall
import typings.googleGax.buildSrcBundlingCallsBundleExecutorMod.BundleOptions
import typings.googleGax.buildSrcDescriptorMod.Descriptor
import typings.googleGax.buildSrcGaxMod.BackoffSettings
import typings.googleGax.buildSrcGaxMod.BundlingConfig
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGaxMod.ClientConfig
import typings.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typings.googleGax.googleGaxStrings.proto
import typings.googleGax.googleGaxStrings.rest
import typings.googleGax.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def constructSettings(
  serviceName: String,
  clientConfig: ClientConfig,
  configOverrides: ClientConfig,
  retryNames: js.Object
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def constructSettings(
  serviceName: String,
  clientConfig: ClientConfig,
  configOverrides: ClientConfig,
  retryNames: js.Object,
  otherArgs: js.Object
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def createApiCall(func: js.Promise[GRPCCall], settings: typings.googleGax.buildSrcGaxMod.CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  _fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  _fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  _fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  _fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(func: GRPCCall, settings: typings.googleGax.buildSrcGaxMod.CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  _fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  _fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(func: GRPCCall, settings: typings.googleGax.buildSrcGaxMod.CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  _fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  _fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]

inline def createBackoffSettings(initialRetryDelayMillis: Double, retryDelayMultiplier: Double, maxRetryDelayMillis: Double): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Double,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Null,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Double,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Null,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Double,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Null,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Double,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]
inline def createBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Null,
  rpcTimeoutMultiplier: Null,
  maxRpcTimeoutMillis: Null,
  totalTimeoutMillis: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]

inline def createBundleOptions(options: BundlingConfig): BundleOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("createBundleOptions")(options.asInstanceOf[js.Any]).asInstanceOf[BundleOptions]

inline def createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("createByteLengthFunction").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ Any]

inline def createDefaultBackoffSettings(): BackoffSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[BackoffSettings]

inline def createMaxRetriesBackoffSettings(
  initialRetryDelayMillis: Double,
  retryDelayMultiplier: Double,
  maxRetryDelayMillis: Double,
  initialRpcTimeoutMillis: Double,
  rpcTimeoutMultiplier: Double,
  maxRpcTimeoutMillis: Double,
  maxRetries: Double
): BackoffSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("createMaxRetriesBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[BackoffSettings]

inline def createRetryOptions(retryCodes: js.Array[Double], backoffSettings: BackoffSettings): typings.googleGax.buildSrcGaxMod.RetryOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOptions")(retryCodes.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.buildSrcGaxMod.RetryOptions]

inline def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]
inline def operation(
  op: LROOperation,
  longrunningDescriptor: LongRunningDescriptor,
  backoffSettings: BackoffSettings,
  callOptions: CallOptions
): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]

inline def version: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[Any]

inline def warn(code: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def warn(code: String, message: String, warnType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], warnType.asInstanceOf[js.Any])).asInstanceOf[Unit]
