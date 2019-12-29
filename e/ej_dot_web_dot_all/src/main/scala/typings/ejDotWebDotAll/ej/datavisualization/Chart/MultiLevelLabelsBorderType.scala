package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MultiLevelLabelsBorderType extends js.Object

@JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
@js.native
object MultiLevelLabelsBorderType extends js.Object {
  //string
  @js.native
  sealed trait Brace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait CurlyBrace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait None extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait Rectangle extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait WithoutTopAndBottom extends MultiLevelLabelsBorderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MultiLevelLabelsBorderType with Double] = js.native
  /* 3 */ @js.native
  object Brace extends TopLevel[Brace with Double]
  
  /* 4 */ @js.native
  object CurlyBrace extends TopLevel[CurlyBrace with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 2 */ @js.native
  object WithoutTopAndBottom extends TopLevel[WithoutTopAndBottom with Double]
  
}

