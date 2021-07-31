package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSpec extends StObject {
  
  var calc: js.UndefOr[js.Function2[/* data */ DataTable, /* row */ Double, js.Any]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var sourceColumn: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ColumnSpec {
  
  @scala.inline
  def apply(): ColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSpec]
  }
  
  @scala.inline
  implicit class ColumnSpecMutableBuilder[Self <: ColumnSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalc(value: (/* data */ DataTable, /* row */ Double) => js.Any): Self = StObject.set(x, "calc", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalcUndefined: Self = StObject.set(x, "calc", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumnUndefined: Self = StObject.set(x, "sourceColumn", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
