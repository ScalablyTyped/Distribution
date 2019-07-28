package typings.durandal.pluginsSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/serializer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var space: js.Any = js.native
  var typeAttribute: String = js.native
  var typeMap: js.Any = js.native
  def clone[T](obj: T): T = js.native
  def clone[T](obj: T, settings: js.Object): T = js.native
  def deserialize[T](text: String): T = js.native
  def deserialize[T](text: String, settings: DeserializerOptions): T = js.native
  def getTypeId(`object`: js.Any): String = js.native
  def registerType(typeId: String, constructor: js.Function0[_]): Unit = js.native
  def replacer(key: String, value: js.Any): js.Any = js.native
  def reviver(
    key: String,
    value: js.Any,
    getTypeId: js.Function1[/* value */ js.Any, String],
    getConstructor: js.Function1[/* id */ String, js.Function0[_]]
  ): js.Any = js.native
  def serialize(`object`: js.Any): String = js.native
  def serialize(`object`: js.Any, settings: String): String = js.native
  def serialize(`object`: js.Any, settings: Double): String = js.native
  def serialize(`object`: js.Any, settings: SerializerOptions): String = js.native
}

