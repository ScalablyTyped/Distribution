package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverflowType extends js.Object
@JSGlobal("ej.datavisualization.Diagram.OverflowType")
@js.native
object OverflowType extends js.Object {
  
  //Set overflow Type  as Clip
  @js.native
  sealed trait Clip extends OverflowType
  
  //Set overflow Type as ellipsis
  @js.native
  sealed trait Ellipsis extends OverflowType
}
