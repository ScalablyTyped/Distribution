package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerShowing event.
  */
@JSGlobal("ASPxClientImageGalleryCancelEventArgs")
@js.native
class ASPxClientImageGalleryCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientImageGalleryCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientImageGalleryCancelEventArgs class.
    * @param index A Int32 value that is the processed item index.
    * @param name A String value that specifies the processed item's unique identifier name.
    */
  def this(index: Double, name: String) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the index of the item related to the event.
    */
  /* CompleteClass */
  var index: Double = js.native
  
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  /* CompleteClass */
  var name: String = js.native
}
