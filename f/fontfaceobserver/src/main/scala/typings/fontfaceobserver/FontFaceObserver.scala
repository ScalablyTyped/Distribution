package typings.fontfaceobserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFaceObserver extends StObject {
  
  /**
    * Starts observing the loading of the specified font. Immediately returns a new Promise that resolves when the font is available and rejected when the font is not available.
    * @param testString If your font doesn't contain latin characters you can pass a custom test string.
    * @param timeout The default timeout for giving up on font loading is 3 seconds. You can increase or decrease this by passing a number of milliseconds.
    */
  def load(): js.Promise[Unit] = js.native
  def load(testString: String): js.Promise[Unit] = js.native
  def load(testString: String, timeout: Double): js.Promise[Unit] = js.native
  def load(testString: Null, timeout: Double): js.Promise[Unit] = js.native
  def load(testString: Unit, timeout: Double): js.Promise[Unit] = js.native
}
object FontFaceObserver {
  
  trait FontVariant extends StObject {
    
    var stretch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[Double | String] = js.undefined
  }
  object FontVariant {
    
    inline def apply(): FontVariant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontVariant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontVariant] (val x: Self) extends AnyVal {
      
      inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWeight(value: Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
