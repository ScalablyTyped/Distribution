package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ASPxClientOfficeDocumentLinkType extends StObject
/**
  * Lists the available link types within office documents.
  */
@JSGlobal("ASPxClientOfficeDocumentLinkType")
@js.native
object ASPxClientOfficeDocumentLinkType extends StObject {
  
  /**
    * The processed link is a bookmark.
    */
  @js.native
  sealed trait Bookmark extends ASPxClientOfficeDocumentLinkType
  
  /**
    * The processed link is a link to a document.
    */
  @js.native
  sealed trait Document extends ASPxClientOfficeDocumentLinkType
  
  /**
    * The processed link is an email address.
    */
  @js.native
  sealed trait EmailAddress extends ASPxClientOfficeDocumentLinkType
  
  /**
    * The processed link is a hyperlink.
    */
  @js.native
  sealed trait Hyperlink extends ASPxClientOfficeDocumentLinkType
}
