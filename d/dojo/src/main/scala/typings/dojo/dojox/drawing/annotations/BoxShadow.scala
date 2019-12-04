package typings.dojo.dojox.drawing.annotations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/annotations/BoxShadow.html
  *
  * Creates a box shadow under solid objects. Can change the
  * shadow direction, color, size, and intensity. Can center
  * the shadow and make it a Glow.
  * This is a pseudo shadow, created by duplicating the
  * original stencil and increasing the line weight while
  * reducing the opacity. Therefore it will not work with
  * text. Also won't look very good if the Stencil has no
  * fill or is transparent. Can't do knockouts or inner
  * shadows. Currently can't do paths - while doable, it
  * will most likely choke IE into certain death.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.annotations.BoxShadow")
@js.native
class BoxShadow protected () extends js.Object {
  def this(options: js.Object) = this()
  /**
    *
    */
  var showing: Boolean = js.native
  /**
    * Creates data used to draw arrow head.
    *
    */
  def arrowPoints(): js.Array[_] = js.native
  /**
    *
    * @param o
    * @param size
    * @param mult
    * @param d
    * @param r
    * @param p
    * @param c
    */
  def createForEllipse(o: js.Any, size: js.Any, mult: js.Any, d: js.Any, r: js.Any, p: js.Any, c: js.Any): Unit = js.native
  /**
    *
    * @param o
    * @param size
    * @param mult
    * @param d
    * @param r
    * @param p
    * @param c
    */
  def createForLine(o: js.Any, size: js.Any, mult: js.Any, d: js.Any, r: js.Any, p: js.Any, c: js.Any): Unit = js.native
  /**
    *
    * @param o
    * @param size
    * @param mult
    * @param pts
    * @param r
    * @param p
    * @param c
    */
  def createForPath(o: js.Any, size: js.Any, mult: js.Any, pts: js.Any, r: js.Any, p: js.Any, c: js.Any): Unit = js.native
  /**
    *
    * @param o
    * @param size
    * @param mult
    * @param d
    * @param r
    * @param p
    * @param c
    */
  def createForRect(o: js.Any, size: js.Any, mult: js.Any, d: js.Any, r: js.Any, p: js.Any, c: js.Any): Unit = js.native
  /**
    *
    * @param o
    * @param size
    * @param mult
    * @param pts
    * @param r
    * @param p
    * @param c
    */
  def createForZArrow(o: js.Any, size: js.Any, mult: js.Any, pts: js.Any, r: js.Any, p: js.Any, c: js.Any): Unit = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    */
  def hide(): Unit = js.native
  /**
    *
    */
  def onRender(): Unit = js.native
  /**
    *
    */
  def onTransform(): Unit = js.native
  /**
    *
    */
  def render(): Unit = js.native
  /**
    *
    */
  def show(): Unit = js.native
}

