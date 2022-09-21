package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
@JSGlobal("ASPxClientRichEditCharacterPropertiesChangedEventArgs")
@js.native
open class ASPxClientRichEditCharacterPropertiesChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditCharacterPropertiesChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditCharacterPropertiesChangedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document containing the changed characters.
    * @param interval An interval object that relates to the changed characters.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval) = this()
  
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  var subDocumentId: Double = js.native
}
