package typings.ecmarkup.biblioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiblioEntryBase extends js.Object {
  var aoid: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var clauseId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var number: js.UndefOr[String | Double] = js.native
  var refId: js.UndefOr[String] = js.native
  var referencingIds: js.Array[String] = js.native
  var term: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object BiblioEntryBase {
  @scala.inline
  def apply(referencingIds: js.Array[String], `type`: String): BiblioEntryBase = {
    val __obj = js.Dynamic.literal(referencingIds = referencingIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiblioEntryBase]
  }
  @scala.inline
  implicit class BiblioEntryBaseOps[Self <: BiblioEntryBase] (val x: Self) extends AnyVal {
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
    def setReferencingIdsVarargs(value: String*): Self = this.set("referencingIds", js.Array(value :_*))
    @scala.inline
    def setReferencingIds(value: js.Array[String]): Self = this.set("referencingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAoid(value: String): Self = this.set("aoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAoid: Self = this.set("aoid", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setClauseId(value: String): Self = this.set("clauseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClauseId: Self = this.set("clauseId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setNumber(value: String | Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

