package typings.egjsAxes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod {
  
  @js.native
  sealed trait DIRECTION extends StObject
  @JSImport("@egjs/axes/const", "DIRECTION")
  @js.native
  object DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DIRECTION with Double] = js.native
    
    @js.native
    sealed trait DIRECTION_ALL extends DIRECTION
    /* 30 */ val DIRECTION_ALL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_ALL with Double = js.native
    
    @js.native
    sealed trait DIRECTION_DOWN extends DIRECTION
    /* 16 */ val DIRECTION_DOWN: typings.egjsAxes.constMod.DIRECTION.DIRECTION_DOWN with Double = js.native
    
    @js.native
    sealed trait DIRECTION_HORIZONTAL extends DIRECTION
    /* 6 */ val DIRECTION_HORIZONTAL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_HORIZONTAL with Double = js.native
    
    @js.native
    sealed trait DIRECTION_LEFT extends DIRECTION
    /* 2 */ val DIRECTION_LEFT: typings.egjsAxes.constMod.DIRECTION.DIRECTION_LEFT with Double = js.native
    
    @js.native
    sealed trait DIRECTION_NONE extends DIRECTION
    /* 1 */ val DIRECTION_NONE: typings.egjsAxes.constMod.DIRECTION.DIRECTION_NONE with Double = js.native
    
    @js.native
    sealed trait DIRECTION_RIGHT extends DIRECTION
    /* 4 */ val DIRECTION_RIGHT: typings.egjsAxes.constMod.DIRECTION.DIRECTION_RIGHT with Double = js.native
    
    @js.native
    sealed trait DIRECTION_UP extends DIRECTION
    /* 8 */ val DIRECTION_UP: typings.egjsAxes.constMod.DIRECTION.DIRECTION_UP with Double = js.native
    
    @js.native
    sealed trait DIRECTION_VERTICAL extends DIRECTION
    /* 24 */ val DIRECTION_VERTICAL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_VERTICAL with Double = js.native
  }
  
  @JSImport("@egjs/axes/const", "TRANSFORM")
  @js.native
  val TRANSFORM: String = js.native
}
