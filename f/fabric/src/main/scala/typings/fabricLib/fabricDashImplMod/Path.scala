package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Path")
@js.native
class Path () extends IPathOptions {
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: java.lang.String) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: js.Array[_]) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: java.lang.String, options: IPathOptions) = this()
  /**
  	 * Constructor
  	 * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  	 * @param [options] Options object
  	 */
  def this(path: js.Array[_], options: IPathOptions) = this()
  var pathOffset: Point = js.native
  /**
  	 * Returns number representation of an instance complexity
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
  def initialize(): Path = js.native
  def initialize(path: js.Array[_]): Path = js.native
  def initialize(path: js.Array[_], options: IPathOptions): Path = js.native
  /**
  	 * Renders path on a specified context
  	 * @param ctx context to render path on
  	 * @param [noTransform] When true, context is not transformed
  	 */
  def render(ctx: stdLib.CanvasRenderingContext2D, noTransform: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns dataless object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toDatalessObject(): js.Any = js.native
  /**
  	 * Returns dataless object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toDatalessObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
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
- Dropped Object */ @JSImport("fabric/fabric-impl", "Path")
@js.native
object Path extends js.Object {
  /**
  	 * Creates an instance of fabric.Path from an SVG <path> element
  	 * @param element to parse
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Path from an SVG <path> element
  	 * @param element to parse
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 * @param [options] Options object
  	 */
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function1[/* path */ this.type, _],
    options: fabricLib.fabricDashImplMod.IPathOptions
  ): scala.Unit = js.native
  /**
  	 * Creates an instance of fabric.Path from an object
  	 * @param callback Callback to invoke when an fabric.Path instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* path */ this.type, _]): scala.Unit = js.native
}

