package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

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
  
  /* 0 */ val CDATA: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.CDATA with Double = js.native
  /* 1 */ val COMMENT: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.COMMENT with Double = js.native
  /* 2 */ val DOCTYPE: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.DOCTYPE with Double = js.native
  /* 3 */ val ELEMENT: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.ELEMENT with Double = js.native
  /* 4 */ val ENTITYREF: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.ENTITYREF with Double = js.native
  /* 5 */ val PROCESSINGINSTRUCTION: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.PROCESSINGINSTRUCTION with Double = js.native
  /* 6 */ val TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.ContentType.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}

