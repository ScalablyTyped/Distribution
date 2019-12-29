package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

/**
  * Lists values specifying the paragraph alignment.
  */
@JSGlobal("ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  /**
    * Text is aligned to the center of the paragraph.
    */
  @js.native
  sealed trait Center extends ParagraphAlignment
  
  /**
    * Text is justified to the entire width of the paragraph.
    */
  @js.native
  sealed trait Justify extends ParagraphAlignment
  
  /**
    * Text is aligned to the left of the paragraph.
    */
  @js.native
  sealed trait Left extends ParagraphAlignment
  
  /**
    * Text is aligned to the right of the paragraph.
    */
  @js.native
  sealed trait Right extends ParagraphAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 3 */ @js.native
  object Justify extends TopLevel[Justify with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

