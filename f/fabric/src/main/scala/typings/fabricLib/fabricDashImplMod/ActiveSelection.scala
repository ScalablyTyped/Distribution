package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "ActiveSelection")
@js.native
class ActiveSelection () extends ICollection[Group] {
  /**
  	 * Constructor
  	 * @param objects ActiveSelection objects
  	 * @param [options] Options object
  	 */
  def this(items: js.Array[js.Object]) = this()
  /**
  	 * Constructor
  	 * @param objects ActiveSelection objects
  	 * @param [options] Options object
  	 */
  def this(items: js.Array[js.Object], options: IObjectOptions) = this()
  /**
       * Change te activeSelection to a normal group,
       * High level function that automatically adds it to canvas as
       * active object. no events fired.
       */
  def toGroup(): Group = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "ActiveSelection")
@js.native
object ActiveSelection extends js.Object {
  /**
  	 * Returns {@link fabric.ActiveSelection} instance from an object representation
  	 * @memberOf fabric.ActiveSelection
  	 * @param object Object to create a group from
  	 * @param [callback] Callback to invoke when an ActiveSelection instance is created
  	 */
  def fromObject(
    `object`: fabricLib.fabricDashImplMod.Group,
    callback: js.Function1[/* activeSelection */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

