package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceFieldOptions
  extends StObject
     with BaseFieldOptions {
  
  var autoLoad: js.UndefOr[Boolean] = js.undefined
}
object ReferenceFieldOptions {
  
  inline def apply(): ReferenceFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceFieldOptions]
  }
  
  extension [Self <: ReferenceFieldOptions](x: Self) {
    
    inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
  }
}
