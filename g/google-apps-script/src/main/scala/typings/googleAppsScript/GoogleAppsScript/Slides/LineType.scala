package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineType extends js.Object

/**
  * The line types.
  *
  * Derived from a subset of the values of the "ST_ShapeType" simple type in section 20.1.10.55 of
  * "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.LineType")
@js.native
object LineType extends js.Object {
  @js.native
  sealed trait BENT_CONNECTOR_2 extends LineType
  
  @js.native
  sealed trait BENT_CONNECTOR_3 extends LineType
  
  @js.native
  sealed trait BENT_CONNECTOR_4 extends LineType
  
  @js.native
  sealed trait BENT_CONNECTOR_5 extends LineType
  
  @js.native
  sealed trait CURVED_CONNECTOR_2 extends LineType
  
  @js.native
  sealed trait CURVED_CONNECTOR_3 extends LineType
  
  @js.native
  sealed trait CURVED_CONNECTOR_4 extends LineType
  
  @js.native
  sealed trait CURVED_CONNECTOR_5 extends LineType
  
  @js.native
  sealed trait STRAIGHT_CONNECTOR_1 extends LineType
  
  @js.native
  sealed trait STRAIGHT_LINE extends LineType
  
  @js.native
  sealed trait UNSUPPORTED extends LineType
  
}

