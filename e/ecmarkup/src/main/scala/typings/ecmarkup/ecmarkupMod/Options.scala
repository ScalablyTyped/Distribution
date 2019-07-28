package typings.ecmarkup.ecmarkupMod

import typings.ecmarkup.ecmarkupStrings.`inline`
import typings.ecmarkup.ecmarkupStrings.draft
import typings.ecmarkup.ecmarkupStrings.none
import typings.ecmarkup.ecmarkupStrings.proposal
import typings.ecmarkup.ecmarkupStrings.standard
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assets: js.UndefOr[none | `inline`] = js.undefined
  var boilerplate: js.UndefOr[Boilerplate] = js.undefined
  var contributors: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[Boolean] = js.undefined
  var cssOut: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var jsOut: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var oldToc: js.UndefOr[Boolean] = js.undefined
  var outfile: js.UndefOr[String] = js.undefined
  var shortname: js.UndefOr[String] = js.undefined
  var stage: js.UndefOr[String | Null] = js.undefined
  var status: js.UndefOr[proposal | draft | standard] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toc: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assets: none | `inline` = null,
    boilerplate: Boilerplate = null,
    contributors: String = null,
    copyright: js.UndefOr[Boolean] = js.undefined,
    cssOut: String = null,
    date: Date = null,
    jsOut: String = null,
    location: String = null,
    oldToc: js.UndefOr[Boolean] = js.undefined,
    outfile: String = null,
    shortname: String = null,
    stage: String = null,
    status: proposal | draft | standard = null,
    title: String = null,
    toc: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    version: String = null
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

