package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSGlobal("GoogleAppsScript.XML_Service.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait CDATA
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait COMMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait DOCTYPE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait ELEMENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait ENTITYREF
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait PROCESSINGINSTRUCTION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  @js.native
  sealed trait TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType
  
  /* 0 */ val CDATA: CDATA with scala.Double = js.native
  /* 1 */ val COMMENT: COMMENT with scala.Double = js.native
  /* 2 */ val DOCTYPE: DOCTYPE with scala.Double = js.native
  /* 3 */ val ELEMENT: ELEMENT with scala.Double = js.native
  /* 4 */ val ENTITYREF: ENTITYREF with scala.Double = js.native
  /* 5 */ val PROCESSINGINSTRUCTION: PROCESSINGINSTRUCTION with scala.Double = js.native
  /* 6 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType with scala.Double
  ] = js.native
}

