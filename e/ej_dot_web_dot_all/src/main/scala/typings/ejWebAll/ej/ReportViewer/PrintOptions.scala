package typings.ejWebAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOptions extends js.Object

@JSGlobal("ej.ReportViewer.PrintOptions")
@js.native
object PrintOptions extends js.Object {
  ///Specifies the Default property in printOptions.
  @js.native
  sealed trait Default extends PrintOptions
  
  ///Specifies the NewTab property in printOptions.
  @js.native
  sealed trait NewTab extends PrintOptions
  
  ///Specifies the None property in printOptions.
  @js.native
  sealed trait None extends PrintOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOptions with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object NewTab extends TopLevel[NewTab with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
}

