package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IGroupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Group")
@js.native
/**
  * Constructor
  * @param objects Group objects
  * @param [options] Options object
  */
class Group ()
  extends typings.fabric.fabricImplMod.Group {
  def this(objects: js.Array[typings.fabric.fabricImplMod.Object]) = this()
  def this(objects: js.UndefOr[scala.Nothing], options: IGroupOptions) = this()
  def this(objects: js.Array[typings.fabric.fabricImplMod.Object], options: IGroupOptions) = this()
  def this(objects: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], isAlreadyGrouped: Boolean) = this()
  def this(objects: js.UndefOr[scala.Nothing], options: IGroupOptions, isAlreadyGrouped: Boolean) = this()
  def this(
    objects: js.Array[typings.fabric.fabricImplMod.Object],
    options: js.UndefOr[scala.Nothing],
    isAlreadyGrouped: Boolean
  ) = this()
  def this(
    objects: js.Array[typings.fabric.fabricImplMod.Object],
    options: IGroupOptions,
    isAlreadyGrouped: Boolean
  ) = this()
}
/* static members */
@JSImport("fabric", "fabric.Group")
@js.native
object Group extends js.Object {
  
  /**
    * Returns {@link fabric.Group} instance from an object representation
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an group instance is created
    */
  def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): Unit = js.native
}
