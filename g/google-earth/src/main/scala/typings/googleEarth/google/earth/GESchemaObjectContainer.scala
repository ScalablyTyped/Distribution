package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GESchemaObjectContainer[T /* <: KmlObject */] extends StObject {
  
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  def appendChild(`object`: T): Unit
  
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  def getChildNodes(): KmlObjectList[T]
  
  /**
    * First child in the list of objects.
    */
  def getFirstChild(): T
  
  /**
    * Last child in the list of objects.
    */
  def getLastChild(): T
  
  /**
    * Returns true if the container is not empty.
    */
  def hasChildNodes(): Boolean
  
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  def insertBefore(newChild: T, refChild: T): Unit
  
  /**
    * Removes a node from the list of children of a specified object.
    */
  def removeChild(oldChild: T): Unit
  
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  def replaceChild(newChild: T, oldChild: T): Unit
}
object GESchemaObjectContainer {
  
  @scala.inline
  def apply[T /* <: KmlObject */](
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
  implicit class GESchemaObjectContainerMutableBuilder[Self <: GESchemaObjectContainer[?], T /* <: KmlObject */] (val x: Self & GESchemaObjectContainer[T]) extends AnyVal {
    
    @scala.inline
    def setAppendChild(value: T => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildNodes(value: () => KmlObjectList[T]): Self = StObject.set(x, "getChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstChild(value: () => T): Self = StObject.set(x, "getFirstChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastChild(value: () => T): Self = StObject.set(x, "getLastChild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertBefore(value: (T, T) => Unit): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveChild(value: T => Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceChild(value: (T, T) => Unit): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
  }
}
