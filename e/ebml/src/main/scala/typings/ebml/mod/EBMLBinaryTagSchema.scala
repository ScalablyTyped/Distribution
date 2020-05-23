package typings.ebml.mod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlibComma`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.informational_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLBinaryTagSchema extends EBMLTagSchemaBase {
  var bytesize: js.UndefOr[Double] = js.undefined
}

object EBMLBinaryTagSchema {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    `type`: TagType,
    bytesize: js.UndefOr[Double] = js.undefined,
    cppname: String = null,
    del: (js.Tuple2[`1 - bzlibComma`, `2 - lzo1x`]) | (`1 - bzlibComma`) | (`2 - lzo1x`) = null,
    divx: js.UndefOr[Boolean] = js.undefined,
    i: String = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    maxver: String = null,
    minver: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    strong: informational_ | Informational = null,
    webm: js.UndefOr[Boolean] = js.undefined
  ): EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesize)) __obj.updateDynamic("bytesize")(bytesize.get.asInstanceOf[js.Any])
    if (cppname != null) __obj.updateDynamic("cppname")(cppname.asInstanceOf[js.Any])
    if (del != null) __obj.updateDynamic("del")(del.asInstanceOf[js.Any])
    if (!js.isUndefined(divx)) __obj.updateDynamic("divx")(divx.get.asInstanceOf[js.Any])
    if (i != null) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.get.asInstanceOf[js.Any])
    if (maxver != null) __obj.updateDynamic("maxver")(maxver.asInstanceOf[js.Any])
    if (!js.isUndefined(minver)) __obj.updateDynamic("minver")(minver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (!js.isUndefined(webm)) __obj.updateDynamic("webm")(webm.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBMLBinaryTagSchema]
  }
}

