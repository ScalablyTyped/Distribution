package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
trait ASPxClientUploadControlTextChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  var inputIndex: Double
}
object ASPxClientUploadControlTextChangedEventArgs {
  
  inline def apply(inputIndex: Double): ASPxClientUploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlTextChangedEventArgs]
  }
  
  extension [Self <: ASPxClientUploadControlTextChangedEventArgs](x: Self) {
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
  }
}
