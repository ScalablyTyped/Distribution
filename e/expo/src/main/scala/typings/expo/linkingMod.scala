package typings.expo

import org.scalablytyped.runtime.TopLevel
import typings.expo.linkingTypesMod.ParsedURL
import typings.expo.linkingTypesMod.QueryParams
import typings.reactNative.mod.EventEmitter
import typings.reactNative.mod.EventSubscriptionVendor
import typings.reactNative.mod.LinkingStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Linking/Linking", JSImport.Namespace)
@js.native
object linkingMod extends js.Object {
  @js.native
  trait ExpoLinking extends LinkingStatic {
    var makeUrl: js.Function2[/* path */ js.UndefOr[String], /* queryParams */ js.UndefOr[QueryParams], String] = js.native
    var parse: js.Function1[/* url */ String, ParsedURL] = js.native
    var parseInitialURLAsync: js.Function0[js.Promise[ParsedURL]] = js.native
  }
  
  @js.native
  /**
    *
    * @param subscriber - Optional subscriber instance
    *   to use. If omitted, a new subscriber will be created for the emitter.
    */
  class default () extends EventEmitter {
    def this(subscriber: EventSubscriptionVendor) = this()
  }
  
  @js.native
  object default extends TopLevel[ExpoLinking]
  
}

