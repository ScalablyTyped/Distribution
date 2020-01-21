package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapStrategy extends js.Object

/**
  * An enumeration of the strategies used to handle cell text wrapping.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
@js.native
object WrapStrategy extends js.Object {
  @js.native
  sealed trait CLIP extends WrapStrategy
  
  @js.native
  sealed trait OVERFLOW extends WrapStrategy
  
  @js.native
  sealed trait WRAP extends WrapStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrapStrategy with Double] = js.native
  /* 2 */ @js.native
  object CLIP extends TopLevel[CLIP with Double]
  
  /* 1 */ @js.native
  object OVERFLOW extends TopLevel[OVERFLOW with Double]
  
  /* 0 */ @js.native
  object WRAP extends TopLevel[WRAP with Double]
  
}

