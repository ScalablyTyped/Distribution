package typings.ejWebAll.ej.datavisualization.TreeMap

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextOverflow with Double] = js.native
  /* 1 */ @js.native
  object Hide extends TopLevel[Hide with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
  /* 3 */ @js.native
  object WrapByWord extends TopLevel[WrapByWord with Double]
  
}

