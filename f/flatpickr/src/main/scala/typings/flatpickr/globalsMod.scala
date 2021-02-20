package typings.flatpickr

import typings.flatpickr.instanceMod.FlatpickrFn
import typings.flatpickr.instanceMod.Instance
import typings.flatpickr.optionsMod.Options
import typings.std.ArrayLike
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  object global {
    
    @js.native
    trait Date extends StObject {
      
      def fp_incr(n: Double): Date = js.native
    }
    object Date {
      
      @scala.inline
      def apply(fp_incr: Double => Date): Date = {
        val __obj = js.Dynamic.literal(fp_incr = js.Any.fromFunction1(fp_incr))
        __obj.asInstanceOf[Date]
      }
      
      @scala.inline
      implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFp_incr(value: Double => Date): Self = StObject.set(x, "fp_incr", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait HTMLCollection extends StObject {
      
      def flatpickr(): Instance | js.Array[Instance] = js.native
      def flatpickr(config: Options): Instance | js.Array[Instance] = js.native
    }
    
    @js.native
    trait HTMLElement extends StObject {
      
      var _flatpickr: js.UndefOr[Instance] = js.native
      
      def flatpickr(): Instance = js.native
      def flatpickr(config: Options): Instance = js.native
    }
    
    @js.native
    trait NodeList extends StObject {
      
      def flatpickr(): Instance | js.Array[Instance] = js.native
      def flatpickr(config: Options): Instance | js.Array[Instance] = js.native
    }
    
    @js.native
    trait Window extends StObject {
      
      def flatpickr(selector: String): Instance | js.Array[Instance] = js.native
      def flatpickr(selector: String, config: Options): Instance | js.Array[Instance] = js.native
      def flatpickr(selector: ArrayLike[Node]): js.Array[Instance] = js.native
      def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance] = js.native
      def flatpickr(selector: Node): Instance = js.native
      def flatpickr(selector: Node, config: Options): Instance = js.native
      @JSName("flatpickr")
      var flatpickr_Original: FlatpickrFn = js.native
    }
  }
}
