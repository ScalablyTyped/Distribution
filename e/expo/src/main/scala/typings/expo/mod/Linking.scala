package typings.expo.mod

import org.scalablytyped.runtime.TopLevel
import typings.expo.linkingMod.ExpoLinking
import typings.reactNative.mod.EventEmitter
import typings.reactNative.mod.EventSubscriptionVendor
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

@JSImport("expo", "Linking")
@js.native
object Linking extends TopLevel[ExpoLinking]

