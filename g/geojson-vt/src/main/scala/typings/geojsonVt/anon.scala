package typings.geojsonVt

import typings.geojsonVt.mod.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<'${number}', geojson-vt.geojson-vt.Tile> */
  trait RecordnumberTile extends StObject {
    
    @JSName("${number}")
    var $LeftcurlybracketnumberRightcurlybracket: Tile
  }
  object RecordnumberTile {
    
    inline def apply($LeftcurlybracketnumberRightcurlybracket: Tile): RecordnumberTile = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("${number}")($LeftcurlybracketnumberRightcurlybracket.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordnumberTile]
    }
    
    extension [Self <: RecordnumberTile](x: Self) {
      
      inline def set$LeftcurlybracketnumberRightcurlybracket(value: Tile): Self = StObject.set(x, "${number}", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'z${number}', number> */
  trait Recordznumbernumber extends StObject {
    
    @JSName("z${number}")
    var z$LeftcurlybracketnumberRightcurlybracket: Double
  }
  object Recordznumbernumber {
    
    inline def apply(z$LeftcurlybracketnumberRightcurlybracket: Double): Recordznumbernumber = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("z${number}")(z$LeftcurlybracketnumberRightcurlybracket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recordznumbernumber]
    }
    
    extension [Self <: Recordznumbernumber](x: Self) {
      
      inline def setZ$LeftcurlybracketnumberRightcurlybracket(value: Double): Self = StObject.set(x, "z${number}", value.asInstanceOf[js.Any])
    }
  }
}
