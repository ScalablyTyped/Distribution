package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.TextAlign")
@js.native
object TextAlign extends js.Object {
  //string
  @js.native
  sealed trait Center extends TextAlign
  
  //string
  @js.native
  sealed trait Justify extends TextAlign
  
  //string
  @js.native
  sealed trait Left extends TextAlign
  
  //string
  @js.native
  sealed trait Right extends TextAlign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlign with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Justify extends TopLevel[Justify with Double]
  
  /* 2 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 3 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

