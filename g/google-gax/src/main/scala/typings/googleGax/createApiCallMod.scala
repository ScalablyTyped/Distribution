package typings.googleGax

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GaxCall
import typings.googleGax.descriptorMod.Descriptor
import typings.googleGax.gaxMod.CallSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/createApiCall", JSImport.Namespace)
@js.native
object createApiCallMod extends js.Object {
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = js.native
  def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = js.native
  def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = js.native
}

