package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowStyle extends js.Object

/**
  * The kinds of start and end forms with which linear geometry can be rendered.
  *
  * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
  * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
@js.native
object ArrowStyle extends js.Object {
  @js.native
  sealed trait FILL_ARROW extends ArrowStyle
  
  @js.native
  sealed trait FILL_CIRCLE extends ArrowStyle
  
  @js.native
  sealed trait FILL_DIAMOND extends ArrowStyle
  
  @js.native
  sealed trait FILL_SQUARE extends ArrowStyle
  
  @js.native
  sealed trait NONE extends ArrowStyle
  
  @js.native
  sealed trait OPEN_ARROW extends ArrowStyle
  
  @js.native
  sealed trait OPEN_CIRCLE extends ArrowStyle
  
  @js.native
  sealed trait OPEN_DIAMOND extends ArrowStyle
  
  @js.native
  sealed trait OPEN_SQUARE extends ArrowStyle
  
  @js.native
  sealed trait STEALTH_ARROW extends ArrowStyle
  
  @js.native
  sealed trait UNSUPPORTED extends ArrowStyle
  
}

