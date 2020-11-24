package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.XML_Service")
@js.native
object XMLService extends js.Object {
  
  /**
    * An enumeration representing the types of XML content nodes.
    */
  @js.native
  object ContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType with Double] = js.native
    
    /* 0 */ val CDATA: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.CDATA with Double = js.native
    
    /* 1 */ val COMMENT: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.COMMENT with Double = js.native
    
    /* 2 */ val DOCTYPE: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.DOCTYPE with Double = js.native
    
    /* 3 */ val ELEMENT: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.ELEMENT with Double = js.native
    
    /* 4 */ val ENTITYREF: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.ENTITYREF with Double = js.native
    
    /* 5 */ val PROCESSINGINSTRUCTION: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.PROCESSINGINSTRUCTION with Double = js.native
    
    /* 6 */ val TEXT: typings.googleAppsScript.GoogleAppsScript.XMLService.ContentType.TEXT with Double = js.native
  }
}
