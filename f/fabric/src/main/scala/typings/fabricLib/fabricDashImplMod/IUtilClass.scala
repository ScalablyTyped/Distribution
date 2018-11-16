package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilClass extends js.Object {
  /**
  	 * Helper for creation of "classes".
  	 * @param [properties] Properties shared by all instances of this class
  	 *                  (be careful modifying objects defined here as this would affect all instances)
  	 */
  def createClass(): scala.Unit = js.native
  /**
  	 * Helper for creation of "classes".
  	 * @param [parent] optional "Class" to inherit from
  	 * @param [properties] Properties shared by all instances of this class
  	 *                  (be careful modifying objects defined here as this would affect all instances)
  	 */
  def createClass(parent: js.Function): scala.Unit = js.native
  /**
  	 * Helper for creation of "classes".
  	 * @param [parent] optional "Class" to inherit from
  	 * @param [properties] Properties shared by all instances of this class
  	 *                  (be careful modifying objects defined here as this would affect all instances)
  	 */
  def createClass(parent: js.Function, properties: js.Any): scala.Unit = js.native
  /**
  	 * Helper for creation of "classes".
  	 * @param [properties] Properties shared by all instances of this class
  	 *                  (be careful modifying objects defined here as this would affect all instances)
  	 */
  def createClass(properties: js.Any): scala.Unit = js.native
}

