package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowValidatingEventArgs")
@js.native
open class ASPxClientGridViewBatchEditRowValidatingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGridViewBatchEditRowValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param validationInfo An object that provides the row's validation info.
    * @param key An object that is the row's key.
    */
  def this(visibleIndex: Double, validationInfo: Any, key: Any) = this()
  
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Provides validation information of a row currently being validated.
    */
  /* CompleteClass */
  var validationInfo: Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
