package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThemeColorType extends js.Object

/**
  * An enum which describes various color entries supported in themes.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.ThemeColorType")
@js.native
object ThemeColorType extends js.Object {
  @js.native
  sealed trait ACCENT1 extends ThemeColorType
  
  @js.native
  sealed trait ACCENT2 extends ThemeColorType
  
  @js.native
  sealed trait ACCENT3 extends ThemeColorType
  
  @js.native
  sealed trait ACCENT4 extends ThemeColorType
  
  @js.native
  sealed trait ACCENT5 extends ThemeColorType
  
  @js.native
  sealed trait ACCENT6 extends ThemeColorType
  
  @js.native
  sealed trait BACKGROUND extends ThemeColorType
  
  @js.native
  sealed trait HYPERLINK extends ThemeColorType
  
  @js.native
  sealed trait TEXT extends ThemeColorType
  
  @js.native
  sealed trait UNSUPPORTED extends ThemeColorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThemeColorType with Double] = js.native
  /* 3 */ @js.native
  object ACCENT1 extends TopLevel[ACCENT1 with Double]
  
  /* 4 */ @js.native
  object ACCENT2 extends TopLevel[ACCENT2 with Double]
  
  /* 5 */ @js.native
  object ACCENT3 extends TopLevel[ACCENT3 with Double]
  
  /* 6 */ @js.native
  object ACCENT4 extends TopLevel[ACCENT4 with Double]
  
  /* 7 */ @js.native
  object ACCENT5 extends TopLevel[ACCENT5 with Double]
  
  /* 8 */ @js.native
  object ACCENT6 extends TopLevel[ACCENT6 with Double]
  
  /* 2 */ @js.native
  object BACKGROUND extends TopLevel[BACKGROUND with Double]
  
  /* 9 */ @js.native
  object HYPERLINK extends TopLevel[HYPERLINK with Double]
  
  /* 1 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

