package typings.faviconsWebpackPlugin.mod

import typings.faviconsWebpackPlugin.anon.PartialConfiguration
import typings.faviconsWebpackPlugin.anon.optionsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var devMode: js.UndefOr[Mode] = js.native
  var favicons: js.UndefOr[PartialConfiguration] = js.native
  var inject: js.UndefOr[Boolean | (js.Function1[/* htmlPlugin */ optionsOptions, Boolean])] = js.native
  var logo: String = js.native
  var mode: js.UndefOr[Mode] = js.native
  var outputPath: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var publicPath: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(logo: String): Options = {
    val __obj = js.Dynamic.literal(logo = logo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDevMode(value: Mode): Self = this.set("devMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevMode: Self = this.set("devMode", js.undefined)
    @scala.inline
    def setFavicons(value: PartialConfiguration): Self = this.set("favicons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavicons: Self = this.set("favicons", js.undefined)
    @scala.inline
    def setInjectFunction1(value: /* htmlPlugin */ optionsOptions => Boolean): Self = this.set("inject", js.Any.fromFunction1(value))
    @scala.inline
    def setInject(value: Boolean | (js.Function1[/* htmlPlugin */ optionsOptions, Boolean])): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
  }
  
}

