package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineType with Double] = js.native
  /* 2 */ @js.native
  object BENT_CONNECTOR_2 extends TopLevel[BENT_CONNECTOR_2 with Double]
  
  /* 3 */ @js.native
  object BENT_CONNECTOR_3 extends TopLevel[BENT_CONNECTOR_3 with Double]
  
  /* 4 */ @js.native
  object BENT_CONNECTOR_4 extends TopLevel[BENT_CONNECTOR_4 with Double]
  
  /* 5 */ @js.native
  object BENT_CONNECTOR_5 extends TopLevel[BENT_CONNECTOR_5 with Double]
  
  /* 6 */ @js.native
  object CURVED_CONNECTOR_2 extends TopLevel[CURVED_CONNECTOR_2 with Double]
  
  /* 7 */ @js.native
  object CURVED_CONNECTOR_3 extends TopLevel[CURVED_CONNECTOR_3 with Double]
  
  /* 8 */ @js.native
  object CURVED_CONNECTOR_4 extends TopLevel[CURVED_CONNECTOR_4 with Double]
  
  /* 9 */ @js.native
  object CURVED_CONNECTOR_5 extends TopLevel[CURVED_CONNECTOR_5 with Double]
  
  /* 1 */ @js.native
  object STRAIGHT_CONNECTOR_1 extends TopLevel[STRAIGHT_CONNECTOR_1 with Double]
  
  /* 10 */ @js.native
  object STRAIGHT_LINE extends TopLevel[STRAIGHT_LINE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

