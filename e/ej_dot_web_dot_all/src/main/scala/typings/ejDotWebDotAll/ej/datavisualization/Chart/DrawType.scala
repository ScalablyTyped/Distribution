package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawType extends js.Object

@JSGlobal("ej.datavisualization.Chart.DrawType")
@js.native
object DrawType extends js.Object {
  //string
  @js.native
  sealed trait Area extends DrawType
  
  //string
  @js.native
  sealed trait Column extends DrawType
  
  //string
  @js.native
  sealed trait Line extends DrawType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawType with Double] = js.native
  /* 1 */ @js.native
  object Area extends TopLevel[Area with Double]
  
  /* 2 */ @js.native
  object Column extends TopLevel[Column with Double]
  
  /* 0 */ @js.native
  object Line extends TopLevel[Line with Double]
  
}

