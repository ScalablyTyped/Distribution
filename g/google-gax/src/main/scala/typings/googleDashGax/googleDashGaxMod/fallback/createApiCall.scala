package typings.googleDashGax.googleDashGaxMod.fallback

import typings.googleDashGax.buildSrcApitypesMod.GRPCCall
import typings.googleDashGax.buildSrcApitypesMod.GaxCall
import typings.googleDashGax.buildSrcDescriptorMod.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.createApiCall")
@js.native
object createApiCall extends js.Object {
  def apply(func: js.Promise[GRPCCall], settings: typings.googleDashGax.buildSrcGaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: js.Promise[GRPCCall],
    settings: typings.googleDashGax.buildSrcGaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
  def apply(func: GRPCCall, settings: typings.googleDashGax.buildSrcGaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: GRPCCall,
    settings: typings.googleDashGax.buildSrcGaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
}

