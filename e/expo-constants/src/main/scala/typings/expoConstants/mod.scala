package typings.expoConstants

import org.scalablytyped.runtime.Shortcut
import typings.expoConstants.constantsTypesMod.Constants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("expo-constants", JSImport.Default)
  @js.native
  val default: Constants = js.native
  
  @JSImport("expo-constants", "AppOwnership")
  @js.native
  object AppOwnership extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoConstants.constantsTypesMod.AppOwnership & String] = js.native
    
    /* "expo" */ val Expo: typings.expoConstants.constantsTypesMod.AppOwnership.Expo & String = js.native
    
    /* "guest" */ val Guest: typings.expoConstants.constantsTypesMod.AppOwnership.Guest & String = js.native
    
    /* "standalone" */ val Standalone: typings.expoConstants.constantsTypesMod.AppOwnership.Standalone & String = js.native
  }
  
  @JSImport("expo-constants", "UserInterfaceIdiom")
  @js.native
  object UserInterfaceIdiom extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoConstants.constantsTypesMod.UserInterfaceIdiom & String] = js.native
    
    /* "handset" */ val Handset: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Handset & String = js.native
    
    /* "tablet" */ val Tablet: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Tablet & String = js.native
    
    /* "unsupported" */ val Unsupported: typings.expoConstants.constantsTypesMod.UserInterfaceIdiom.Unsupported & String = js.native
  }
  
  type _To = Constants
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Constants = default
}
