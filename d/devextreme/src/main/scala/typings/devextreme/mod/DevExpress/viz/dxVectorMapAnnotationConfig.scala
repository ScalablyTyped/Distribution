package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxVectorMapAnnotationConfig
  extends StObject
     with dxVectorMapCommonAnnotationConfig {
  
  /**
    * Specifies the annotation&apos;s name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object dxVectorMapAnnotationConfig {
  
  inline def apply(): dxVectorMapAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapAnnotationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxVectorMapAnnotationConfig] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
