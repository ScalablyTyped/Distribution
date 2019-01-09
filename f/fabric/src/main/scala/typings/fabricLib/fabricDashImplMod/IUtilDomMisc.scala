package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilDomMisc extends js.Object {
  /**
  	 * Adds class to an element
  	 * @param element Element to add class to
  	 * @param className Class to add to an element
  	 */
  def addClass(element: stdLib.HTMLElement, classname: java.lang.String): scala.Unit = js.native
  /**
  	 * Takes id and returns an element with that id (if one exists in a document)
  	 */
  def getById(id: java.lang.String): stdLib.HTMLElement = js.native
  def getById(id: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /**
  	 * Returns offset for a given element
  	 * @param element Element to get offset for
  	 */
  def getElementOffset(element: stdLib.HTMLElement): fabricLib.Anon_LeftRight = js.native
  /**
  	 * Returns style attribute value of a given element
  	 * @param element Element to get style attribute for
  	 * @param attr Style attribute to get for element
  	 */
  def getElementStyle(elment: stdLib.HTMLElement, attr: java.lang.String): java.lang.String = js.native
  /**
  	 * Inserts a script element with a given url into a document; invokes callback, when that script is finished loading
  	 * @param url URL of a script to load
  	 * @param callback Callback to execute when script is finished loading
  	 */
  def getScript(url: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
  	 * Returns element scroll offsets
  	 * @param element Element to operate on
  	 * @param upperCanvasEl Upper canvas element
  	 */
  def getScrollLeftTop(element: stdLib.HTMLElement, upperCanvasEl: stdLib.HTMLElement): fabricLib.Anon_LeftRight = js.native
  /**
  	 * Creates specified element with specified attributes
  	 * @param tagName Type of an element to create
  	 * @param [attributes] Attributes to set on an element
  	 * @return Newly created element
  	 */
  def makeElement(tagName: java.lang.String): stdLib.HTMLElement = js.native
  def makeElement(tagName: java.lang.String, attributes: js.Any): stdLib.HTMLElement = js.native
  /**
  	 * Makes element selectable
  	 * @param element Element to make selectable
  	 */
  def makeElementSelectable(element: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /**
  	 * Makes element unselectable
  	 * @param element Element to make unselectable
  	 */
  def makeElementUnselectable(element: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /**
  	 * Converts an array-like object (e.g. arguments or NodeList) to an array
  	 */
  def toArray(arrayLike: js.Any): js.Array[_] = js.native
  def wrapElement(element: stdLib.HTMLElement, wrapper: java.lang.String): stdLib.HTMLElement = js.native
  def wrapElement(element: stdLib.HTMLElement, wrapper: java.lang.String, attributes: js.Any): stdLib.HTMLElement = js.native
  /**
  	 * Wraps element with another element
  	 * @param element Element to wrap
  	 * @param wrapper Element to wrap with
  	 * @param [attributes] Attributes to set on a wrapper
  	 */
  def wrapElement(element: stdLib.HTMLElement, wrapper: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def wrapElement(element: stdLib.HTMLElement, wrapper: stdLib.HTMLElement, attributes: js.Any): stdLib.HTMLElement = js.native
}

