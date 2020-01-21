package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): IterableIteratorShim[java.lang.String] = js.native
  /**
    * Returns an <a> HTML anchor element and sets the name attribute to the text value
    * @param name
    */
  def anchor(name: java.lang.String): java.lang.String = js.native
  /** Returns a <big> HTML element */
  def big(): java.lang.String = js.native
  /** Returns a <blink> HTML element */
  def blink(): java.lang.String = js.native
  /** Returns a <b> HTML element */
  def bold(): java.lang.String = js.native
  /**
    * Returns a nonnegative integer Number less than 1114112 (0x110000) that is the code point
    * value of the UTF-16 encoded code point starting at the string element at position pos in
    * the String resulting from converting this object to a String.
    * If there is no element at that position, the result is undefined.
    * If a valid UTF-16 surrogate pair does not begin at pos, the result is the code unit at pos.
    */
  def codePointAt(pos: Double): Double = js.native
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * endPosition – length(this). Otherwise returns false.
    */
  def endsWith(searchString: java.lang.String): Boolean = js.native
  def endsWith(searchString: java.lang.String, endPosition: Double): Boolean = js.native
  /** Returns a <tt> HTML element */
  def fixed(): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the color attribute value */
  def fontcolor(color: java.lang.String): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the size attribute value */
  def fontsize(size: java.lang.String): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the size attribute value */
  def fontsize(size: Double): java.lang.String = js.native
  /**
    * Returns true if searchString appears as a substring of the result of converting this
    * object to a String, at one or more positions that are
    * greater than or equal to position; otherwise, returns false.
    * @param searchString search string
    * @param position If position is undefined, 0 is assumed, so as to search all of the String.
    */
  def includes(searchString: java.lang.String): Boolean = js.native
  def includes(searchString: java.lang.String, position: Double): Boolean = js.native
  /** Returns an <i> HTML element */
  def italics(): java.lang.String = js.native
  /** Returns an <a> HTML element and sets the href attribute value */
  def link(url: java.lang.String): java.lang.String = js.native
  /**
    * Returns a String value that is made from count copies appended together. If count is 0,
    * T is the empty String is returned.
    * @param count number of copies to append
    */
  def repeat(count: Double): java.lang.String = js.native
  /** Returns a <small> HTML element */
  def small(): java.lang.String = js.native
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * position. Otherwise returns false.
    */
  def startsWith(searchString: java.lang.String): Boolean = js.native
  def startsWith(searchString: java.lang.String, position: Double): Boolean = js.native
  /** Returns a <strike> HTML element */
  def strike(): java.lang.String = js.native
  /** Returns a <sub> HTML element */
  def sub(): java.lang.String = js.native
  /** Returns a <sup> HTML element */
  def sup(): java.lang.String = js.native
}

