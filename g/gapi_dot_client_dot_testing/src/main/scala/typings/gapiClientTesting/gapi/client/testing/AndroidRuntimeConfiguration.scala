package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    * @OutputOnly
    */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  /**
    * The set of available orientations.
    * @OutputOnly
    */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.native
}

object AndroidRuntimeConfiguration {
  @scala.inline
  def apply(): AndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRuntimeConfiguration]
  }
  @scala.inline
  implicit class AndroidRuntimeConfigurationOps[Self <: AndroidRuntimeConfiguration] (val x: Self) extends AnyVal {
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
    def setLocalesVarargs(value: Locale*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[Locale]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setOrientationsVarargs(value: Orientation*): Self = this.set("orientations", js.Array(value :_*))
    @scala.inline
    def setOrientations(value: js.Array[Orientation]): Self = this.set("orientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientations: Self = this.set("orientations", js.undefined)
  }
  
}

