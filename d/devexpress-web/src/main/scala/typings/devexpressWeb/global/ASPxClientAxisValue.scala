package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the information about an axis value.
  */
@JSGlobal("ASPxClientAxisValue")
@js.native
class ASPxClientAxisValue ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAxisValue {
  
  /**
    * Gets the axis value, if the axis scale type is date-time.
    */
  /* CompleteClass */
  var dateTimeValue: Date = js.native
  
  /**
    * Gets the axis value, if the axis scale type is numerical.
    */
  /* CompleteClass */
  var numericalValue: Double = js.native
  
  /**
    * Gets the axis value, if the axis scale type is qualitative.
    */
  /* CompleteClass */
  var qualitativeValue: String = js.native
  
  /**
    * Gets the axis scale type.
    */
  /* CompleteClass */
  var scaleType: String = js.native
  
  /* CompleteClass */
  var timeSpanValue: js.Any = js.native
}
