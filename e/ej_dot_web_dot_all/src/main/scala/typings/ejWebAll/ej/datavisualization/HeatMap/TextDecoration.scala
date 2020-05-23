package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDecoration extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.TextDecoration")
@js.native
object TextDecoration extends js.Object {
  //Defines a line through the text
  @js.native
  sealed trait LineThrough extends TextDecoration
  
  //Defines a normal text. This is default
  @js.native
  sealed trait None extends TextDecoration
  
  //Defines a line above the text
  @js.native
  sealed trait Overline extends TextDecoration
  
  //Defines a line below the text
  @js.native
  sealed trait Underline extends TextDecoration
  
}

