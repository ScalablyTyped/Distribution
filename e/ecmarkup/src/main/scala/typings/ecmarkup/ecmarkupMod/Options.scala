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
    if (boilerplate != null) __obj.updateDynamic("boilerplate")(boilerplate.asInstanceOf[js.Any])
    if (contributors != null) __obj.updateDynamic("contributors")(contributors.asInstanceOf[js.Any])
    if (!js.isUndefined(copyright)) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (cssOut != null) __obj.updateDynamic("cssOut")(cssOut.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (jsOut != null) __obj.updateDynamic("jsOut")(jsOut.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(oldToc)) __obj.updateDynamic("oldToc")(oldToc.asInstanceOf[js.Any])
    if (outfile != null) __obj.updateDynamic("outfile")(outfile.asInstanceOf[js.Any])
    if (shortname != null) __obj.updateDynamic("shortname")(shortname.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toc)) __obj.updateDynamic("toc")(toc.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

