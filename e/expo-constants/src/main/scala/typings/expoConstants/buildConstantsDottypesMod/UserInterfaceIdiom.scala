package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserInterfaceIdiom extends StObject
@JSImport("expo-constants/build/Constants.types", "UserInterfaceIdiom")
@js.native
object UserInterfaceIdiom extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserInterfaceIdiom & String] = js.native
  
  @js.native
  sealed trait Handset
    extends StObject
       with UserInterfaceIdiom
  /* "handset" */ val Handset: typings.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Handset & String = js.native
  
  @js.native
  sealed trait Tablet
    extends StObject
       with UserInterfaceIdiom
  /* "tablet" */ val Tablet: typings.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Tablet & String = js.native
  
  @js.native
  sealed trait Unsupported
    extends StObject
       with UserInterfaceIdiom
  /* "unsupported" */ val Unsupported: typings.expoConstants.buildConstantsDottypesMod.UserInterfaceIdiom.Unsupported & String = js.native
}
