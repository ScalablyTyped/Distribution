package typings.expoDashConstants.buildConstantsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppOwnership extends js.Object

@JSImport("expo-constants/build/Constants.types", "AppOwnership")
@js.native
object AppOwnership extends js.Object {
  @js.native
  sealed trait Expo extends AppOwnership
  
  @js.native
  sealed trait Guest extends AppOwnership
  
  @js.native
  sealed trait Standalone extends AppOwnership
  
  /* "expo" */ val Expo: typings.expoDashConstants.buildConstantsDotTypesMod.AppOwnership.Expo with String = js.native
  /* "guest" */ val Guest: typings.expoDashConstants.buildConstantsDotTypesMod.AppOwnership.Guest with String = js.native
  /* "standalone" */ val Standalone: typings.expoDashConstants.buildConstantsDotTypesMod.AppOwnership.Standalone with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AppOwnership with String] = js.native
}

