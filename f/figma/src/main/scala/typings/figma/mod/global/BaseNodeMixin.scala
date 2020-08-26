package typings.figma.mod.global

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Mixins
@js.native
trait BaseNodeMixin extends js.Object {
  val id: String = js.native
  var name: String = js.native
  val parent: (BaseNode with ChildrenMixin) | Null = js.native
   // Note: setting this also sets `autoRename` to false on TextNodes
  val removed: Boolean = js.native
  def getPluginData(key: String): String = js.native
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String = js.native
  def remove(): Unit = js.native
  def setPluginData(key: String, value: String): Unit = js.native
  def setRelaunchData(data: StringDictionary[/* description */ String]): Unit = js.native
  def setSharedPluginData(namespace: String, key: String, value: String): Unit = js.native
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
    setRelaunchData: StringDictionary[/* description */ String] => Unit,
    setSharedPluginData: (String, String, String) => Unit
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(getPluginData = js.Any.fromFunction1(getPluginData), getSharedPluginData = js.Any.fromFunction2(getSharedPluginData), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], setPluginData = js.Any.fromFunction2(setPluginData), setRelaunchData = js.Any.fromFunction1(setRelaunchData), setSharedPluginData = js.Any.fromFunction3(setSharedPluginData))
    __obj.asInstanceOf[BaseNodeMixin]
  }
  @scala.inline
  implicit class BaseNodeMixinOps[Self <: BaseNodeMixin] (val x: Self) extends AnyVal {
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
    def setGetPluginData(value: String => String): Self = this.set("getPluginData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSharedPluginData(value: (String, String) => String): Self = this.set("getSharedPluginData", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPluginData(value: (String, String) => Unit): Self = this.set("setPluginData", js.Any.fromFunction2(value))
    @scala.inline
    def setSetRelaunchData(value: StringDictionary[/* description */ String] => Unit): Self = this.set("setRelaunchData", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSharedPluginData(value: (String, String, String) => Unit): Self = this.set("setSharedPluginData", js.Any.fromFunction3(value))
    @scala.inline
    def setParent(value: BaseNode with ChildrenMixin): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

