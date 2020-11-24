package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArrowPosition extends js.Object
@JSGlobal("ej.ArrowPosition")
@js.native
object ArrowPosition extends js.Object {
  
  //To set Bottom arrowPosition of the split button
  @js.native
  sealed trait Bottom extends ArrowPosition
  
  //To set Left arrowPosition of the split button
  @js.native
  sealed trait Left extends ArrowPosition
  
  //To set Right arrowPosition of the split button
  @js.native
  sealed trait Right extends ArrowPosition
  
  //To set Top arrowPosition of the split button
  @js.native
  sealed trait Top extends ArrowPosition
}
