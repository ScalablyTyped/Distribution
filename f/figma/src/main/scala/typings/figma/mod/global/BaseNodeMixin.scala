package typings.figma.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////////////////////
// Mixins
trait BaseNodeMixin extends StObject {
  
  def getPluginData(key: String): String
  
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String
  
  val id: String
  
  var name: String
  
  val parent: (BaseNode & ChildrenMixin) | Null
  
  def remove(): Unit
  
  // Note: setting this also sets `autoRename` to false on TextNodes
  val removed: Boolean
  
  def setPluginData(key: String, value: String): Unit
  
  def setRelaunchData(data: StringDictionary[/* description */ String]): Unit
  
  def setSharedPluginData(namespace: String, key: String, value: String): Unit
}
object BaseNodeMixin {
  
  inline def apply(
    getPluginData: String => String,
    getSharedPluginData: (String, String) => String,
    id: String,
    name: String,
    remove: () => Unit,
    removed: Boolean,
    setPluginData: (String, String) => Unit,
    setRelaunchData: StringDictionary[/* description */ String] => Unit,
    setSharedPluginData: (String, String, String) => Unit
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(getPluginData = js.Any.fromFunction1(getPluginData), getSharedPluginData = js.Any.fromFunction2(getSharedPluginData), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], setPluginData = js.Any.fromFunction2(setPluginData), setRelaunchData = js.Any.fromFunction1(setRelaunchData), setSharedPluginData = js.Any.fromFunction3(setSharedPluginData), parent = null)
    __obj.asInstanceOf[BaseNodeMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseNodeMixin] (val x: Self) extends AnyVal {
    
    inline def setGetPluginData(value: String => String): Self = StObject.set(x, "getPluginData", js.Any.fromFunction1(value))
    
    inline def setGetSharedPluginData(value: (String, String) => String): Self = StObject.set(x, "getSharedPluginData", js.Any.fromFunction2(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BaseNode & ChildrenMixin): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setSetPluginData(value: (String, String) => Unit): Self = StObject.set(x, "setPluginData", js.Any.fromFunction2(value))
    
    inline def setSetRelaunchData(value: StringDictionary[/* description */ String] => Unit): Self = StObject.set(x, "setRelaunchData", js.Any.fromFunction1(value))
    
    inline def setSetSharedPluginData(value: (String, String, String) => Unit): Self = StObject.set(x, "setSharedPluginData", js.Any.fromFunction3(value))
  }
}
