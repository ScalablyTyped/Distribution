package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

/**
  * The kinds of dashes with which linear geometry can be rendered. These values are based on the
  * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
  * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.DashStyle")
@js.native
object DashStyle extends js.Object {
  @js.native
  sealed trait DASH extends DashStyle
  
  @js.native
  sealed trait DASH_DOT extends DashStyle
  
  @js.native
  sealed trait DOT extends DashStyle
  
  @js.native
  sealed trait LONG_DASH extends DashStyle
  
  @js.native
  sealed trait LONG_DASH_DOT extends DashStyle
  
  @js.native
  sealed trait SOLID extends DashStyle
  
  @js.native
  sealed trait UNSUPPORTED extends DashStyle
  
}

