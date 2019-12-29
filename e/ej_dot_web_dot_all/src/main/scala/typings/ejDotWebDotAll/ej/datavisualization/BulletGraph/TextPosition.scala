package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
@js.native
object TextPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends TextPosition
  
  //string
  @js.native
  sealed trait Float extends TextPosition
  
  //string
  @js.native
  sealed trait Left extends TextPosition
  
  //string
  @js.native
  sealed trait Right extends TextPosition
  
  //string
  @js.native
  sealed trait Top extends TextPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextPosition with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 4 */ @js.native
  object Float extends TopLevel[Float with Double]
  
  /* 2 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

