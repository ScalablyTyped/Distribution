package typings.ebml.mod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlibComma`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.f
import typings.ebml.ebmlStrings.i
import typings.ebml.ebmlStrings.informational_
import typings.ebml.ebmlStrings.u
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ebml.mod.EBMLTagSchema because Already inherited */ trait EBMLNumericTagSchema extends EBMLDefaultableTagSchema {
  var br: js.UndefOr[
    String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String])
  ] = js.undefined
  var range: String
  @JSName("type")
  var type_EBMLNumericTagSchema: u | i | f
}

object EBMLNumericTagSchema {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    range: String,
    `type`: u | i | f,
    br: String | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String]) = null,
    cppname: String = null,
    default: js.Any = null,
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
  ): EBMLNumericTagSchema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (cppname != null) __obj.updateDynamic("cppname")(cppname.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[EBMLNumericTagSchema]
  }
}

