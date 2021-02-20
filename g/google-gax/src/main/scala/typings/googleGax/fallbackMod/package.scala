package typings.googleGax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fallbackMod {
  
  type FallbackServiceStub = org.scalablytyped.runtime.StringDictionary[js.Function]
  
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typings.googleGax.gaxMod.ClientConfig,
    configOverrides: typings.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object
  ): js.Any = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def constructSettings(
    serviceName: java.lang.String,
    clientConfig: typings.googleGax.gaxMod.ClientConfig,
    configOverrides: typings.googleGax.gaxMod.ClientConfig,
    retryNames: js.Object,
    otherArgs: js.Object
  ): js.Any = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createApiCall(
    func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
    settings: typings.googleGax.gaxMod.CallSettings
  ): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: js.Promise[typings.googleGax.apitypesMod.GRPCCall],
    settings: typings.googleGax.gaxMod.CallSettings,
    descriptor: typings.googleGax.descriptorMod.Descriptor
  ): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(func: typings.googleGax.apitypesMod.GRPCCall, settings: typings.googleGax.gaxMod.CallSettings): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
  @scala.inline
  def createApiCall(
    func: typings.googleGax.apitypesMod.GRPCCall,
    settings: typings.googleGax.gaxMod.CallSettings,
    descriptor: typings.googleGax.descriptorMod.Descriptor
  ): typings.googleGax.apitypesMod.GaxCall = (typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.apitypesMod.GaxCall]
  
  @scala.inline
  def fallback: js.Any = typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].selectDynamic("fallback").asInstanceOf[js.Any]
  
  @scala.inline
  def lro(options: typings.googleGax.grpcMod.GrpcClientOptions): typings.googleGax.operationsClientMod.OperationsClientBuilder = typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].applyDynamic("lro")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.operationsClientMod.OperationsClientBuilder]
  
  @scala.inline
  def version: java.lang.String = typings.googleGax.fallbackMod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
