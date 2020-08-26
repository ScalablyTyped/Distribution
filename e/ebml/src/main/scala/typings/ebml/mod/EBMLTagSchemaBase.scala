package typings.ebml.mod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlibComma`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.informational_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBMLTagSchemaBase extends EBMLTagSchema {
  var cppname: js.UndefOr[String] = js.native
  var del: js.UndefOr[(js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)] = js.native
  var description: String = js.native
  var divx: js.UndefOr[Boolean] = js.native
  var i: js.UndefOr[String] = js.native
  var level: Double = js.native
  var mandatory: js.UndefOr[Boolean] = js.native
  var maxver: js.UndefOr[String] = js.native
  var minver: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var strong: js.UndefOr[informational_ | Informational] = js.native
  var `type`: TagType = js.native
  var webm: js.UndefOr[Boolean] = js.native
}

object EBMLTagSchemaBase {
  @scala.inline
  def apply(description: String, level: Double, name: String, `type`: TagType): EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLTagSchemaBase]
  }
  @scala.inline
  implicit class EBMLTagSchemaBaseOps[Self <: EBMLTagSchemaBase] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TagType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCppname(value: String): Self = this.set("cppname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCppname: Self = this.set("cppname", js.undefined)
    @scala.inline
    def setDel(value: (js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`)): Self = this.set("del", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDel: Self = this.set("del", js.undefined)
    @scala.inline
    def setDivx(value: Boolean): Self = this.set("divx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivx: Self = this.set("divx", js.undefined)
    @scala.inline
    def setI(value: String): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    @scala.inline
    def setMaxver(value: String): Self = this.set("maxver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxver: Self = this.set("maxver", js.undefined)
    @scala.inline
    def setMinver(value: Double): Self = this.set("minver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinver: Self = this.set("minver", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setStrong(value: informational_ | Informational): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    @scala.inline
    def setWebm(value: Boolean): Self = this.set("webm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebm: Self = this.set("webm", js.undefined)
  }
  
}

