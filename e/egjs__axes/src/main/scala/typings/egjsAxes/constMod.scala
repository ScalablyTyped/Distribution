package typings.egjsAxes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod {
  
  @js.native
  sealed trait DIRECTION extends StObject
  @JSImport("@egjs/axes/const", "DIRECTION")
  @js.native
  object DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DIRECTION & Double] = js.native
    
    @js.native
    sealed trait DIRECTION_ALL
      extends StObject
         with DIRECTION
    /* 30 */ val DIRECTION_ALL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_ALL & Double = js.native
    
    @js.native
    sealed trait DIRECTION_DOWN
      extends StObject
         with DIRECTION
    /* 16 */ val DIRECTION_DOWN: typings.egjsAxes.constMod.DIRECTION.DIRECTION_DOWN & Double = js.native
    
    @js.native
    sealed trait DIRECTION_HORIZONTAL
      extends StObject
         with DIRECTION
    /* 6 */ val DIRECTION_HORIZONTAL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_HORIZONTAL & Double = js.native
    
    @js.native
    sealed trait DIRECTION_LEFT
      extends StObject
         with DIRECTION
    /* 2 */ val DIRECTION_LEFT: typings.egjsAxes.constMod.DIRECTION.DIRECTION_LEFT & Double = js.native
    
    @js.native
    sealed trait DIRECTION_NONE
      extends StObject
         with DIRECTION
    /* 1 */ val DIRECTION_NONE: typings.egjsAxes.constMod.DIRECTION.DIRECTION_NONE & Double = js.native
    
    @js.native
    sealed trait DIRECTION_RIGHT
      extends StObject
         with DIRECTION
    /* 4 */ val DIRECTION_RIGHT: typings.egjsAxes.constMod.DIRECTION.DIRECTION_RIGHT & Double = js.native
    
    @js.native
    sealed trait DIRECTION_UP
      extends StObject
         with DIRECTION
    /* 8 */ val DIRECTION_UP: typings.egjsAxes.constMod.DIRECTION.DIRECTION_UP & Double = js.native
    
    @js.native
    sealed trait DIRECTION_VERTICAL
      extends StObject
         with DIRECTION
    /* 24 */ val DIRECTION_VERTICAL: typings.egjsAxes.constMod.DIRECTION.DIRECTION_VERTICAL & Double = js.native
  }
  
  @JSImport("@egjs/axes/const", "TRANSFORM")
  @js.native
  val TRANSFORM: String = js.native
}
