package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
@JSGlobal("ASPxClientRichEditContentRemovedEventArgs")
@js.native
class ASPxClientRichEditContentRemovedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditContentRemovedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentRemovedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contained the removed content.
    * @param interval An interval object that relates to the removed content.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval) = this()
  
  /**
    * Gets the text buffer interval related to the removed content.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  var subDocumentId: Double = js.native
}
