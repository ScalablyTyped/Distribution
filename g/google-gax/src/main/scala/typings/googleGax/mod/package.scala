package typings.googleGax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def constructSettings(
  serviceName: java.lang.String,
  clientConfig: typings.googleGax.gaxMod.ClientConfig,
  configOverrides: typings.googleGax.gaxMod.ClientConfig,
  retryNames: js.Object
): js.Any = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
@scala.inline
def constructSettings(
  serviceName: java.lang.String,
  clientConfig: typings.googleGax.gaxMod.ClientConfig,
  configOverrides: typings.googleGax.gaxMod.ClientConfig,
  retryNames: js.Object,
  otherArgs: js.Object
): js.Any = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def createApiCall(
  func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
  settings: typings.googleGax.gaxMod.CallSettings
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
@scala.inline
def createApiCall(
  func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
  settings: typings.googleGax.gaxMod.CallSettings,
  descriptor: typings.googleGax.descriptorMod.Descriptor
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
@scala.inline
def createApiCall(func: typings.googleGax.apitypesMod.GRPCCall, settings: typings.googleGax.gaxMod.CallSettings): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
@scala.inline
def createApiCall(
  func: typings.googleGax.apitypesMod.GRPCCall,
  settings: typings.googleGax.gaxMod.CallSettings,
  descriptor: typings.googleGax.descriptorMod.Descriptor
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]

@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Double,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Null,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Double,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Null,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Double,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Null,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Double,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]
@scala.inline
def createBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Null,
  rpcTimeoutMultiplier: scala.Null,
  maxRpcTimeoutMillis: scala.Null,
  totalTimeoutMillis: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], totalTimeoutMillis.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]

@scala.inline
def createBundleOptions(options: typings.googleGax.gaxMod.BundlingConfig): typings.googleGax.bundleExecutorMod.BundleOptions = typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBundleOptions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.bundleExecutorMod.BundleOptions]

@scala.inline
def createByteLengthFunction: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ js.Any = typings.googleGax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("createByteLengthFunction").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GrpcClient.createByteLengthFunction */ js.Any]

@scala.inline
def createDefaultBackoffSettings(): typings.googleGax.gaxMod.BackoffSettings = typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]

@scala.inline
def createMaxRetriesBackoffSettings(
  initialRetryDelayMillis: scala.Double,
  retryDelayMultiplier: scala.Double,
  maxRetryDelayMillis: scala.Double,
  initialRpcTimeoutMillis: scala.Double,
  rpcTimeoutMultiplier: scala.Double,
  maxRpcTimeoutMillis: scala.Double,
  maxRetries: scala.Double
): typings.googleGax.gaxMod.BackoffSettings = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMaxRetriesBackoffSettings")(initialRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier.asInstanceOf[js.Any], maxRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis.asInstanceOf[js.Any], rpcTimeoutMultiplier.asInstanceOf[js.Any], maxRpcTimeoutMillis.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.BackoffSettings]

@scala.inline
def createRetryOptions(retryCodes: js.Array[scala.Double], backoffSettings: typings.googleGax.gaxMod.BackoffSettings): typings.googleGax.gaxMod.RetryOptions = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOptions")(retryCodes.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.gaxMod.RetryOptions]

@scala.inline
def operation(
  op: typings.googleGax.longrunningMod.LROOperation,
  longrunningDescriptor: typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor,
  backoffSettings: typings.googleGax.gaxMod.BackoffSettings
): typings.googleGax.longrunningMod.Operation_ = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.longrunningMod.Operation_]
@scala.inline
def operation(
  op: typings.googleGax.longrunningMod.LROOperation,
  longrunningDescriptor: typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor,
  backoffSettings: typings.googleGax.gaxMod.BackoffSettings,
  callOptions: typings.googleGax.gaxMod.CallOptions
): typings.googleGax.longrunningMod.Operation_ = (typings.googleGax.mod.^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.longrunningMod.Operation_]

@scala.inline
def version: js.Any = typings.googleGax.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[js.Any]
