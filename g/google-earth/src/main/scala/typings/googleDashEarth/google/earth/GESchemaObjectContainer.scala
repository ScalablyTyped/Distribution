package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GESchemaObjectContainer")
@js.native
class GESchemaObjectContainer[T /* <: KmlObject */] () extends js.Object {
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  def appendChild(`object`: T): Unit = js.native
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  def getChildNodes(): KmlObjectList[T] = js.native
  /**
    * First child in the list of objects.
    */
  def getFirstChild(): T = js.native
  /**
    * Last child in the list of objects.
    */
  def getLastChild(): T = js.native
  /**
    * Returns true if the container is not empty.
    */
  def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  def insertBefore(newChild: T, refChild: T): Unit = js.native
  /**
    * Removes a node from the list of children of a specified object.
    */
  def removeChild(oldChild: T): Unit = js.native
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  def replaceChild(newChild: T, oldChild: T): Unit = js.native
}

