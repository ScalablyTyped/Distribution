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
  
  val CDATA: CDATA with java.lang.String = js.native
  val COMMENT: COMMENT with java.lang.String = js.native
  val DOCTYPE: DOCTYPE with java.lang.String = js.native
  val ELEMENT: ELEMENT with java.lang.String = js.native
  val ENTITYREF: ENTITYREF with java.lang.String = js.native
  val PROCESSINGINSTRUCTION: PROCESSINGINSTRUCTION with java.lang.String = js.native
  val TEXT: TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType with java.lang.String
  ] = js.native
}

