package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeMod {
  
  @JSImport("forge-di/dist/framework/Mode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode & String] = js.native
    
    /* "All" */ val All: typings.forgeDi.modeMod.Mode.All & String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDi.modeMod.Mode.AtLeastOne & String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typings.forgeDi.modeMod.Mode.AtMostOne & String = js.native
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("forge-di/dist/framework/Mode", "Mode")
  @js.native
  object Mode extends StObject {
    
    @js.native
    sealed trait All
      extends StObject
         with Mode
    
    @js.native
    sealed trait AtLeastOne
      extends StObject
         with Mode
    
    @js.native
    sealed trait AtMostOne
      extends StObject
         with Mode
  }
}
