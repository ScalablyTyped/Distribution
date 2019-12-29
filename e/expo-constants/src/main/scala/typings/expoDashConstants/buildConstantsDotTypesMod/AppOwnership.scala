package typings.expoDashConstants.buildConstantsDotTypesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AppOwnership with String] = js.native
  /* "expo" */ @js.native
  object Expo extends TopLevel[Expo with String]
  
  /* "guest" */ @js.native
  object Guest extends TopLevel[Guest with String]
  
  /* "standalone" */ @js.native
  object Standalone extends TopLevel[Standalone with String]
  
}

