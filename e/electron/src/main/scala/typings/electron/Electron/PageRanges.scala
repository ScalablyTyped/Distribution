package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRanges extends StObject {
  
  /**
    * Index of the first page to print (0-based).
    */
  var from: Double
  
  /**
    * Index of the last page to print (inclusive) (0-based).
    */
  var to: Double
}
object PageRanges {
  
  inline def apply(from: Double, to: Double): PageRanges = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRanges]
  }
  
  extension [Self <: PageRanges](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
