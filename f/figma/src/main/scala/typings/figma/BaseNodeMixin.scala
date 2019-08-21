package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Mixins
trait BaseNodeMixin extends js.Object {
  val id: String
  var name: String
  val parent: (BaseNode with ChildrenMixin) | Null
   // Note: setting this also sets \`autoRename\` to false on TextNodes
  val removed: Boolean
  def getPluginData(key: String): String
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String
  def remove(): Unit
  def setPluginData(key: String, value: String): Unit
  def setSharedPluginData(namespace: String, key: String, value: String): Unit
}

object BaseNodeMixin {
  @scala.inline
  def apply(
    getPluginData: String => String,
    getSharedPluginData: (String, String) => String,
    id: String,
    name: String,
    remove: () => Unit,
    removed: Boolean,
    setPluginData: (String, String) => Unit,
    setSharedPluginData: (String, String, String) => Unit,
    toString: () => String,
    parent: BaseNode with ChildrenMixin = null
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(getPluginData = js.Any.fromFunction1(getPluginData), getSharedPluginData = js.Any.fromFunction2(getSharedPluginData), id = id, name = name, remove = js.Any.fromFunction0(remove), removed = removed, setPluginData = js.Any.fromFunction2(setPluginData), setSharedPluginData = js.Any.fromFunction3(setSharedPluginData), toString = js.Any.fromFunction0(toString))
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[BaseNodeMixin]
  }
}

