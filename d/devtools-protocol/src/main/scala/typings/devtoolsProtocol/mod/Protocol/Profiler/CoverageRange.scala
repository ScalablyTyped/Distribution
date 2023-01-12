package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageRange extends StObject {
  
  /**
    * Collected execution count of the source range.
    */
  var count: integer
  
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: integer
  
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: integer
}
object CoverageRange {
  
  inline def apply(count: integer, endOffset: integer, startOffset: integer): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageRange] (val x: Self) extends AnyVal {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEndOffset(value: integer): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: integer): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
