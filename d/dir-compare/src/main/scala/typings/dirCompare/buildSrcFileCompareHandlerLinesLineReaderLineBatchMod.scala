package typings.dirCompare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFileCompareHandlerLinesLineReaderLineBatchMod {
  
  trait LineBatch extends StObject {
    
    /**
      * Batch of lines available after this read operation.
      */
    var lines: js.Array[String]
    
    /**
      * Whether we reached end of file.
      */
    var reachedEof: Boolean
    
    /**
      * First part of a line that was split due to buffer boundary.
      * It will be used in a subsequent read to complete the next line.
      */
    var rest: String
  }
  object LineBatch {
    
    inline def apply(lines: js.Array[String], reachedEof: Boolean, rest: String): LineBatch = {
      val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], reachedEof = reachedEof.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineBatch]
    }
    
    extension [Self <: LineBatch](x: Self) {
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setReachedEof(value: Boolean): Self = StObject.set(x, "reachedEof", value.asInstanceOf[js.Any])
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    }
  }
}
