package typings.flatpickr

import typings.flatpickr.instanceMod.FlatpickrFn
import typings.flatpickr.instanceMod.Instance
import typings.flatpickr.optionsMod.Options
import typings.std.ArrayLike
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  object global {
    
    trait Date extends StObject {
      
      def fp_incr(n: Double): Date
    }
    object Date {
      
      inline def apply(fp_incr: Double => Date): Date = {
        val __obj = js.Dynamic.literal(fp_incr = js.Any.fromFunction1(fp_incr))
        __obj.asInstanceOf[Date]
      }
      
      extension [Self <: Date](x: Self) {
        
        inline def setFp_incr(value: Double => Date): Self = StObject.set(x, "fp_incr", js.Any.fromFunction1(value))
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
    
    trait Window extends StObject {
      
      def flatpickr(selector: String): Instance | js.Array[Instance]
      def flatpickr(selector: String, config: Options): Instance | js.Array[Instance]
      def flatpickr(selector: ArrayLike[Node]): js.Array[Instance]
      def flatpickr(selector: ArrayLike[Node], config: Options): js.Array[Instance]
      def flatpickr(selector: Node): Instance
      def flatpickr(selector: Node, config: Options): Instance
      @JSName("flatpickr")
      var flatpickr_Original: FlatpickrFn
    }
    object Window {
      
      inline def apply(flatpickr: FlatpickrFn): Window = {
        val __obj = js.Dynamic.literal(flatpickr = flatpickr.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setFlatpickr(value: FlatpickrFn): Self = StObject.set(x, "flatpickr", value.asInstanceOf[js.Any])
      }
    }
  }
}
