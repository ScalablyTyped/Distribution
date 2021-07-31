package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasDimensionsOptions extends StObject {
  
  /**
    * Set the given dimensions only as canvas backstore dimensions
    */
  var backstoreOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the given dimensions only as css dimensions
    */
  var cssOnly: js.UndefOr[Boolean] = js.undefined
}
object ICanvasDimensionsOptions {
  
  @scala.inline
  def apply(): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
  
  @scala.inline
  implicit class ICanvasDimensionsOptionsMutableBuilder[Self <: ICanvasDimensionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackstoreOnly(value: Boolean): Self = StObject.set(x, "backstoreOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackstoreOnlyUndefined: Self = StObject.set(x, "backstoreOnly", js.undefined)
    
    @scala.inline
    def setCssOnly(value: Boolean): Self = StObject.set(x, "cssOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssOnlyUndefined: Self = StObject.set(x, "cssOnly", js.undefined)
  }
}
