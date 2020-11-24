package typings.egjsAxes

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/axes/const", JSImport.Namespace)
@js.native
object constMod extends js.Object {
  
  val TRANSFORM: String = js.native
  
  @js.native
  sealed trait DIRECTION extends js.Object
  @js.native
  object DIRECTION extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DIRECTION with Double] = js.native
    
    @js.native
    sealed trait DIRECTION_ALL extends DIRECTION
    /* 30 */ @js.native
    object DIRECTION_ALL extends TopLevel[DIRECTION_ALL with Double]
    
    @js.native
    sealed trait DIRECTION_DOWN extends DIRECTION
    /* 16 */ @js.native
    object DIRECTION_DOWN extends TopLevel[DIRECTION_DOWN with Double]
    
    @js.native
    sealed trait DIRECTION_HORIZONTAL extends DIRECTION
    /* 6 */ @js.native
    object DIRECTION_HORIZONTAL extends TopLevel[DIRECTION_HORIZONTAL with Double]
    
    @js.native
    sealed trait DIRECTION_LEFT extends DIRECTION
    /* 2 */ @js.native
    object DIRECTION_LEFT extends TopLevel[DIRECTION_LEFT with Double]
    
    @js.native
    sealed trait DIRECTION_NONE extends DIRECTION
    /* 1 */ @js.native
    object DIRECTION_NONE extends TopLevel[DIRECTION_NONE with Double]
    
    @js.native
    sealed trait DIRECTION_RIGHT extends DIRECTION
    /* 4 */ @js.native
    object DIRECTION_RIGHT extends TopLevel[DIRECTION_RIGHT with Double]
    
    @js.native
    sealed trait DIRECTION_UP extends DIRECTION
    /* 8 */ @js.native
    object DIRECTION_UP extends TopLevel[DIRECTION_UP with Double]
    
    @js.native
    sealed trait DIRECTION_VERTICAL extends DIRECTION
    /* 24 */ @js.native
    object DIRECTION_VERTICAL extends TopLevel[DIRECTION_VERTICAL with Double]
  }
}
