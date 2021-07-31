package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebglFilterBackendOptions extends StObject {
  
  var tileSize: Double
}
object WebglFilterBackendOptions {
  
  @scala.inline
  def apply(tileSize: Double): WebglFilterBackendOptions = {
    val __obj = js.Dynamic.literal(tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebglFilterBackendOptions]
  }
  
  @scala.inline
  implicit class WebglFilterBackendOptionsMutableBuilder[Self <: WebglFilterBackendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
  }
}
