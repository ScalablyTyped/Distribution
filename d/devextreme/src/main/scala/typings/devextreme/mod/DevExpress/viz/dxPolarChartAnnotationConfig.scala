package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartAnnotationConfig
  extends StObject
     with dxPolarChartCommonAnnotationConfig {
  
  /**
    * Specifies the annotation&apos;s name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object dxPolarChartAnnotationConfig {
  
  inline def apply(): dxPolarChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartAnnotationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartAnnotationConfig] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
