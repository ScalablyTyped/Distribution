package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Group")
@js.native
class Group () extends ICollection[Group] {
  /**
  	 * Constructor
  	 * @param objects Group objects
  	 * @param [options] Options object
  	 */
  def this(items: js.Array[_]) = this()
  /**
  	 * Constructor
  	 * @param objects Group objects
  	 * @param [options] Options object
  	 */
  def this(items: js.Array[_], options: IObjectOptions) = this()
  def activateAllObjects(): Group = js.native
  /**
  	 * Adds an object to a group; Then recalculates group's dimension, position.
  	 * @return thisArg
  	 * @chainable
  	 */
  def addWithUpdate(`object`: js.Object): Group = js.native
  def containsPoint(point: Point): scala.Boolean = js.native
  /**
  	 * Destroys a group (restoring state of its objects)
  	 * @return thisArg
  	 * @chainable
  	 */
  def destroy(): Group = js.native
  /**
  	 * Checks whether this group was moved (since `saveCoords` was called last)
  	 * @return true if an object was moved (since fabric.Group#saveCoords was called)
  	 */
  def hasMoved(): scala.Boolean = js.native
  /**
  	 * Removes an object from a group; Then recalculates group's dimension, position.
  	 * @return thisArg
  	 * @chainable
  	 */
  def removeWithUpdate(`object`: js.Object): Group = js.native
  /**
  	 * Renders instance on a given context
  	 * @param ctx context to render instance on
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Saves coordinates of this instance (to be used together with `hasMoved`)
  	 * @saveCoords
  	 * @return thisArg
  	 * @chainable
  	 */
  def saveCoords(): Group = js.native
  /**
  	 * Sets coordinates of all group objects
  	 * @return thisArg
  	 * @chainable
  	 */
  def setObjectsCoords(): Group = js.native
  /**
       * make a group an active selection, remove the group from canvas
       * the group has to be on canvas for this to work.
       * @return {fabric.ActiveSelection} thisArg
       * @chainable
       */
  def toActiveSelection(): ActiveSelection = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Group")
@js.native
object Group extends js.Object {
  /**
  	 * Returns {@link fabric.Group} instance from an object representation
  	 * @param object Object to create a group from
  	 * @param [callback] Callback to invoke when an group instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): scala.Unit = js.native
}

