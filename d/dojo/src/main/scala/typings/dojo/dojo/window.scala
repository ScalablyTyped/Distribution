package typings.dojo.dojo

import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/window.html
  *
  * TODOC
  *
  */
@js.native
trait window extends js.Object {
  /**
    * Get window object associated with document doc.
    *
    * @param doc The document to get the associated window for.
    */
  def get(doc: HTMLDocument): js.Any = js.native
  /**
    * Returns the dimensions and scroll position of the viewable area of a browser window
    *
    * @param doc               Optional
    */
  def getBox(): js.Object = js.native
  def getBox(doc: HTMLDocument): js.Object = js.native
  /**
    * Scroll the passed node into view using minimal movement, if it is not already.
    *
    * @param node
    * @param pos               Optional
    */
  def scrollIntoView(node: HTMLElement, pos: js.Object): Unit = js.native
}

