package typings.expoConstants

import typings.expoConstants.constantsTypesMod.Constants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-constants", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Constants = js.native
  @js.native
  object AppOwnership extends js.Object {
    /* "expo" */ val Expo: typings.expoConstants.constantsTypesMod.AppOwnership.Expo with String = js.native
    /* "guest" */ val Guest: typings.expoConstants.constantsTypesMod.AppOwnership.Guest with String = js.native
    /* "standalone" */ val Standalone: typings.expoConstants.constantsTypesMod.AppOwnership.Standalone with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoConstants.constantsTypesMod.AppOwnership with String] = js.native
  }
  
  @js.native
  object UserInterfaceIdiom extends js.Object {
    /* "handset" */ val Handset: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Handset with String = js.native
    /* "tablet" */ val Tablet: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Tablet with String = js.native
    /* "unsupported" */ val Unsupported: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Unsupported with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoConstants.constantsTypesMod.UserInterfaceIdiom with String] = js.native
  }
  
}

