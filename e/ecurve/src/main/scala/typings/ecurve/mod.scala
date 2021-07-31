package typings.ecurve

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecurve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecurve", "Curve")
  @js.native
  class Curve protected () extends StObject {
    def this(
      p: typings.bigi.mod.^,
      a: typings.bigi.mod.^,
      b: typings.bigi.mod.^,
      Gx: typings.bigi.mod.^,
      Gy: typings.bigi.mod.^,
      n: typings.bigi.mod.^,
      h: typings.bigi.mod.^
    ) = this()
    
    var G: Point = js.native
    
    var a: typings.bigi.mod.^ = js.native
    
    var b: typings.bigi.mod.^ = js.native
    
    var h: typings.bigi.mod.^ = js.native
    
    def isInfinity(Q: js.Any): Boolean = js.native
    
    def isOnCurve(Q: js.Any): Boolean = js.native
    
    var n: typings.bigi.mod.^ = js.native
    
    var p: typings.bigi.mod.^ = js.native
    
    def pointFromX(isOdd: Boolean, x: Point): Point = js.native
    
    def validate(Q: js.Any): Boolean = js.native
  }
  
  @JSImport("ecurve", "Point")
  @js.native
  class Point protected () extends StObject {
    def this(curve: Curve, x: typings.bigi.mod.^, y: typings.bigi.mod.^, z: typings.bigi.mod.^) = this()
    
    def add(b: Point): Point = js.native
    
    var affineX: typings.bigi.mod.^ = js.native
    
    var affineY: typings.bigi.mod.^ = js.native
    
    def equals(other: Point): Boolean = js.native
    
    def getEncoded(): Buffer = js.native
    def getEncoded(compressed: Boolean): Buffer = js.native
    
    def multiply(k: js.Any): Point = js.native
    
    def multiplyTwo(j: js.Any, x: js.Any, k: js.Any): Point = js.native
    
    def negate(): Point = js.native
    
    def twice(): Point = js.native
    
    var x: typings.bigi.mod.^ = js.native
    
    var y: typings.bigi.mod.^ = js.native
    
    var z: typings.bigi.mod.^ = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("ecurve", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decodeFrom(curve: Curve, buffer: Buffer): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFrom")(curve.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def fromAffine(curve: Curve, x: typings.bigi.mod.^, y: typings.bigi.mod.^): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAffine")(curve.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  @scala.inline
  def getCurveByName(name: String): Curve = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurveByName")(name.asInstanceOf[js.Any]).asInstanceOf[Curve]
}
