package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeType extends js.Object
/**
  * The shape types. Many of these shapes correspond to predefined shapes from the ECMA-376 standard.
  * More information on those shapes can be found in the description of the "ST_ShapeType" simple
  * type in section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and Markup Language
  * Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.ShapeType")
@js.native
object ShapeType extends js.Object {
  
  @js.native
  sealed trait ARC extends ShapeType
  
  @js.native
  sealed trait ARROW_EAST extends ShapeType
  
  @js.native
  sealed trait ARROW_NORTH extends ShapeType
  
  @js.native
  sealed trait ARROW_NORTH_EAST extends ShapeType
  
  @js.native
  sealed trait BENT_ARROW extends ShapeType
  
  @js.native
  sealed trait BENT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait BEVEL extends ShapeType
  
  @js.native
  sealed trait BLOCK_ARC extends ShapeType
  
  @js.native
  sealed trait BRACE_PAIR extends ShapeType
  
  @js.native
  sealed trait BRACKET_PAIR extends ShapeType
  
  @js.native
  sealed trait CAN extends ShapeType
  
  @js.native
  sealed trait CHEVRON extends ShapeType
  
  @js.native
  sealed trait CHORD extends ShapeType
  
  @js.native
  sealed trait CLOUD extends ShapeType
  
  @js.native
  sealed trait CLOUD_CALLOUT extends ShapeType
  
  @js.native
  sealed trait CORNER extends ShapeType
  
  @js.native
  sealed trait CUBE extends ShapeType
  
  @js.native
  sealed trait CURVED_DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_LEFT_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait CURVED_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait CUSTOM extends ShapeType
  
  @js.native
  sealed trait DECAGON extends ShapeType
  
  @js.native
  sealed trait DIAGONAL_STRIPE extends ShapeType
  
  @js.native
  sealed trait DIAMOND extends ShapeType
  
  @js.native
  sealed trait DODECAGON extends ShapeType
  
  @js.native
  sealed trait DONUT extends ShapeType
  
  @js.native
  sealed trait DOUBLE_WAVE extends ShapeType
  
  @js.native
  sealed trait DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait DOWN_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait ELLIPSE extends ShapeType
  
  @js.native
  sealed trait ELLIPSE_RIBBON extends ShapeType
  
  @js.native
  sealed trait ELLIPSE_RIBBON_2 extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_ALTERNATE_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_COLLATE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_CONNECTOR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DECISION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DELAY extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DISPLAY extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_DOCUMENT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_EXTRACT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_INPUT_OUTPUT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_INTERNAL_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_DISK extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_DRUM extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MAGNETIC_TAPE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MANUAL_INPUT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MANUAL_OPERATION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MERGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_MULTIDOCUMENT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OFFLINE_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OFFPAGE_CONNECTOR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_ONLINE_STORAGE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_OR extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PREDEFINED_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PREPARATION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PROCESS extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PUNCHED_CARD extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_PUNCHED_TAPE extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_SORT extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_SUMMING_JUNCTION extends ShapeType
  
  @js.native
  sealed trait FLOW_CHART_TERMINATOR extends ShapeType
  
  @js.native
  sealed trait FOLDED_CORNER extends ShapeType
  
  @js.native
  sealed trait FRAME extends ShapeType
  
  @js.native
  sealed trait HALF_FRAME extends ShapeType
  
  @js.native
  sealed trait HEART extends ShapeType
  
  @js.native
  sealed trait HEPTAGON extends ShapeType
  
  @js.native
  sealed trait HEXAGON extends ShapeType
  
  @js.native
  sealed trait HOME_PLATE extends ShapeType
  
  @js.native
  sealed trait HORIZONTAL_SCROLL extends ShapeType
  
  @js.native
  sealed trait IRREGULAR_SEAL_1 extends ShapeType
  
  @js.native
  sealed trait IRREGULAR_SEAL_2 extends ShapeType
  
  @js.native
  sealed trait LEFT_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait LEFT_BRACE extends ShapeType
  
  @js.native
  sealed trait LEFT_BRACKET extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait LEFT_RIGHT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait LEFT_UP_ARROW extends ShapeType
  
  @js.native
  sealed trait LIGHTNING_BOLT extends ShapeType
  
  @js.native
  sealed trait MATH_DIVIDE extends ShapeType
  
  @js.native
  sealed trait MATH_EQUAL extends ShapeType
  
  @js.native
  sealed trait MATH_MINUS extends ShapeType
  
  @js.native
  sealed trait MATH_MULTIPLY extends ShapeType
  
  @js.native
  sealed trait MATH_NOT_EQUAL extends ShapeType
  
  @js.native
  sealed trait MATH_PLUS extends ShapeType
  
  @js.native
  sealed trait MOON extends ShapeType
  
  @js.native
  sealed trait NOTCHED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait NO_SMOKING extends ShapeType
  
  @js.native
  sealed trait OCTAGON extends ShapeType
  
  @js.native
  sealed trait PARALLELOGRAM extends ShapeType
  
  @js.native
  sealed trait PENTAGON extends ShapeType
  
  @js.native
  sealed trait PIE extends ShapeType
  
  @js.native
  sealed trait PLAQUE extends ShapeType
  
  @js.native
  sealed trait PLUS extends ShapeType
  
  @js.native
  sealed trait QUAD_ARROW extends ShapeType
  
  @js.native
  sealed trait QUAD_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait RECTANGLE extends ShapeType
  
  @js.native
  sealed trait RIBBON extends ShapeType
  
  @js.native
  sealed trait RIBBON_2 extends ShapeType
  
  @js.native
  sealed trait RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait RIGHT_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait RIGHT_BRACE extends ShapeType
  
  @js.native
  sealed trait RIGHT_BRACKET extends ShapeType
  
  @js.native
  sealed trait RIGHT_TRIANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_1_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_2_DIAGONAL_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_2_SAME_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait ROUND_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SMILEY_FACE extends ShapeType
  
  @js.native
  sealed trait SNIP_1_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_2_DIAGONAL_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_2_SAME_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SNIP_ROUND_RECTANGLE extends ShapeType
  
  @js.native
  sealed trait SPEECH extends ShapeType
  
  @js.native
  sealed trait STARBURST extends ShapeType
  
  @js.native
  sealed trait STAR_10 extends ShapeType
  
  @js.native
  sealed trait STAR_12 extends ShapeType
  
  @js.native
  sealed trait STAR_16 extends ShapeType
  
  @js.native
  sealed trait STAR_24 extends ShapeType
  
  @js.native
  sealed trait STAR_32 extends ShapeType
  
  @js.native
  sealed trait STAR_4 extends ShapeType
  
  @js.native
  sealed trait STAR_5 extends ShapeType
  
  @js.native
  sealed trait STAR_6 extends ShapeType
  
  @js.native
  sealed trait STAR_7 extends ShapeType
  
  @js.native
  sealed trait STAR_8 extends ShapeType
  
  @js.native
  sealed trait STRIPED_RIGHT_ARROW extends ShapeType
  
  @js.native
  sealed trait SUN extends ShapeType
  
  @js.native
  sealed trait TEARDROP extends ShapeType
  
  @js.native
  sealed trait TEXT_BOX extends ShapeType
  
  @js.native
  sealed trait TRAPEZOID extends ShapeType
  
  @js.native
  sealed trait TRIANGLE extends ShapeType
  
  @js.native
  sealed trait UNSUPPORTED extends ShapeType
  
  @js.native
  sealed trait UP_ARROW extends ShapeType
  
  @js.native
  sealed trait UP_ARROW_CALLOUT extends ShapeType
  
  @js.native
  sealed trait UP_DOWN_ARROW extends ShapeType
  
  @js.native
  sealed trait UTURN_ARROW extends ShapeType
  
  @js.native
  sealed trait VERTICAL_SCROLL extends ShapeType
  
  @js.native
  sealed trait WAVE extends ShapeType
  
  @js.native
  sealed trait WEDGE_ELLIPSE_CALLOUT extends ShapeType
  
  @js.native
  sealed trait WEDGE_RECTANGLE_CALLOUT extends ShapeType
  
  @js.native
  sealed trait WEDGE_ROUND_RECTANGLE_CALLOUT extends ShapeType
}
