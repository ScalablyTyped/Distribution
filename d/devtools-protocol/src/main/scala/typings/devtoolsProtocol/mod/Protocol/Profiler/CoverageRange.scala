package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageRange extends StObject {
  
  /**
    * Collected execution count of the source range.
    */
  var count: integer = js.native
  
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: integer = js.native
  
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: integer = js.native
}
object CoverageRange {
  
  @scala.inline
  def apply(count: integer, endOffset: integer, startOffset: integer): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageRange]
  }
  
  @scala.inline
  implicit class CoverageRangeMutableBuilder[Self <: CoverageRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: integer): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: integer): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
