package typings.devexpressUtils

import typings.devexpressUtils.typesMod.IEquatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/comparers", JSImport.Namespace)
@js.native
object comparersMod extends js.Object {
  
  @js.native
  class Comparers () extends js.Object
  /* static members */
  @js.native
  object Comparers extends js.Object {
    
    def number(a: Double, b: Double): Double = js.native
    
    def string(a: String, b: String): Double = js.native
    
    def stringIgnoreCase(a: String, b: String): Double = js.native
  }
  
  @js.native
  class Equals () extends js.Object
  /* static members */
  @js.native
  object Equals extends js.Object {
    
    def `object`[T /* <: IEquatable[T] */](a: T, b: T): Boolean = js.native
    
    def simpleType(a: String, b: String): Boolean = js.native
    def simpleType(a: Boolean, b: Boolean): Boolean = js.native
    def simpleType(a: Double, b: Double): Boolean = js.native
  }
}
