package typings
package ecmarkupLib.libEcmarkupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assets: js.UndefOr[ecmarkupLib.ecmarkupLibStrings.none | ecmarkupLib.ecmarkupLibStrings.`inline`] = js.undefined
  var boilerplate: js.UndefOr[Boilerplate] = js.undefined
  var contributors: js.UndefOr[java.lang.String] = js.undefined
  var copyright: js.UndefOr[scala.Boolean] = js.undefined
  var cssOut: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var jsOut: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var oldToc: js.UndefOr[scala.Boolean] = js.undefined
  var outfile: js.UndefOr[java.lang.String] = js.undefined
  var shortname: js.UndefOr[java.lang.String] = js.undefined
  var stage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var status: js.UndefOr[
    ecmarkupLib.ecmarkupLibStrings.proposal | ecmarkupLib.ecmarkupLibStrings.draft | ecmarkupLib.ecmarkupLibStrings.standard
  ] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toc: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assets: ecmarkupLib.ecmarkupLibStrings.none | ecmarkupLib.ecmarkupLibStrings.`inline` = null,
    boilerplate: Boilerplate = null,
    contributors: java.lang.String = null,
    copyright: js.UndefOr[scala.Boolean] = js.undefined,
    cssOut: java.lang.String = null,
    date: stdLib.Date = null,
    jsOut: java.lang.String = null,
    location: java.lang.String = null,
    oldToc: js.UndefOr[scala.Boolean] = js.undefined,
    outfile: java.lang.String = null,
    shortname: java.lang.String = null,
    stage: java.lang.String = null,
    status: ecmarkupLib.ecmarkupLibStrings.proposal | ecmarkupLib.ecmarkupLibStrings.draft | ecmarkupLib.ecmarkupLibStrings.standard = null,
    title: java.lang.String = null,
    toc: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (boilerplate != null) __obj.updateDynamic("boilerplate")(boilerplate)
    if (contributors != null) __obj.updateDynamic("contributors")(contributors)
    if (!js.isUndefined(copyright)) __obj.updateDynamic("copyright")(copyright)
    if (cssOut != null) __obj.updateDynamic("cssOut")(cssOut)
    if (date != null) __obj.updateDynamic("date")(date)
    if (jsOut != null) __obj.updateDynamic("jsOut")(jsOut)
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(oldToc)) __obj.updateDynamic("oldToc")(oldToc)
    if (outfile != null) __obj.updateDynamic("outfile")(outfile)
    if (shortname != null) __obj.updateDynamic("shortname")(shortname)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(toc)) __obj.updateDynamic("toc")(toc)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Options]
  }
}

