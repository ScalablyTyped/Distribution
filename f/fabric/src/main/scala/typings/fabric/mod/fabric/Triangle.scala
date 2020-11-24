package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.ITriangleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Triangle")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Triangle ()
  extends typings.fabric.fabricImplMod.Triangle {
  def this(options: ITriangleOptions) = this()
}
/* static members */
@JSImport("fabric", "fabric.Triangle")
@js.native
object Triangle extends js.Object {
  
  /**
    * Returns Triangle instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): typings.fabric.fabricImplMod.Triangle = js.native
}
