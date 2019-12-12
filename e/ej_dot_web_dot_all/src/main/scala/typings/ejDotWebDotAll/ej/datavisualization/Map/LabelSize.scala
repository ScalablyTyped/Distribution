package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.LabelSize.Default
import typings.ejDotWebDotAll.ej.datavisualization.Map.LabelSize.Fixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelSize extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelSize")
@js.native
object LabelSize extends js.Object {
  //specifies the default size
  @js.native
  sealed trait Default extends LabelSize
  
  //specifies the fixed size
  @js.native
  sealed trait Fixed extends LabelSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelSize with Double] = js.native
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 0 */ @js.native
  object Fixed extends TopLevel[Fixed with Double]
  
}

