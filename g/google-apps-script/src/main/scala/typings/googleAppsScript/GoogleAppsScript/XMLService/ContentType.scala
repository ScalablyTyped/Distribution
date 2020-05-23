package typings.googleAppsScript.GoogleAppsScript.XMLService

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
  
}

