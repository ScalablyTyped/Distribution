package typings.getRange

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Lazy number range generator.
  @example
  ```
  import getRange = require('get-range');
  for (const index of getRange({end: 4})) {
  	console.log(index);
  }
  //=> 0
  //=> 1
  //=> 2
  //=> 3
  const range = getRange({start: 0, end: 4, step: 2});
  range.next().value;
  //=> 0
  range.next().value;
  //=> 2
  console.log(...getRange({start: 0, end: -5, step: -1}));
  //=> [0, -1, -2, -3, -4]
  ```
  */
  @JSImport("get-range", JSImport.Namespace)
  @js.native
  def apply(range: Range): IterableIterator[Double] = js.native
  
  @js.native
  trait Range extends StObject {
    
    /**
    		End of the range.
    		*/
    val end: Double = js.native
    
    /**
    		Start of the range.
    		@default 0
    		*/
    val start: js.UndefOr[Double] = js.native
    
    /**
    		Distance between numbers.
    		Minimum: `1`.
    		@default 1
    		*/
    val step: js.UndefOr[Double] = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
