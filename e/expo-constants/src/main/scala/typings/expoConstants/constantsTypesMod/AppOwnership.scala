package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppOwnership extends StObject
@JSImport("expo-constants/build/Constants.types", "AppOwnership")
@js.native
object AppOwnership extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AppOwnership & String] = js.native
  
  /**
    * The experience is running inside of the Expo Go app.
    */
  @js.native
  sealed trait Expo
    extends StObject
       with AppOwnership
  /* "expo" */ val Expo: typings.expoConstants.constantsTypesMod.AppOwnership.Expo & String = js.native
  
  /**
    * It has been opened through a link from a standalone app.
    */
  @js.native
  sealed trait Guest
    extends StObject
       with AppOwnership
  /* "guest" */ val Guest: typings.expoConstants.constantsTypesMod.AppOwnership.Guest & String = js.native
  
  /**
    * It is a [standalone app](/classic/building-standalone-apps#building-standalone-apps).
    */
  @js.native
  sealed trait Standalone
    extends StObject
       with AppOwnership
  /* "standalone" */ val Standalone: typings.expoConstants.constantsTypesMod.AppOwnership.Standalone & String = js.native
}
