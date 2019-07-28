package typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSGlobal("GoogleAppsScript.XML_Service.ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait CDATA extends ContentType
  
  @js.native
  sealed trait COMMENT extends ContentType
  
  @js.native
  sealed trait DOCTYPE extends ContentType
  
  @js.native
  sealed trait ELEMENT extends ContentType
  
  @js.native
  sealed trait ENTITYREF extends ContentType
  
  @js.native
  sealed trait PROCESSINGINSTRUCTION extends ContentType
  
  @js.native
  sealed trait TEXT extends ContentType
  
  /* 0 */ val CDATA: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.CDATA with Double = js.native
  /* 1 */ val COMMENT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.COMMENT with Double = js.native
  /* 2 */ val DOCTYPE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.DOCTYPE with Double = js.native
  /* 3 */ val ELEMENT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.ELEMENT with Double = js.native
  /* 4 */ val ENTITYREF: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.ENTITYREF with Double = js.native
  /* 5 */ val PROCESSINGINSTRUCTION: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.PROCESSINGINSTRUCTION with Double = js.native
  /* 6 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.ContentType.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}

