package typings.googleapisCommon.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schemas extends js.Object {
  var discoveryVersion: String = js.native
  var items: js.Array[Schema] = js.native
  var kind: String = js.native
}

object Schemas {
  @scala.inline
  def apply(discoveryVersion: String, items: js.Array[Schema], kind: String): Schemas = {
    val __obj = js.Dynamic.literal(discoveryVersion = discoveryVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schemas]
  }
  @scala.inline
  implicit class SchemasOps[Self <: Schemas] (val x: Self) extends AnyVal {
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
    def setDiscoveryVersion(value: String): Self = this.set("discoveryVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Schema*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Schema]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

