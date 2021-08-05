package typings.googleGax.mod.fallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def constructSettings(
  serviceName: java.lang.String,
  clientConfig: typings.googleGax.gaxMod.ClientConfig,
  configOverrides: typings.googleGax.gaxMod.ClientConfig,
  retryNames: js.Object
): js.Any = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def constructSettings(
  serviceName: java.lang.String,
  clientConfig: typings.googleGax.gaxMod.ClientConfig,
  configOverrides: typings.googleGax.gaxMod.ClientConfig,
  retryNames: js.Object,
  otherArgs: js.Object
): js.Any = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def createApiCall(
  func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
  settings: typings.googleGax.gaxMod.CallSettings
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
inline def createApiCall(
  func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
  settings: typings.googleGax.gaxMod.CallSettings,
  descriptor: typings.googleGax.descriptorMod.Descriptor
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
inline def createApiCall(func: typings.googleGax.apitypesMod.GRPCCall, settings: typings.googleGax.gaxMod.CallSettings): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
inline def createApiCall(
  func: typings.googleGax.apitypesMod.GRPCCall,
  settings: typings.googleGax.gaxMod.CallSettings,
  descriptor: typings.googleGax.descriptorMod.Descriptor
): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]

inline def fallback: js.Any = typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].selectDynamic("fallback").asInstanceOf[js.Any]

inline def lro(options: typings.googleGax.grpcMod.GrpcClientOptions): typings.googleGax.operationsClientMod.OperationsClientBuilder = typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].applyDynamic("lro")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsClientMod.OperationsClientBuilder]

inline def version: java.lang.String = typings.googleGax.mod.fallback.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
