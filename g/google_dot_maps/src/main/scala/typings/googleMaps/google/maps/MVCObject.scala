package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class implementing KVO. <br><br>The <code>MVCObject</code> constructor
  * is guaranteed to be an empty function, and so you may inherit from
  * <code>MVCObject</code> by writing <code>MySubclass.prototype = new
  * google.maps.MVCObject();</code>. Unless otherwise noted, this is not true
  * of other classes in the API, and inheriting from other classes in the API
  * is not supported.
  */
@js.native
trait MVCObject extends StObject {
  
  /**
    * Adds the given listener function to the given event name. Returns an
    * identifier for this listener that can be used with
    * <code>google.maps.event.removeListener</code>.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
  
  /**
    * Binds a View to a Model.
    */
  def bindTo(key: String, target: MVCObject): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: String): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: String, noNotify: Boolean): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: Null, noNotify: Boolean): Unit = js.native
  def bindTo(key: String, target: MVCObject, targetKey: Unit, noNotify: Boolean): Unit = js.native
  
  /**
    * Gets a value.
    */
  def get(key: String): Any = js.native
  
  /**
    * Notify all observers of a change on this property. This notifies both
    * objects that are bound to the object&#39;s property as well as the object
    * that it is bound to.
    */
  def notify(key: String): Unit = js.native
  
  /**
    * Sets a value.
    */
  def set(key: String, value: Any): Unit = js.native
  
  /**
    * Sets a collection of key-value pairs.
    */
  def setValues(): Unit = js.native
  def setValues(values: js.Object): Unit = js.native
  
  /**
    * Removes a binding. Unbinding will set the unbound property to the current
    * value. The object will not be notified, as the value has not changed.
    */
  def unbind(key: String): Unit = js.native
  
  /**
    * Removes all bindings.
    */
  def unbindAll(): Unit = js.native
}
