package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToBitmapOptions extends StObject {
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
}
object ToBitmapOptions {
  
  @scala.inline
  def apply(): ToBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToBitmapOptions]
  }
  
  @scala.inline
  implicit class ToBitmapOptionsMutableBuilder[Self <: ToBitmapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
