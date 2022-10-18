package typings.googleGax

import typings.googleGax.buildSrcApitypesMod.GRPCCall
import typings.googleGax.buildSrcApitypesMod.GaxCall
import typings.googleGax.buildSrcDescriptorMod.Descriptor
import typings.googleGax.buildSrcGaxMod.CallSettings
import typings.googleGax.googleGaxStrings.proto
import typings.googleGax.googleGaxStrings.rest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCreateApiCallMod {
  
  @JSImport("google-gax/build/src/createApiCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(
    func: js.Promise[GRPCCall],
    settings: CallSettings,
    descriptor: Descriptor,
    _fallback: proto | rest
  ): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
}
