package typings.fineUploader.libCoreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraOptions extends StObject {
  
  /**
    * `null` allows camera access on the default button in iOS.
    *
    * Otherwise provide an extra button container element to target
    *
    * @default `null`
    */
  var button: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * Enable or disable camera access on iOS (iPod, iPhone, and iPad) devices.
    *
    * ###Note:
    * Enabling this will disable multiple file selection
    *
    * @default `false`
    */
  var ios: js.UndefOr[Boolean] = js.undefined
}
object CameraOptions {
  
  inline def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  extension [Self <: CameraOptions](x: Self) {
    
    inline def setButton(value: HTMLElement): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
  }
}
