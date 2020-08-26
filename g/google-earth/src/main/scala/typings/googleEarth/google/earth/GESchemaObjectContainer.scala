package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GESchemaObjectContainer[T /* <: KmlObject */] extends js.Object {
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

object GESchemaObjectContainer {
  @scala.inline
  def apply[/* <: typings.googleEarth.google.earth.KmlObject */ T](
    appendChild: T => Unit,
    getChildNodes: () => KmlObjectList[T],
    getFirstChild: () => T,
    getLastChild: () => T,
    hasChildNodes: () => Boolean,
    insertBefore: (T, T) => Unit,
    removeChild: T => Unit,
    replaceChild: (T, T) => Unit
  ): GESchemaObjectContainer[T] = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), getChildNodes = js.Any.fromFunction0(getChildNodes), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild))
    __obj.asInstanceOf[GESchemaObjectContainer[T]]
  }
  @scala.inline
  implicit class GESchemaObjectContainerOps[Self <: GESchemaObjectContainer[_], /* <: typings.googleEarth.google.earth.KmlObject */ T] (val x: Self with GESchemaObjectContainer[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendChild(value: T => Unit): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildNodes(value: () => KmlObjectList[T]): Self = this.set("getChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFirstChild(value: () => T): Self = this.set("getFirstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastChild(value: () => T): Self = this.set("getLastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertBefore(value: (T, T) => Unit): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveChild(value: T => Unit): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceChild(value: (T, T) => Unit): Self = this.set("replaceChild", js.Any.fromFunction2(value))
  }
  
}

