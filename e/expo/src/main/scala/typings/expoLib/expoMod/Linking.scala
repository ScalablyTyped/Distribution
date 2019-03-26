package typings
package expoLib.expoMod

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
class Linking ()
  extends reactDashNativeLib.reactDashNativeMod.EventEmitter {
  def this(subscriber: reactDashNativeLib.reactDashNativeMod.EventSubscriptionVendor) = this()
}

