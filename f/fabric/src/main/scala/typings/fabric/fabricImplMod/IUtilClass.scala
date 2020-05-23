package typings.fabric.fabricImplMod

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
  def createClass(): js.Any = js.native
  /**
    * Helper for creation of "classes".
    * @param [parent] optional "Class" to inherit from
    * @param [properties] Properties shared by all instances of this class
    *                  (be careful modifying objects defined here as this would affect all instances)
    */
  def createClass(parent: js.Function): js.Any = js.native
  def createClass(parent: js.Function, properties: js.Any): js.Any = js.native
  def createClass(properties: js.Any): js.Any = js.native
}

