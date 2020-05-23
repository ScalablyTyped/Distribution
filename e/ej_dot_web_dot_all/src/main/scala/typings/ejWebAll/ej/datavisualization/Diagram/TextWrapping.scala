package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextWrapping extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextWrapping")
@js.native
object TextWrapping extends js.Object {
  //Disables wrapping
  @js.native
  sealed trait NoWrap extends TextWrapping
  
  //Enables Line-break at normal word break points
  @js.native
  sealed trait Wrap extends TextWrapping
  
  //Enables Line-break at normal word break points with longer word overflows
  @js.native
  sealed trait WrapWithOverflow extends TextWrapping
  
}

