package typings.dojo.dijit

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/a11y.html
  *
  * Accessibility utility functions (keyboard, tab stops, etc.)
  * 
  */
@js.native
trait a11y extends js.Object {
  /**
    * Returns effective tabIndex of an element, either a number, or undefined if element isn't focusable.
    * 
    * @param elem             
    */
  def effectiveTabIndex(elem: HTMLElement): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is first in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getFirstInTabbingOrder(root: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is first in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getFirstInTabbingOrder(root: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is last in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getLastInTabbingOrder(root: String, doc: HTMLDocument): js.Any = js.native
  /**
    * Finds the descendant of the specified root node
    * that is last in the tabbing order
    * 
    * @param root             
    * @param doc               Optional            
    */
  def getLastInTabbingOrder(root: HTMLElement, doc: HTMLDocument): js.Any = js.native
  /**
    * Tests if element is tab-navigable even without an explicit tabIndex setting
    * 
    * @param elem             
    */
  def hasDefaultTabStop(elem: HTMLElement): js.Any = js.native
  /**
    * Tests if an element is focusable by tabbing to it, or clicking it with the mouse.
    * 
    * @param elem             
    */
  def isFocusable(elem: HTMLElement): Boolean = js.native
  /**
    * Tests if an element is tab-navigable
    * 
    * @param elem             
    */
  def isTabNavigable(elem: HTMLElement): Boolean = js.native
}

