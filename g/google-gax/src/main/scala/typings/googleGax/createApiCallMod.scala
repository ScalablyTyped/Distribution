package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GaxCall
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createApiCallMod {
  
  @JSImport("google-gax/build/src/createApiCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  @scala.inline
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  @scala.inline
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  @scala.inline
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
}
