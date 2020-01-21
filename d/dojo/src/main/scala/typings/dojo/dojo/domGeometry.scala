package typings.dojo.dojo

import typings.dojo.AnonH
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-geometry.html
  *
  * This module defines the core dojo DOM geometry API.
  *
  */
@js.native
trait domGeometry extends js.Object {
  /**
    *
    */
  var boxModel: String = js.native
  /**
    * Returns an object with {node, x, y} with corresponding offsets.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def docScroll(): js.Object = js.native
  def docScroll(doc: HTMLDocument): js.Object = js.native
  /**
    * In RTL direction, scrollLeft should be a negative value, but IE
    * returns a positive one. All codes using documentElement.scrollLeft
    * must call this function to fix this error, otherwise the position
    * will offset to right when there is a horizontal scrollbar.
    *
    * @param scrollLeft
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def fixIeBiDiScrollLeft(scrollLeft: Double): Double = js.native
  def fixIeBiDiScrollLeft(scrollLeft: Double, doc: HTMLDocument): Double = js.native
  /**
    * returns an object with properties useful for noting the border
    * dimensions.
    * l/t/r/b = the sum of left/top/right/bottom border (respectively)
    * w = the sum of the left and right border
    * h = the sum of the top and bottom border
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getBorderExtents(node: HTMLElement): js.Object = js.native
  def getBorderExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns an object that encodes the width, height, left and top
    * positions of the node's content box, irrespective of the
    * current box model.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getContentBox(node: HTMLElement): js.Object = js.native
  def getContentBox(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns the offset in x and y from the document body to the
    * visual edge of the page for IE
    * The following values in IE contain an offset:
    *
    * event.clientX
    * event.clientY
    * node.getBoundingClientRect().left
    * node.getBoundingClientRect().top
    * But other position related values do not contain this offset,
    *
    * such as node.offsetLeft, node.offsetTop, node.style.left and
    * node.style.top. The offset is always (2, 2) in LTR direction.
    * When the body is in RTL direction, the offset counts the width
    * of left scroll bar's width.  This function computes the actual
    * offset.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def getIeDocumentElementOffset(): js.Object = js.native
  def getIeDocumentElementOffset(doc: HTMLDocument): js.Object = js.native
  /**
    * returns an object that encodes the width, height, left and top
    * positions of the node's margin box.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginBox(node: HTMLElement): js.Object = js.native
  def getMarginBox(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns object with properties useful for box fitting with
    * regards to box margins (i.e., the outer-box).
    *
    * l/t = marginLeft, marginTop, respectively
    * w = total width, margin inclusive
    * h = total height, margin inclusive
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginExtents(node: HTMLElement): js.Object = js.native
  def getMarginExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * returns an object that encodes the width and height of
    * the node's margin box
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginSize(node: String): js.Object = js.native
  def getMarginSize(node: String, computedStyle: js.Object): js.Object = js.native
  /**
    * returns an object that encodes the width and height of
    * the node's margin box
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getMarginSize(node: HTMLElement): js.Object = js.native
  def getMarginSize(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns object with properties useful for box fitting with
    * regards to padding.
    * l/t/r/b = the sum of left/top/right/bottom padding and left/top/right/bottom border (respectively)
    * w = the sum of the left and right padding and border
    * h = the sum of the top and bottom padding and border
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getPadBorderExtents(node: HTMLElement): js.Object = js.native
  def getPadBorderExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns object with special values specifically useful for node
    * fitting.
    * Returns an object with w, h, l, t properties:
    *
    * l/t/r/b = left/top/right/bottom padding (respectively)
    * w = the total of the left and right padding
    * h = the total of the top and bottom padding
    * If 'node' has position, l/t forms the origin for child nodes.
    *
    * The w/h are used for calculating boxes.
    * Normally application code will not need to invoke this
    * directly, and will use the ...box... functions instead.
    *
    * @param node
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def getPadExtents(node: HTMLElement): js.Object = js.native
  def getPadExtents(node: HTMLElement, computedStyle: js.Object): js.Object = js.native
  /**
    * Returns true if the current language is left-to-right, and false otherwise.
    *
    * @param doc               OptionalOptional document to query.   If unspecified, use win.doc.
    */
  def isBodyLtr(): Boolean = js.native
  def isBodyLtr(doc: HTMLDocument): Boolean = js.native
  /**
    * Normalizes the geometry of a DOM event, normalizing the pageX, pageY,
    * offsetX, offsetY, layerX, and layerX properties
    *
    * @param event
    */
  def normalizeEvent(event: js.Object): Unit = js.native
  /**
    * Gets the position and size of the passed element relative to
    * the viewport (if includeScroll==false), or relative to the
    * document root (if includeScroll==true).
    * Returns an object of the form:
    * { x: 100, y: 300, w: 20, h: 15 }.
    * If includeScroll==true, the x and y values will include any
    * document offsets that may affect the position relative to the
    * viewport.
    * Uses the border-box model (inclusive of border and padding but
    * not margin).  Does not act as a setter.
    *
    * @param node
    * @param includeScroll               Optional
    */
  def position(node: String): AnonH = js.native
  def position(node: String, includeScroll: Boolean): AnonH = js.native
  /**
    * Gets the position and size of the passed element relative to
    * the viewport (if includeScroll==false), or relative to the
    * document root (if includeScroll==true).
    * Returns an object of the form:
    * { x: 100, y: 300, w: 20, h: 15 }.
    * If includeScroll==true, the x and y values will include any
    * document offsets that may affect the position relative to the
    * viewport.
    * Uses the border-box model (inclusive of border and padding but
    * not margin).  Does not act as a setter.
    *
    * @param node
    * @param includeScroll               Optional
    */
  def position(node: HTMLElement): AnonH = js.native
  def position(node: HTMLElement, includeScroll: Boolean): AnonH = js.native
  /**
    * Sets the size of the node's contents, irrespective of margins,
    * padding, or borders.
    *
    * @param node
    * @param box hash with optional "w", and "h" properties for "width", and "height"respectively. All specified properties should have numeric values in whole pixels.
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def setContentSize(node: HTMLElement, box: js.Object): Unit = js.native
  def setContentSize(node: HTMLElement, box: js.Object, computedStyle: js.Object): Unit = js.native
  /**
    * sets the size of the node's margin box and placement
    * (left/top), irrespective of box model. Think of it as a
    * passthrough to setBox that handles box-model vagaries for
    * you.
    *
    * @param node
    * @param box hash with optional "l", "t", "w", and "h" properties for "left", "right", "width", and "height"respectively. All specified properties should have numeric values in whole pixels.
    * @param computedStyle               OptionalThis parameter accepts computed styles object.If this parameter is omitted, the functions will calldojo/dom-style.getComputedStyle to get one. It is a better way, callingdojo/dom-style.getComputedStyle once, and then pass the reference to thiscomputedStyle parameter. Wherever possible, reuse the returnedobject of dojo/dom-style.getComputedStyle().
    */
  def setMarginBox(node: HTMLElement, box: js.Object): Unit = js.native
  def setMarginBox(node: HTMLElement, box: js.Object, computedStyle: js.Object): Unit = js.native
}

