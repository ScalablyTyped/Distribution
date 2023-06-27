package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "ActiveSelection")
@js.native
/**
  * Constructor
  * @param objects ActiveSelection objects
  * @param [options] Options object
  */
open class ActiveSelection () extends Group {
  def this(objects: js.Array[Object]) = this()
  def this(objects: js.Array[Object], options: IObjectOptions) = this()
  def this(objects: Unit, options: IObjectOptions) = this()
  
  /**
    * Constructor
    * @param {Object} objects ActiveSelection objects
    * @param {Object} [options] Options object
    * @return {Object} thisArg
    */
  def initialize(objects: ActiveSelection): Object = js.native
  def initialize(objects: ActiveSelection, options: IObjectOptions): Object = js.native
  
  /**
    * Change te activeSelection to a normal group,
    * High level function that automatically adds it to canvas as
    * active object. no events fired.
    */
  def toGroup(): Group = js.native
}
/* static members */
object ActiveSelection {
  
  @JSImport("fabric/fabric-impl", "ActiveSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns {@link fabric.ActiveSelection} instance from an object representation
    * @param object Object to create a group from
    * @param [callback] Callback to invoke when an ActiveSelection instance is created
    */
  inline def fromObject(`object`: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
