package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Baseline extends StObject {
  
  var baseline: Double = js.native
  
  var size: Double = js.native
}
object Baseline {
  
  @scala.inline
  def apply(baseline: Double, size: Double): Baseline = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseline]
  }
  
  @scala.inline
  implicit class BaselineMutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
