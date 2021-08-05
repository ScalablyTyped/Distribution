package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Triangle")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Triangle () extends Object {
  def this(options: ITriangleOptions) = this()
}
/* static members */
object Triangle {
  
  @JSImport("fabric/fabric-impl", "Triangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns Triangle instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: js.Any): Triangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Triangle]
}
