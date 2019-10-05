package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-style.html
  *
  * This module defines the core dojo DOM style API.
  *
  */
@js.native
trait dom_style extends js.Object {
  /**
    *
    * @param node
    * @param name
    */
  def get(node: String, name: String): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    */
  def get(node: String, name: js.Object): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    */
  def get(node: HTMLElement, name: String): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    */
  def get(node: HTMLElement, name: js.Object): js.Any = js.native
  /**
    * Returns a "computed style" object.
    * Gets a "computed style" object which can be used to gather
    * information about the current state of the rendered node.
    *
    * Note that this may behave differently on different browsers.
    * Values may have different formats and value encodings across
    * browsers.
    *
    * Note also that this method is expensive.  Wherever possible,
    * reuse the returned object.
    *
    * Use the dojo/dom-style.get() method for more consistent (pixelized)
    * return values.
    *
    * @param node A reference to a DOM node. Does NOT support taking anID string for speed reasons.
    */
  def getComputedStyle(node: HTMLElement): Unit = js.native
  /**
    *
    * @param node
    * @param name
    * @param value               Optional
    */
  def set(node: String, name: String): js.Any = js.native
  def set(node: String, name: String, value: String): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    * @param value               Optional
    */
  def set(node: String, name: js.Object): js.Any = js.native
  def set(node: String, name: js.Object, value: String): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    * @param value               Optional
    */
  def set(node: HTMLElement, name: String): js.Any = js.native
  def set(node: HTMLElement, name: String, value: String): js.Any = js.native
  /**
    *
    * @param node
    * @param name
    * @param value               Optional
    */
  def set(node: HTMLElement, name: js.Object): js.Any = js.native
  def set(node: HTMLElement, name: js.Object, value: String): js.Any = js.native
  /**
    * converts style value to pixels on IE or return a numeric value.
    *
    * @param node
    * @param value
    */
  def toPixelValue(node: HTMLElement, value: String): Double = js.native
}

