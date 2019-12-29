package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelNumberAlignment extends js.Object

/**
  * Lists values that specify the paragraph text alignment within numbered list levels.
  */
@JSGlobal("ListLevelNumberAlignment")
@js.native
object ListLevelNumberAlignment extends js.Object {
  /**
    * Text is aligned to the center of the list level's paragraph.
    */
  @js.native
  sealed trait Center extends ListLevelNumberAlignment
  
  /**
    * Text is aligned to the left of the list level's paragraph.
    */
  @js.native
  sealed trait Left extends ListLevelNumberAlignment
  
  /**
    * Text is aligned to the right of the list level's paragraph.
    */
  @js.native
  sealed trait Right extends ListLevelNumberAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelNumberAlignment with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

