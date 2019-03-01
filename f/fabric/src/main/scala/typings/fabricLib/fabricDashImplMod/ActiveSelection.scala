package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "ActiveSelection")
@js.native
/**
	 * Constructor
	 * @param objects ActiveSelection objects
	 * @param [options] Options object
	 */
class ActiveSelection () extends Group {
  def this(objects: js.Array[Object]) = this()
  def this(objects: js.Array[Object], options: IObjectOptions) = this()
  /**
  	 * Change te activeSelection to a normal group,
  	 * High level function that automatically adds it to canvas as
  	 * active object. no events fired.
  	 */
  def toGroup(): Group = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "ActiveSelection")
@js.native
object ActiveSelection extends js.Object {
  /**
  	 * Returns {@link fabric.ActiveSelection} instance from an object representation
  	 * @memberOf fabric.ActiveSelection
  	 * @param object Object to create a group from
  	 * @param [callback] Callback to invoke when an ActiveSelection instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function): scala.Unit = js.native
}

