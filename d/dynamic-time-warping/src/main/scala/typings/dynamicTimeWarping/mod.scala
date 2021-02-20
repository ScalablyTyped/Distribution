package typings.dynamicTimeWarping

import typings.dynamicTimeWarping.mod.global.DynamicTimeWarping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dynamic-time-warping", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends DynamicTimeWarping[T] {
    def this(ser1: js.Array[T], ser2: js.Array[T], distFunc: js.Function2[/* a */ T, /* b */ T, Double]) = this()
  }
  
  object global {
    
    @JSGlobal("DynamicTimeWarping")
    @js.native
    class DynamicTimeWarping[T] protected () extends StObject {
      def this(ser1: js.Array[T], ser2: js.Array[T], distFunc: js.Function2[/* a */ T, /* b */ T, Double]) = this()
      
      def getDistance(): Double = js.native
      
      def getPath(): js.Array[js.Tuple2[Double, Double]] = js.native
    }
  }
}
