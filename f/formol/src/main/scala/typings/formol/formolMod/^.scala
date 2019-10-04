package typings.formol.formolMod

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formol", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Conditional: ComponentType[ConditionalProps[js.Any]] = js.native
  val Field: ComponentType[FieldProps[js.Any]] = js.native
  val FieldSet: ComponentType[FieldSetProps[js.Any]] = js.native
  val Inliner: ComponentType[js.Object] = js.native
  val NoRequestNeeded: Error = js.native
  val SwitchButton: ComponentType[SwitchButtonProps] = js.native
  val default: ComponentType[FormolProps[js.Any]] = js.native
  def ConditionalContextWrapper(e: Component[_, js.Object, _]): Component[_, js.Object, _] = js.native
  def FormolContextWrapper(WrappedComponent: Component[_, js.Object, _]): Component[_, js.Object, _] = js.native
  def choicesAdapter(WrappedComponent: Component[_, js.Object, _]): Component[_, js.Object, _] = js.native
  def copy(o: js.Any, names: js.Array[String]): js.Any = js.native
  def diff(newItem: js.Any, oldItem: js.Any, names: js.Array[String]): js.Any = js.native
  def emptyStringToNull(v: String): String | Null = js.native
  def fieldPropsAdapter(v: js.Any): js.Any = js.native
  def get(data: js.Any, key: String): js.Any = js.native
  def insert(transientItem: js.Any, name: String, value: js.Any, names: js.Array[String]): js.Any = js.native
  def isModified(newItem: js.Any, oldItem: js.Any, names: js.Array[String]): Boolean = js.native
  def memoizedChoices(WrappedComponent: Component[_, js.Object, _]): Component[_, js.Object, _] = js.native
  def multipleAdapter(WrappedComponent: Component[_, js.Object, _]): Component[_, js.Object, _] = js.native
  def nullishToEmptyString(): String = js.native
  def nullishToEmptyString(v: String): String = js.native
  def set(data: js.Any, key: String, value: js.Any): js.Any = js.native
  def set(data: js.Any, key: String, value: js.Any, noArray: Boolean): js.Any = js.native
  def unrest(e: js.Any, args: js.Any*): js.Any = js.native
}

