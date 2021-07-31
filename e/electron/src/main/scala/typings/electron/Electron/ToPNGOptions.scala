package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToPNGOptions extends StObject {
  
  /**
    * Defaults to 1.0.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object ToPNGOptions {
  
  @scala.inline
  def apply(): ToPNGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToPNGOptions]
  }
  
  @scala.inline
  implicit class ToPNGOptionsMutableBuilder[Self <: ToPNGOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
