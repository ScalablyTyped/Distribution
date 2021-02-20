package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unit extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[String] = js.native
}
object Unit {
  
  @scala.inline
  def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  
  @scala.inline
  implicit class UnitMutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
