package typings.googleCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatastoreKey extends js.Object {
  var id: js.UndefOr[String] = js.native
  var kind: String = js.native
  var name: js.UndefOr[String] = js.native
  var parent: js.UndefOr[DatastoreKey] = js.native
  val path: DatastoreKeyPath = js.native
}

object DatastoreKey {
  @scala.inline
  def apply(kind: String, path: DatastoreKeyPath): DatastoreKey = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreKey]
  }
  @scala.inline
  implicit class DatastoreKeyOps[Self <: DatastoreKey] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: PathElement*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: DatastoreKeyPath): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: DatastoreKey): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

