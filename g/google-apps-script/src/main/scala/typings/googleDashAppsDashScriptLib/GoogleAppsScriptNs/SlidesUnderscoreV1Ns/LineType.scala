package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineType extends js.Object

// Derived from a subset of the values of the "ST_ShapeType" simple type in
// section 20.1.10.55 of "Office Open XML File Formats - Fundamentals and
// Markup Language Reference", part 1 of [ECMA-376 4th edition]
// (http://www.ecma-international.org/publications/standards/Ecma-376.htm).
@JSGlobal("GoogleAppsScript.Slides_v1.LineType")
@js.native
object LineType extends js.Object {
  // Bent connector 2 form. Corresponds to ECMA-376 ST_ShapeType
  // 'bentConnector2'.
  @js.native
  sealed trait BENT_CONNECTOR_2
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Bent connector 3 form. Corresponds to ECMA-376 ST_ShapeType
  // 'bentConnector3'.
  @js.native
  sealed trait BENT_CONNECTOR_3
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Bent connector 4 form. Corresponds to ECMA-376 ST_ShapeType
  // 'bentConnector4'.
  @js.native
  sealed trait BENT_CONNECTOR_4
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Bent connector 5 form. Corresponds to ECMA-376 ST_ShapeType
  // 'bentConnector5'.
  @js.native
  sealed trait BENT_CONNECTOR_5
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Curved connector 2 form. Corresponds to ECMA-376 ST_ShapeType
  // 'curvedConnector2'.
  @js.native
  sealed trait CURVED_CONNECTOR_2
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Curved connector 3 form. Corresponds to ECMA-376 ST_ShapeType
  // 'curvedConnector3'.
  @js.native
  sealed trait CURVED_CONNECTOR_3
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Curved connector 4 form. Corresponds to ECMA-376 ST_ShapeType
  // 'curvedConnector4'.
  @js.native
  sealed trait CURVED_CONNECTOR_4
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Curved connector 5 form. Corresponds to ECMA-376 ST_ShapeType
  // 'curvedConnector5'.
  @js.native
  sealed trait CURVED_CONNECTOR_5
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Straight connector 1 form. Corresponds to ECMA-376 ST_ShapeType
  // 'straightConnector1'.
  @js.native
  sealed trait STRAIGHT_CONNECTOR_1
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // Straight line. Corresponds to ECMA-376 ST_ShapeType 'line'. This line
  // type is not a connector.
  @js.native
  sealed trait STRAIGHT_LINE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  // An unspecified line type.
  @js.native
  sealed trait TYPE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType
  
  val BENT_CONNECTOR_2: BENT_CONNECTOR_2 with java.lang.String = js.native
  val BENT_CONNECTOR_3: BENT_CONNECTOR_3 with java.lang.String = js.native
  val BENT_CONNECTOR_4: BENT_CONNECTOR_4 with java.lang.String = js.native
  val BENT_CONNECTOR_5: BENT_CONNECTOR_5 with java.lang.String = js.native
  val CURVED_CONNECTOR_2: CURVED_CONNECTOR_2 with java.lang.String = js.native
  val CURVED_CONNECTOR_3: CURVED_CONNECTOR_3 with java.lang.String = js.native
  val CURVED_CONNECTOR_4: CURVED_CONNECTOR_4 with java.lang.String = js.native
  val CURVED_CONNECTOR_5: CURVED_CONNECTOR_5 with java.lang.String = js.native
  val STRAIGHT_CONNECTOR_1: STRAIGHT_CONNECTOR_1 with java.lang.String = js.native
  val STRAIGHT_LINE: STRAIGHT_LINE with java.lang.String = js.native
  val TYPE_UNSPECIFIED: TYPE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineType with java.lang.String
  ] = js.native
}

