package typings.devexpressUtils

import typings.devexpressUtils.typesMod.IEquatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparersMod {
  
  @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers")
  @js.native
  class Comparers () extends StObject
  /* static members */
  object Comparers {
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers.number")
    @js.native
    def number(a: Double, b: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers.string")
    @js.native
    def string(a: String, b: String): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Comparers.stringIgnoreCase")
    @js.native
    def stringIgnoreCase(a: String, b: String): Double = js.native
  }
  
  @JSImport("@devexpress/utils/lib/utils/comparers", "Equals")
  @js.native
  class Equals () extends StObject
  /* static members */
  object Equals {
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Equals.simpleType")
    @js.native
    def simpleType(a: String, b: String): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/comparers", "Equals.simpleType")
    @js.native
    def simpleType(a: Boolean, b: Boolean): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/comparers", "Equals.simpleType")
    @js.native
    def simpleType(a: Double, b: Double): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/comparers", "Equals.object")
    @js.native
    def `object`[T /* <: IEquatable[T] */](a: T, b: T): Boolean = js.native
  }
}
