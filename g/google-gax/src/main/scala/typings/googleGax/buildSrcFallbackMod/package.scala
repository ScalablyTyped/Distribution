package typings.googleGax.buildSrcFallbackMod

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.mod.BaseExternalAccountClient
import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GaxCall
import typings.googleGax.buildSrcDescriptorMod.Descriptor
import typings.googleGax.buildSrcFallbackMod.^
import typings.googleGax.buildSrcGaxMod.BackoffSettings
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.buildSrcGaxMod.ClientConfig
import typings.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typings.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typings.googleGax.buildSrcOperationsClientMod.OperationsClientBuilder
import typings.googleGax.googleGaxStrings.proto
import typings.googleGax.googleGaxStrings.rest
import typings.protobufjs.mod.Method
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
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(func: GRPCCall, settings: typings.googleGax.buildSrcGaxMod.CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(func: GRPCCall, settings: typings.googleGax.buildSrcGaxMod.CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typings.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]

inline def createDefaultBackoffSettings(): BackoffSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[BackoffSettings]

inline def fallback: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("fallback").asInstanceOf[Any]

inline def lro(options: GrpcClientOptions): OperationsClientBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("lro")(options.asInstanceOf[js.Any]).asInstanceOf[OperationsClientBuilder]

inline def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]
inline def operation(
  op: LROOperation,
  longrunningDescriptor: LongRunningDescriptor,
  backoffSettings: BackoffSettings,
  callOptions: CallOptions
): typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def warn(code: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def warn(code: String, message: String, warnType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], warnType.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AuthClient = OAuth2Client | Compute | JWT | UserRefreshClient | BaseExternalAccountClient

type ServiceMethods = StringDictionary[Method]
