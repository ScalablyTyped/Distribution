package typings.fineUploader.libCoreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasteOptions extends StObject {
  
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[String] = js.undefined
  
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[HTMLElement] = js.undefined
}
object PasteOptions {
  
  inline def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasteOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
    
    inline def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
