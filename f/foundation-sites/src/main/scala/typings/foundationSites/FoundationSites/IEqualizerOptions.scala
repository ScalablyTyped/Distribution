package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEqualizerOptions extends StObject {
  
  var equalizeByRow: js.UndefOr[Boolean] = js.undefined
  
  var equalizeOn: js.UndefOr[String] = js.undefined
  
  var equalizeOnStack: js.UndefOr[Boolean] = js.undefined
}
object IEqualizerOptions {
  
  inline def apply(): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEqualizerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEqualizerOptions] (val x: Self) extends AnyVal {
    
    inline def setEqualizeByRow(value: Boolean): Self = StObject.set(x, "equalizeByRow", value.asInstanceOf[js.Any])
    
    inline def setEqualizeByRowUndefined: Self = StObject.set(x, "equalizeByRow", js.undefined)
    
    inline def setEqualizeOn(value: String): Self = StObject.set(x, "equalizeOn", value.asInstanceOf[js.Any])
    
    inline def setEqualizeOnStack(value: Boolean): Self = StObject.set(x, "equalizeOnStack", value.asInstanceOf[js.Any])
    
    inline def setEqualizeOnStackUndefined: Self = StObject.set(x, "equalizeOnStack", js.undefined)
    
    inline def setEqualizeOnUndefined: Self = StObject.set(x, "equalizeOn", js.undefined)
  }
}
