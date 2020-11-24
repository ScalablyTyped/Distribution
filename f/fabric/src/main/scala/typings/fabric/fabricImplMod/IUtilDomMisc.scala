package typings.fabric.fabricImplMod

import typings.fabric.anon.LeftTop
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilDomMisc extends js.Object {
  
  /**
    * Adds class to an element
    * @param element Element to add class to
    * @param className Class to add to an element
    */
  def addClass(element: HTMLElement, classname: String): Unit = js.native
  
  /**
    * Takes id and returns an element with that id (if one exists in a document)
    */
  def getById(id: String): HTMLElement = js.native
  def getById(id: HTMLElement): HTMLElement = js.native
  
  /**
    * Returns offset for a given element
    * @param element Element to get offset for
    */
  def getElementOffset(element: HTMLElement): LeftTop = js.native
  
  /**
    * Returns style attribute value of a given element
    * @param element Element to get style attribute for
    * @param attr Style attribute to get for element
    */
  def getElementStyle(elment: HTMLElement, attr: String): String = js.native
  
  /**
    * Inserts a script element with a given url into a document; invokes callback, when that script is finished loading
    * @param url URL of a script to load
    * @param callback Callback to execute when script is finished loading
    */
  def getScript(url: String, callback: js.Function): Unit = js.native
  
  /**
    * Returns element scroll offsets
    * @param element Element to operate on
    */
  def getScrollLeftTop(element: HTMLElement): LeftTop = js.native
  
  /**
    * Creates specified element with specified attributes
    * @param tagName Type of an element to create
    * @param [attributes] Attributes to set on an element
    * @return Newly created element
    */
  def makeElement(tagName: String): HTMLElement = js.native
  def makeElement(tagName: String, attributes: js.Any): HTMLElement = js.native
  
  /**
    * Makes element selectable
    * @param element Element to make selectable
    */
  def makeElementSelectable(element: HTMLElement): HTMLElement = js.native
  
  /**
    * Makes element unselectable
    * @param element Element to make unselectable
    */
  def makeElementUnselectable(element: HTMLElement): HTMLElement = js.native
  
  /**
    * Converts an array-like object (e.g. arguments or NodeList) to an array
    */
  def toArray(arrayLike: js.Any): js.Array[_] = js.native
  
  def wrapElement(element: HTMLElement, wrapper: String): HTMLElement = js.native
  def wrapElement(element: HTMLElement, wrapper: String, attributes: js.Any): HTMLElement = js.native
  /**
    * Wraps element with another element
    * @param element Element to wrap
    * @param wrapper Element to wrap with
    * @param [attributes] Attributes to set on a wrapper
    */
  def wrapElement(element: HTMLElement, wrapper: HTMLElement): HTMLElement = js.native
  def wrapElement(element: HTMLElement, wrapper: HTMLElement, attributes: js.Any): HTMLElement = js.native
}
