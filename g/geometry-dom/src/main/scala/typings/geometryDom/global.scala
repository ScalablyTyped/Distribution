package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMMatrix")
  @js.native
  class DOMMatrix ()
    extends typings.geometryDom.GeometryDom.DOMMatrix {
    def this(array: js.Array[Double]) = this()
    def this(other: typings.geometryDom.GeometryDom.DOMMatrixReadOnly) = this()
    def this(transformList: String) = this()
    def this(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMMatrixReadOnly")
  @js.native
  class DOMMatrixReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMMatrixReadOnly {
    def this(numberSequence: js.Array[Double]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMPoint")
  @js.native
  class DOMPoint ()
    extends typings.geometryDom.GeometryDom.DOMPoint {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMPointReadOnly")
  @js.native
  class DOMPointReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMPointReadOnly {
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMQuad")
  @js.native
  class DOMQuad ()
    extends typings.geometryDom.GeometryDom.DOMQuad {
    def this(p1: DOMPointInit) = this()
    def this(rect: DOMRectInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(
      p1: js.UndefOr[scala.Nothing],
      p2: js.UndefOr[scala.Nothing],
      p3: js.UndefOr[scala.Nothing],
      p4: DOMPointInit
    ) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMRect")
  @js.native
  class DOMRect protected ()
    extends typings.geometryDom.GeometryDom.DOMRect {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMRectReadOnly")
  @js.native
  class DOMRectReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMRectReadOnly {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
}
