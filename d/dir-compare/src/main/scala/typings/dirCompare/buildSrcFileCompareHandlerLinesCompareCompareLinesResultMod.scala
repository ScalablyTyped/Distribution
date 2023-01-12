package typings.dirCompare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFileCompareHandlerLinesCompareCompareLinesResultMod {
  
  trait CompareLinesResult extends StObject {
    
    /**
      * Whether compared lines are identical.
      */
    var isEqual: Boolean
    
    /**
      * Lines that were not compared due to unbalanced buffers.
      */
    var restLines1: js.Array[String]
    
    /**
      * Lines that were not compared due to unbalanced buffers.
      */
    var restLines2: js.Array[String]
  }
  object CompareLinesResult {
    
    inline def apply(isEqual: Boolean, restLines1: js.Array[String], restLines2: js.Array[String]): CompareLinesResult = {
      val __obj = js.Dynamic.literal(isEqual = isEqual.asInstanceOf[js.Any], restLines1 = restLines1.asInstanceOf[js.Any], restLines2 = restLines2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompareLinesResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompareLinesResult] (val x: Self) extends AnyVal {
      
      inline def setIsEqual(value: Boolean): Self = StObject.set(x, "isEqual", value.asInstanceOf[js.Any])
      
      inline def setRestLines1(value: js.Array[String]): Self = StObject.set(x, "restLines1", value.asInstanceOf[js.Any])
      
      inline def setRestLines1Varargs(value: String*): Self = StObject.set(x, "restLines1", js.Array(value*))
      
      inline def setRestLines2(value: js.Array[String]): Self = StObject.set(x, "restLines2", value.asInstanceOf[js.Any])
      
      inline def setRestLines2Varargs(value: String*): Self = StObject.set(x, "restLines2", js.Array(value*))
    }
  }
}
