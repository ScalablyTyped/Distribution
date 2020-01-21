package typings.googleGax.fallbackMod

import typings.googleGax.apitypesMod.GRPCCall
import typings.googleGax.apitypesMod.GaxCall
import typings.googleGax.descriptorMod.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/fallback", "createApiCall")
@js.native
object createApiCall extends js.Object {
  def apply(func: js.Promise[GRPCCall], settings: typings.googleGax.gaxMod.CallSettings): GaxCall = js.native
  def apply(
    func: js.Promise[GRPCCall],
    settings: typings.googleGax.gaxMod.CallSettings,
    descriptor: Descriptor
  ): GaxCall = js.native
  def apply(func: GRPCCall, settings: typings.googleGax.gaxMod.CallSettings): GaxCall = js.native
  def apply(func: GRPCCall, settings: typings.googleGax.gaxMod.CallSettings, descriptor: Descriptor): GaxCall = js.native
}

