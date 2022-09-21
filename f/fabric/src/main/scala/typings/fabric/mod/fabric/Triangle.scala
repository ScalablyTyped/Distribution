package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ITriangleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Triangle")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
open class Triangle ()
  extends typings.fabric.fabricImplMod.Triangle {
  def this(options: ITriangleOptions) = this()
}
/* static members */
object Triangle {
  
  @JSImport("fabric", "fabric.Triangle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns Triangle instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typings.fabric.fabricImplMod.Triangle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.fabric.fabricImplMod.Triangle]
}
