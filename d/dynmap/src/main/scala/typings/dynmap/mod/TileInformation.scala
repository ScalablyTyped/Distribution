package typings.dynmap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileInformation extends StObject {
  
  var fmt: ImageFormat
  
  var nightday: String
  
  var prefix: String
  
  var scaledx: Double
  
  var scaledy: Double
  
  var x: Double
  
  var y: Double
  
  var zoom: String
  
  var zoomprefix: String
}
object TileInformation {
  
  inline def apply(
    fmt: ImageFormat,
    nightday: String,
    prefix: String,
    scaledx: Double,
    scaledy: Double,
    x: Double,
    y: Double,
    zoom: String,
    zoomprefix: String
  ): TileInformation = {
    val __obj = js.Dynamic.literal(fmt = fmt.asInstanceOf[js.Any], nightday = nightday.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scaledx = scaledx.asInstanceOf[js.Any], scaledy = scaledy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomprefix = zoomprefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileInformation]
  }
  
  extension [Self <: TileInformation](x: Self) {
    
    inline def setFmt(value: ImageFormat): Self = StObject.set(x, "fmt", value.asInstanceOf[js.Any])
    
    inline def setNightday(value: String): Self = StObject.set(x, "nightday", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setScaledx(value: Double): Self = StObject.set(x, "scaledx", value.asInstanceOf[js.Any])
    
    inline def setScaledy(value: Double): Self = StObject.set(x, "scaledy", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomprefix(value: String): Self = StObject.set(x, "zoomprefix", value.asInstanceOf[js.Any])
  }
}
