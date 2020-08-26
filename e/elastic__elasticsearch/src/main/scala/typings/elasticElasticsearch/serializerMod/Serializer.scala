package typings.elasticElasticsearch.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends js.Object {
  def deserialize(json: String): js.Any = js.native
  def ndserialize(array: js.Array[_]): String = js.native
  def qserialize(`object`: js.Any): String = js.native
  def serialize(`object`: js.Any): String = js.native
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
  @scala.inline
  implicit class SerializerOps[Self <: Serializer] (val x: Self) extends AnyVal {
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
    def setDeserialize(value: String => js.Any): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setNdserialize(value: js.Array[_] => String): Self = this.set("ndserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setQserialize(value: js.Any => String): Self = this.set("qserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: js.Any => String): Self = this.set("serialize", js.Any.fromFunction1(value))
  }
  
}

