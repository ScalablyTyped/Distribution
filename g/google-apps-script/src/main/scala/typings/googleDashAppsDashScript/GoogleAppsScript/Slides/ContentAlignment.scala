package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentAlignment extends js.Object

/**
  * The content alignments for a Shape or TableCell. The supported alignments
  * correspond to predefined text anchoring types from the ECMA-376 standard.
  *
  * More information on those alignments can be found in the description of
  * the ST_TextAnchoringType simple type in section 20.1.10.59 of "Office Open XML File
  * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.ContentAlignment")
@js.native
object ContentAlignment extends js.Object {
  @js.native
  sealed trait BOTTOM extends ContentAlignment
  
  @js.native
  sealed trait MIDDLE extends ContentAlignment
  
  @js.native
  sealed trait TOP extends ContentAlignment
  
  @js.native
  sealed trait UNSUPPORTED extends ContentAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentAlignment with Double] = js.native
  /* 3 */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with Double]
  
  /* 2 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  /* 1 */ @js.native
  object TOP extends TopLevel[TOP with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

