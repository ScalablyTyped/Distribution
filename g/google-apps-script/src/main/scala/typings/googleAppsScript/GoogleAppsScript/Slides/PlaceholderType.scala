package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaceholderType extends js.Object

/**
  * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
  * ECMA-376 standard. More information on those shapes can be found in the description of the
  * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
  * Markup Language Reference", part 1 of ECMA-376 5th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
@js.native
object PlaceholderType extends js.Object {
  @js.native
  sealed trait BODY extends PlaceholderType
  
  @js.native
  sealed trait CENTERED_TITLE extends PlaceholderType
  
  @js.native
  sealed trait CHART extends PlaceholderType
  
  @js.native
  sealed trait CLIP_ART extends PlaceholderType
  
  @js.native
  sealed trait DATE_AND_TIME extends PlaceholderType
  
  @js.native
  sealed trait DIAGRAM extends PlaceholderType
  
  @js.native
  sealed trait FOOTER extends PlaceholderType
  
  @js.native
  sealed trait HEADER extends PlaceholderType
  
  @js.native
  sealed trait MEDIA extends PlaceholderType
  
  @js.native
  sealed trait NONE extends PlaceholderType
  
  @js.native
  sealed trait OBJECT extends PlaceholderType
  
  @js.native
  sealed trait PICTURE extends PlaceholderType
  
  @js.native
  sealed trait SLIDE_IMAGE extends PlaceholderType
  
  @js.native
  sealed trait SLIDE_NUMBER extends PlaceholderType
  
  @js.native
  sealed trait SUBTITLE extends PlaceholderType
  
  @js.native
  sealed trait TABLE extends PlaceholderType
  
  @js.native
  sealed trait TITLE extends PlaceholderType
  
  @js.native
  sealed trait UNSUPPORTED extends PlaceholderType
  
}

