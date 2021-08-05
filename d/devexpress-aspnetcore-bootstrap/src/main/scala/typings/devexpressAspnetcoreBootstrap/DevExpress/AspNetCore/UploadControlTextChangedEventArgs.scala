package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadControlTextChangedEventArgs
  extends StObject
     with EventArgs {
  
  val inputIndex: Double
}
object UploadControlTextChangedEventArgs {
  
  inline def apply(inputIndex: Double, sender: Control): UploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlTextChangedEventArgs]
  }
  
  extension [Self <: UploadControlTextChangedEventArgs](x: Self) {
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
  }
}
