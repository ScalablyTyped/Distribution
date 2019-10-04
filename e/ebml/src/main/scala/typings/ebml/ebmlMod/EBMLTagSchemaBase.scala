package typings.ebml.ebmlMod

import typings.ebml.ebmlStrings.Informational
import typings.ebml.ebmlStrings.`1 - bzlib,`
import typings.ebml.ebmlStrings.`2 - lzo1x`
import typings.ebml.ebmlStrings.informational
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EBMLTagSchemaBase extends EBMLTagSchema {
  var cppname: js.UndefOr[String] = js.undefined
  var del: js.UndefOr[(js.Tuple2[`1 - bzlib,`, `2 - lzo1x`]) | (`1 - bzlib,`) | (`2 - lzo1x`)] = js.undefined
  var description: String
  var divx: js.UndefOr[Boolean] = js.undefined
  var i: js.UndefOr[String] = js.undefined
  var level: Double
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var maxver: js.UndefOr[String] = js.undefined
  var minver: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: String
  var recursive: js.UndefOr[Boolean] = js.undefined
  var strong: js.UndefOr[informational | Informational] = js.undefined
  var `type`: TagType
  var webm: js.UndefOr[Boolean] = js.undefined
}

object EBMLTagSchemaBase {
  @scala.inline
  def apply(
    description: String,
    level: Double,
    name: String,
    `type`: TagType,
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
  ): EBMLTagSchemaBase = {
    val __obj = js.Dynamic.literal(description = description, level = level, name = name)
    __obj.updateDynamic("type")(`type`)
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
    __obj.asInstanceOf[EBMLTagSchemaBase]
  }
}

