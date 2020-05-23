package typings.googleAppsScript.global.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* 3 */ val BOTTOM: typings.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.BOTTOM with Double = js.native
  /* 2 */ val MIDDLE: typings.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.MIDDLE with Double = js.native
  /* 1 */ val TOP: typings.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.TOP with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Slides.ContentAlignment with Double] = js.native
}

