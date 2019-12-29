package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

/**
  * An enumeration representing the types of XML content nodes.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
  /* 0 */ @js.native
  object CDATA extends TopLevel[CDATA with Double]
  
  /* 1 */ @js.native
  object COMMENT extends TopLevel[COMMENT with Double]
  
  /* 2 */ @js.native
  object DOCTYPE extends TopLevel[DOCTYPE with Double]
  
  /* 3 */ @js.native
  object ELEMENT extends TopLevel[ELEMENT with Double]
  
  /* 4 */ @js.native
  object ENTITYREF extends TopLevel[ENTITYREF with Double]
  
  /* 5 */ @js.native
  object PROCESSINGINSTRUCTION extends TopLevel[PROCESSINGINSTRUCTION with Double]
  
  /* 6 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
}

