package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "PathGroup")
@js.native
class PathGroup protected () extends Object {
  /**
  	 * Constructor
  	 * @param [options] Options object
  	 */
  def this(paths: js.Array[Path]) = this()
  def this(paths: js.Array[Path], options: IObjectOptions) = this()
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
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

@JSImport("fabric/fabric-impl", "PathGroup")
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

