package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Map.Mode")
@js.native
object Mode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends Mode
  
  //specifies the interactive mode
  @js.native
  sealed trait Interactive extends Mode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object Interactive extends TopLevel[Interactive with Double]
  
}

