package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualScrollMode extends StObject
@JSGlobal("ej.VirtualScrollMode")
@js.native
object VirtualScrollMode extends StObject {
  
  //The data items are loaded from the remote when scroll handle reaches the end of the scrollbar like infinity scrolling.
  @js.native
  sealed trait Continuous
    extends StObject
       with VirtualScrollMode
  
  //The data is loaded only to the corresponding page (display items). When scrolling some other position, it enables the load on demand with the DropDownList.
  @js.native
  sealed trait Normal
    extends StObject
       with VirtualScrollMode
}
