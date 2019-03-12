package typings
package durandalLib.pluginsSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/serializer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var space: js.Any = js.native
  var typeAttribute: java.lang.String = js.native
  var typeMap: js.Any = js.native
  def clone[T](obj: T): T = js.native
  def clone[T](obj: T, settings: js.Object): T = js.native
  def deserialize[T](text: java.lang.String): T = js.native
  def deserialize[T](text: java.lang.String, settings: DeserializerOptions): T = js.native
  def getTypeId(`object`: js.Any): java.lang.String = js.native
  def registerType(typeId: java.lang.String, constructor: js.Function0[_]): scala.Unit = js.native
  def replacer(key: java.lang.String, value: js.Any): js.Any = js.native
  def reviver(
    key: java.lang.String,
    value: js.Any,
    getTypeId: js.Function1[/* value */ js.Any, java.lang.String],
    getConstructor: js.Function1[/* id */ java.lang.String, js.Function0[_]]
  ): js.Any = js.native
  def serialize(`object`: js.Any): java.lang.String = js.native
  def serialize(`object`: js.Any, settings: SerializerOptions): java.lang.String = js.native
  def serialize(`object`: js.Any, settings: java.lang.String): java.lang.String = js.native
  def serialize(`object`: js.Any, settings: scala.Double): java.lang.String = js.native
}

