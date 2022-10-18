package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRectangleMod {
  
  @JSImport("@fluentui/utilities/lib/Rectangle", "Rectangle")
  @js.native
  open class Rectangle () extends StObject {
    def this(left: Double) = this()
    def this(left: Double, right: Double) = this()
    def this(left: Unit, right: Double) = this()
    def this(left: Double, right: Double, top: Double) = this()
    def this(left: Double, right: Unit, top: Double) = this()
    def this(left: Unit, right: Double, top: Double) = this()
    def this(left: Unit, right: Unit, top: Double) = this()
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    def this(left: Double, right: Double, top: Unit, bottom: Double) = this()
    def this(left: Double, right: Unit, top: Double, bottom: Double) = this()
    def this(left: Double, right: Unit, top: Unit, bottom: Double) = this()
    def this(left: Unit, right: Double, top: Double, bottom: Double) = this()
    def this(left: Unit, right: Double, top: Unit, bottom: Double) = this()
    def this(left: Unit, right: Unit, top: Double, bottom: Double) = this()
    def this(left: Unit, right: Unit, top: Unit, bottom: Double) = this()
    
    var bottom: Double = js.native
    
    /**
      * Tests if another rect is approximately equal to this rect (within 4 decimal places.)
      */
    def equals(rect: Rectangle): Boolean = js.native
    
    /**
      * Calculated automatically by subtracting the bottom from top.
      */
    def height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    /**
      * Calculated automatically by subtracting the right from left
      */
    def width: Double = js.native
  }
}
