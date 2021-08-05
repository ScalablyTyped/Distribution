package typings.devextreme.anon

import typings.devextreme.devextremeStrings.array
import typings.devextreme.devextremeStrings.local
import typings.devextreme.devextremeStrings.odata
import typings.devextreme.devextremeStrings.xmla
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: js.UndefOr[array | local | odata | xmla] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: array | local | odata | xmla): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
