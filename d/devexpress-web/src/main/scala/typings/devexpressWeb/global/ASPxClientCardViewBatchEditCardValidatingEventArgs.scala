package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardValidatingEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardValidatingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCardViewBatchEditCardValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card's visible index.
    * @param validationInfo An object containing validation information.
    */
  def this(visibleIndex: Double, validationInfo: js.Any) = this()
  
  /**
    * Provides validation information of a card currently being validated.
    */
  /* CompleteClass */
  var validationInfo: js.Any = js.native
  
  /**
    * Gets the processed card's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
