package typings.fineUploader.coreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasteOptions extends StObject {
  
  /**
    * The default name given to pasted images
    *
    * @default `'pasted_image'`
    */
  var defaultName: js.UndefOr[String] = js.native
  
  /**
    * Enable this feature by providing any HTMLElement here
    *
    * @default `null`
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
}
object PasteOptions {
  
  @scala.inline
  def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  
  @scala.inline
  implicit class PasteOptionsMutableBuilder[Self <: PasteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
    
    @scala.inline
    def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
  }
}
