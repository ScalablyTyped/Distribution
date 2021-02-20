package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEllipseOptions extends IObjectOptions {
  
  /**
    * Horizontal radius
    */
  var rx: js.UndefOr[Double] = js.native
  
  /**
    * Vertical radius
    */
  var ry: js.UndefOr[Double] = js.native
}
object IEllipseOptions {
  
  @scala.inline
  def apply(): IEllipseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipseOptions]
  }
  
  @scala.inline
  implicit class IEllipseOptionsMutableBuilder[Self <: IEllipseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
  }
}
