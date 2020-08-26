package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeExperiment extends js.Object {
  var colors: js.UndefOr[StringDictionary[String]] = js.native
  var images: js.UndefOr[StringDictionary[String]] = js.native
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  var stylesheet: js.UndefOr[ExtensionURL] = js.native
}

object ThemeExperiment {
  @scala.inline
  def apply(): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeExperiment]
  }
  @scala.inline
  implicit class ThemeExperimentOps[Self <: ThemeExperiment] (val x: Self) extends AnyVal {
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
    def setColors(value: StringDictionary[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setImages(value: StringDictionary[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setStylesheet(value: ExtensionURL): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
  }
  
}

