package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResponse[T] extends js.Object {
  var _id: String = js.native
  var _index: String = js.native
  var _routing: js.UndefOr[String] = js.native
  var _source: T = js.native
  var _type: String = js.native
  var _version: Double = js.native
  var found: Boolean = js.native
}

object GetResponse {
  @scala.inline
  def apply[T](_id: String, _index: String, _source: T, _type: String, _version: Double, found: Boolean): GetResponse[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], _version = _version.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponse[T]]
  }
  @scala.inline
  implicit class GetResponseOps[Self <: GetResponse[_], T] (val x: Self with GetResponse[T]) extends AnyVal {
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def set_index(value: String): Self = this.set("_index", value.asInstanceOf[js.Any])
    @scala.inline
    def set_source(value: T): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def set_type(value: String): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_version(value: Double): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setFound(value: Boolean): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def set_routing(value: String): Self = this.set("_routing", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_routing: Self = this.set("_routing", js.undefined)
  }
  
}

