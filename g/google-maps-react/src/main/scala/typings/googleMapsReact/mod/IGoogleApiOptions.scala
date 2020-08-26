package typings.googleMapsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGoogleApiOptions extends js.Object {
  var LoadingContainer: js.UndefOr[js.Any] = js.native
  var apiKey: String = js.native
  var client: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var libraries: js.UndefOr[js.Array[String]] = js.native
  var region: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object IGoogleApiOptions {
  @scala.inline
  def apply(apiKey: String): IGoogleApiOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGoogleApiOptions]
  }
  @scala.inline
  implicit class IGoogleApiOptionsOps[Self <: IGoogleApiOptions] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingContainer(value: js.Any): Self = this.set("LoadingContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingContainer: Self = this.set("LoadingContainer", js.undefined)
    @scala.inline
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLibrariesVarargs(value: String*): Self = this.set("libraries", js.Array(value :_*))
    @scala.inline
    def setLibraries(value: js.Array[String]): Self = this.set("libraries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraries: Self = this.set("libraries", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

