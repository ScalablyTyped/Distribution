package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IGroupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Group")
@js.native
/**
  * Constructor
  * @param objects Group objects
  * @param [options] Options object
  */
open class Group ()
  extends typings.fabric.fabricImplMod.Group {
  def this(objects: js.Array[typings.fabric.fabricImplMod.Object]) = this()
  def this(objects: js.Array[typings.fabric.fabricImplMod.Object], options: IGroupOptions) = this()
  def this(objects: Unit, options: IGroupOptions) = this()
  def this(objects: js.Array[typings.fabric.fabricImplMod.Object], options: Unit, isAlreadyGrouped: Boolean) = this()
  def this(
    objects: js.Array[typings.fabric.fabricImplMod.Object],
    options: IGroupOptions,
    isAlreadyGrouped: Boolean
  ) = this()
  def this(objects: Unit, options: Unit, isAlreadyGrouped: Boolean) = this()
  def this(objects: Unit, options: IGroupOptions, isAlreadyGrouped: Boolean) = this()
}
/* static members */
object Group {
  
  @JSImport("fabric", "fabric.Group")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns {@link fabric.Group} instance from an object representation
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an group instance is created
    */
  inline def fromObject(`object`: Any, callback: js.Function1[/* group */ this.type, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
