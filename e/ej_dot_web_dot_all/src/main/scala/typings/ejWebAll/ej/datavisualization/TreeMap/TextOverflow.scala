package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextOverflow extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.TextOverflow")
@js.native
object TextOverflow extends js.Object {
  //Hides the label when its width exceeds grid width
  @js.native
  sealed trait Hide extends TextOverflow
  
  //Displays the label within the grid width
  @js.native
  sealed trait None extends TextOverflow
  
  //Wrap the label by letter when its width exceeds grid width
  @js.native
  sealed trait Wrap extends TextOverflow
  
  //Wrap the label by word when its width exceeds grid width
  @js.native
  sealed trait WrapByWord extends TextOverflow
  
}

