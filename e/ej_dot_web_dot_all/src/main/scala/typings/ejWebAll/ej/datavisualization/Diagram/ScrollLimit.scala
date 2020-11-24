package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollLimit extends js.Object
@JSGlobal("ej.datavisualization.Diagram.ScrollLimit")
@js.native
object ScrollLimit extends js.Object {
  
  //Used to set scrollLimit as Diagram
  @js.native
  sealed trait Diagram extends ScrollLimit
  
  //Used to set scrollLimit as Infinite
  @js.native
  sealed trait Infinite extends ScrollLimit
  
  //Used to set scrollLimit as Limited
  @js.native
  sealed trait Limited extends ScrollLimit
}
