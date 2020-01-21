package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * An enumeration representing the possible directions that one can move within a spreadsheet using
  * the arrow keys.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait DOWN extends Direction
  
  @js.native
  sealed trait NEXT extends Direction
  
  @js.native
  sealed trait PREVIOUS extends Direction
  
  @js.native
  sealed trait UP extends Direction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction with Double] = js.native
  /* 1 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  /* 3 */ @js.native
  object NEXT extends TopLevel[NEXT with Double]
  
  /* 2 */ @js.native
  object PREVIOUS extends TopLevel[PREVIOUS with Double]
  
  /* 0 */ @js.native
  object UP extends TopLevel[UP with Double]
  
}

