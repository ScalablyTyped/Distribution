package typings.expo.expoMod

import typings.reactDashNative.reactDashNativeMod.EventEmitter
import typings.reactDashNative.reactDashNativeMod.EventSubscriptionVendor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Linking")
@js.native
/**
  *
  * @param subscriber - Optional subscriber instance
  *   to use. If omitted, a new subscriber will be created for the emitter.
  */
class Linking () extends EventEmitter {
  def this(subscriber: EventSubscriptionVendor) = this()
}

