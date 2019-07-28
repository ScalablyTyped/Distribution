package typings.atElasticElasticsearch.libSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(json: String): js.Any
  def ndserialize(array: js.Array[_]): String
  def qserialize(`object`: js.Any): String
  def serialize(`object`: js.Any): String
}

object Serializer {
  @scala.inline
  def apply(
    deserialize: String => js.Any,
    ndserialize: js.Array[_] => String,
    qserialize: js.Any => String,
    serialize: js.Any => String
  ): Serializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), ndserialize = js.Any.fromFunction1(ndserialize), qserialize = js.Any.fromFunction1(qserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[Serializer]
  }
}

