package typings.ebml.ebmlMod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlib,`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.informational
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ebml.ebmlMod.EBMLTagSchema because Already inherited */ trait EBMLBinaryTagSchema extends EBMLTagSchemaBase {
  var bytesize: js.UndefOr[Double] = js.undefined
}

object EBMLBinaryTagSchema {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    `type`: TagType,
    bytesize: Int | Double = null,
    cppname: String = null,
    del: (js.Tuple2[`1 - bzlib,`, `2 - lzo1x`]) | (`1 - bzlib,`) | (`2 - lzo1x`) = null,
    divx: js.UndefOr[Boolean] = js.undefined,
    i: String = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    maxver: String = null,
    minver: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    strong: informational | Informational = null,
    webm: js.UndefOr[Boolean] = js.undefined
  ): EBMLBinaryTagSchema = {
    val __obj = js.Dynamic.literal(description = description, level = level, name = name)
    __obj.updateDynamic("type")(`type`)
    if (bytesize != null) __obj.updateDynamic("bytesize")(bytesize.asInstanceOf[js.Any])
    if (cppname != null) __obj.updateDynamic("cppname")(cppname)
    if (del != null) __obj.updateDynamic("del")(del.asInstanceOf[js.Any])
    if (!js.isUndefined(divx)) __obj.updateDynamic("divx")(divx)
    if (i != null) __obj.updateDynamic("i")(i)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (maxver != null) __obj.updateDynamic("maxver")(maxver)
    if (minver != null) __obj.updateDynamic("minver")(minver.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (!js.isUndefined(webm)) __obj.updateDynamic("webm")(webm)
    __obj.asInstanceOf[EBMLBinaryTagSchema]
  }
}

