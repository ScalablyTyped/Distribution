package typings.expoDashConstants.buildConstantsDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Handset
import typings.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Tablet
import typings.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserInterfaceIdiom extends js.Object

@JSImport("expo-constants/build/Constants.types", "UserInterfaceIdiom")
@js.native
object UserInterfaceIdiom extends js.Object {
  @js.native
  sealed trait Handset extends UserInterfaceIdiom
  
  @js.native
  sealed trait Tablet extends UserInterfaceIdiom
  
  @js.native
  sealed trait Unsupported extends UserInterfaceIdiom
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserInterfaceIdiom with String] = js.native
  /* "handset" */ @js.native
  object Handset extends TopLevel[Handset with String]
  
  /* "tablet" */ @js.native
  object Tablet extends TopLevel[Tablet with String]
  
  /* "unsupported" */ @js.native
  object Unsupported extends TopLevel[Unsupported with String]
  
}

