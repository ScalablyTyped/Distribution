package typings.geojsonEquality

import typings.geojson.mod.GeoJsonObject
import typings.geojsonEquality.anon.Partialprecisionnumberdir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geojson-equality", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GeojsonEquality {
    def this(options: Partialprecisionnumberdir) = this()
    
    /* CompleteClass */
    override def compare(a: GeoJsonObject, b: GeoJsonObject): Boolean = js.native
  }
  
  trait GeojsonEquality extends StObject {
    
    def compare(a: GeoJsonObject, b: GeoJsonObject): Boolean
  }
  object GeojsonEquality {
    
    inline def apply(compare: (GeoJsonObject, GeoJsonObject) => Boolean): GeojsonEquality = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
      __obj.asInstanceOf[GeojsonEquality]
    }
    
    extension [Self <: GeojsonEquality](x: Self) {
      
      inline def setCompare(value: (GeoJsonObject, GeoJsonObject) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    }
  }
}
