package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "PathGroup")
@js.native
class PathGroup protected () extends js.Object {
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  def this(paths: js.Array[Path]) = this()
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  def this(paths: js.Array[Path], options: IObjectOptions) = this()
  /**
  	 * Returns number representation of object's complexity
  	 * @return complexity
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Returns all paths in this path group
  	 * @return array of path objects included in this path group
  	 */
  def getObjects(): js.Array[Path] = js.native
  def initialize(paths: js.Array[Path]): scala.Unit = js.native
  def initialize(paths: js.Array[Path], options: IObjectOptions): scala.Unit = js.native
  /**
  	 * Returns true if all paths in this group are of same color
  	 * @return true if all paths are of the same color (`fill`)
  	 */
  def isSameColor(): scala.Boolean = js.native
  /**
  	 * Renders this group on a specified context
  	 * @param ctx Context to render this instance on
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  /**
  	 * Returns dataless object representation of this path group
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return dataless object representation of an instance
  	 */
  def toDatalessObject(): js.Any = js.native
  /**
  	 * Returns dataless object representation of this path group
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return dataless object representation of an instance
  	 */
  def toDatalessObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns object representation of this path group
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of this path group
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
- Dropped Object */ @JSImport("fabric/fabric-impl", "PathGroup")
@js.native
object PathGroup extends js.Object {
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.PathGroup = js.native
  /**
  	 * Creates fabric.PathGroup instance from an object representation
  	 * @param object Object to create an instance from
  	 * @param callback Callback to invoke when an fabric.PathGroup instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): scala.Unit = js.native
}

