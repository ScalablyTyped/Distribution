package typings.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dev
  extends /* key */ StringDictionary[js.Any] {
  var dev: js.UndefOr[Boolean] = js.native
  var hostType: js.UndefOr[String] = js.native
  var lanType: js.UndefOr[String] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var urlRandomness: js.UndefOr[String] = js.native
  var urlType: js.UndefOr[String] = js.native
}

object Dev {
  @scala.inline
  def apply(): Dev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dev]
  }
  @scala.inline
  implicit class DevOps[Self <: Dev] (val x: Self) extends AnyVal {
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
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    @scala.inline
    def setHostType(value: String): Self = this.set("hostType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostType: Self = this.set("hostType", js.undefined)
    @scala.inline
    def setLanType(value: String): Self = this.set("lanType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanType: Self = this.set("lanType", js.undefined)
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setUrlRandomness(value: String): Self = this.set("urlRandomness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlRandomness: Self = this.set("urlRandomness", js.undefined)
    @scala.inline
    def setUrlType(value: String): Self = this.set("urlType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlType: Self = this.set("urlType", js.undefined)
  }
  
}

