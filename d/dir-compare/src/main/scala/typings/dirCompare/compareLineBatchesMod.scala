package typings.dirCompare

import typings.dirCompare.lineBatchMod.LineBatch
import typings.dirCompare.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareLineBatchesMod {
  
  @JSImport("dir-compare/build/src/FileCompareHandler/lines/compare/compareLineBatches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareLineBatches(lineBatch1: LineBatch, lineBatch2: LineBatch, options: Options): CompareLineBatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLineBatches")(lineBatch1.asInstanceOf[js.Any], lineBatch2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompareLineBatchResult]
  
  trait CompareLineBatchResult extends StObject {
    
    var batchIsEqual: Boolean
    
    var reachedEof: Boolean
    
    /**
      * Lines that were not compared because the two line batches
      * contained different number of lines.
      * These remaining lines will be compared in the next step.
      */
    var restLines: RestLines
  }
  object CompareLineBatchResult {
    
    inline def apply(batchIsEqual: Boolean, reachedEof: Boolean, restLines: RestLines): CompareLineBatchResult = {
      val __obj = js.Dynamic.literal(batchIsEqual = batchIsEqual.asInstanceOf[js.Any], reachedEof = reachedEof.asInstanceOf[js.Any], restLines = restLines.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompareLineBatchResult]
    }
    
    extension [Self <: CompareLineBatchResult](x: Self) {
      
      inline def setBatchIsEqual(value: Boolean): Self = StObject.set(x, "batchIsEqual", value.asInstanceOf[js.Any])
      
      inline def setReachedEof(value: Boolean): Self = StObject.set(x, "reachedEof", value.asInstanceOf[js.Any])
      
      inline def setRestLines(value: RestLines): Self = StObject.set(x, "restLines", value.asInstanceOf[js.Any])
    }
  }
  
  trait RestLines extends StObject {
    
    var restLines1: js.Array[String]
    
    var restLines2: js.Array[String]
  }
  object RestLines {
    
    inline def apply(restLines1: js.Array[String], restLines2: js.Array[String]): RestLines = {
      val __obj = js.Dynamic.literal(restLines1 = restLines1.asInstanceOf[js.Any], restLines2 = restLines2.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestLines]
    }
    
    extension [Self <: RestLines](x: Self) {
      
      inline def setRestLines1(value: js.Array[String]): Self = StObject.set(x, "restLines1", value.asInstanceOf[js.Any])
      
      inline def setRestLines1Varargs(value: String*): Self = StObject.set(x, "restLines1", js.Array(value*))
      
      inline def setRestLines2(value: js.Array[String]): Self = StObject.set(x, "restLines2", value.asInstanceOf[js.Any])
      
      inline def setRestLines2Varargs(value: String*): Self = StObject.set(x, "restLines2", js.Array(value*))
    }
  }
}
