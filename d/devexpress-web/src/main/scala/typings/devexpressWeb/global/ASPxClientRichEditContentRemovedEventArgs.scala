package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
@JSGlobal("ASPxClientRichEditContentRemovedEventArgs")
@js.native
open class ASPxClientRichEditContentRemovedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditContentRemovedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentRemovedEventArgs class with specified settings.
    * @param subDocumentId Gets the active sub-document's identifier.
    * @param interval Gets the text buffer interval related to the removed content.
    * @param removedText Returns the recently removed text.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval, removedText: String) = this()
  
  /**
    * Gets the text buffer interval related to the removed content.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Returns the recently removed text.
    */
  /* CompleteClass */
  var removedText: String = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  var subDocumentId: Double = js.native
}
