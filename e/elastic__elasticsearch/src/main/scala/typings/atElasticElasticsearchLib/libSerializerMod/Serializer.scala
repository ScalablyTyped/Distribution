package typings
package atElasticElasticsearchLib.libSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(json: java.lang.String): js.Any
  def ndserialize(array: js.Array[_]): java.lang.String
  def qserialize(`object`: js.Any): java.lang.String
  def serialize(`object`: js.Any): java.lang.String
}

object Serializer {
  @scala.inline
  def apply(
    deserialize: java.lang.String => js.Any,
    ndserialize: js.Array[_] => java.lang.String,
    qserialize: js.Any => java.lang.String,
    serialize: js.Any => java.lang.String
  ): Serializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), ndserialize = js.Any.fromFunction1(ndserialize), qserialize = js.Any.fromFunction1(qserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Serializer]
  }
}

