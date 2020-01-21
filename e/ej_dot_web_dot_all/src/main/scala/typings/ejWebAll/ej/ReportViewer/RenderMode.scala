package typings.ejWebAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderMode extends js.Object

@JSGlobal("ej.ReportViewer.RenderMode")
@js.native
object RenderMode extends js.Object {
  ///Specifies the Default property in RenderMode to get default output.
  @js.native
  sealed trait Default extends RenderMode
  
  ///Specifies the Desktop property in RenderMode to get specified output.
  @js.native
  sealed trait Desktop extends RenderMode
  
  ///Specifies the Mobile property in RenderMode to get specified output.
  @js.native
  sealed trait Mobile extends RenderMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderMode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Desktop extends TopLevel[Desktop with Double]
  
  /* 1 */ @js.native
  object Mobile extends TopLevel[Mobile with Double]
  
}

