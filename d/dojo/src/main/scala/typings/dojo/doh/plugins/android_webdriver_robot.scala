package typings.dojo.doh.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/doh/plugins/android-webdriver-robot.html
  *
  *
  */
@js.native
trait android_webdriver_robot extends js.Object {
  /**
    *
    * @param sec
    * @param charCode
    * @param keyCode
    * @param delay
    */
  def downKey(sec: js.Any, charCode: js.Any, keyCode: js.Any, delay: js.Any): Unit = js.native
  /**
    *
    * @param sec
    * @param x
    * @param y
    * @param delay
    * @param duration
    */
  def moveMouse(sec: js.Any, x: js.Any, y: js.Any, delay: js.Any, duration: js.Any): Unit = js.native
  /**
    *
    * @param sec
    * @param left
    * @param middle
    * @param right
    * @param delay
    */
  def pressMouse(sec: js.Any, left: js.Any, middle: js.Any, right: js.Any, delay: js.Any): Unit = js.native
  /**
    *
    * @param sec
    * @param left
    * @param middle
    * @param right
    * @param delay
    */
  def releaseMouse(sec: js.Any, left: js.Any, middle: js.Any, right: js.Any, delay: js.Any): Unit = js.native
  /**
    *
    * @param sec
    * @param docScreenX
    * @param docScreenY
    * @param width
    * @param height
    */
  def setDocumentBounds(sec: js.Any, docScreenX: js.Any, docScreenY: js.Any, width: js.Any, height: js.Any): Unit = js.native
  /**
    *
    * @param sec
    * @param charCode
    * @param keyCode
    * @param alt
    * @param ctrl
    * @param shift
    * @param meta
    * @param delay
    * @param async
    */
  def typeKey(
    sec: js.Any,
    charCode: js.Any,
    keyCode: js.Any,
    alt: js.Any,
    ctrl: js.Any,
    shift: js.Any,
    meta: js.Any,
    delay: js.Any,
    async: js.Any
  ): Unit = js.native
  /**
    *
    * @param chars
    * @param delay
    * @param duration
    */
  def typeKeys(chars: String, delay: Double, duration: Double): Unit = js.native
  /**
    *
    * @param chars
    * @param delay
    * @param duration
    */
  def typeKeys(chars: Double, delay: Double, duration: Double): Unit = js.native
  /**
    *
    * @param sec
    * @param charCode
    * @param keyCode
    * @param delay
    */
  def upKey(sec: js.Any, charCode: js.Any, keyCode: js.Any, delay: js.Any): Unit = js.native
}

