package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEWindow")
@js.native
class GEWindow ()
  extends typings.googleEarth.google.earth.GEWindow {
  /**
    * Removes focus from the Google Earth object.
    */
  /* CompleteClass */
  override def blur(): Unit = js.native
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def dblclick(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Gives the Google Earth object focus.
    */
  /* CompleteClass */
  override def focus(): Unit = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  /* CompleteClass */
  override def getVisibility(): Boolean = js.native
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mousedown(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  /* CompleteClass */
  override def mousemove(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  /* CompleteClass */
  override def mouseout(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseover(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseup(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  /* CompleteClass */
  override def setVisibility(visibility: Boolean): Unit = js.native
}

