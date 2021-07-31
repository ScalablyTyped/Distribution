package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArrowPosition extends StObject
@JSGlobal("ej.ArrowPosition")
@js.native
object ArrowPosition extends StObject {
  
  //To set Bottom arrowPosition of the split button
  @js.native
  sealed trait Bottom
    extends StObject
       with ArrowPosition
  
  //To set Left arrowPosition of the split button
  @js.native
  sealed trait Left
    extends StObject
       with ArrowPosition
  
  //To set Right arrowPosition of the split button
  @js.native
  sealed trait Right
    extends StObject
       with ArrowPosition
  
  //To set Top arrowPosition of the split button
  @js.native
  sealed trait Top
    extends StObject
       with ArrowPosition
}
