package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Preferences extends StObject {
  
  def add(name: String, defaultValue: Any): Boolean = js.native
  def add(name: String, defaultValue: Any, tags: String): Boolean = js.native
  def add(name: String, defaultValue: Any, tags: js.Array[String]): Boolean = js.native
  
  def addListeners(name: String, onChangedCallback: js.Function0[Unit], onResetCallback: js.Function0[Unit]): Unit = js.native
  
  def addPref(name: String, defaultValue: Any): Unit = js.native
  
  def clearWebStorage(): Unit = js.native
  
  def deleteFromWebStorage(name: String): Unit = js.native
  
  def get(name: String): Any = js.native
  
  def hasTag(name: String, tag: String): Boolean = js.native
  
  def isLocalStorageSupported(): Boolean = js.native
  
  def load(defaultValues: js.Object): Unit = js.native
  
  def remove(name: String): Boolean = js.native
  def remove(name: String, removeFromWebStorage: Boolean): Boolean = js.native
  
  def removeListeners(name: String): Unit = js.native
  
  def reset(): Unit = js.native
  def reset(tag: String): Unit = js.native
  def reset(tag: String, include: Boolean): Unit = js.native
  def reset(tag: Unit, include: Boolean): Unit = js.native
  
  def set(name: String, value: Any): Boolean = js.native
  def set(name: String, value: Any, notify: Boolean): Boolean = js.native
  
  def setUseLocalStorage(useIt: Boolean): Unit = js.native
  
  def tag(tag: String): Unit = js.native
  def tag(tag: String, names: String): Unit = js.native
  def tag(tag: String, names: js.Array[String]): Unit = js.native
  
  def untag(tag: String): Unit = js.native
  def untag(tag: String, names: String): Unit = js.native
  def untag(tag: String, names: js.Array[String]): Unit = js.native
  
  def webStorage(name: String, value: Any): Any = js.native
}
