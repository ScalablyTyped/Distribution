package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    * @OutputOnly
    */
  var models: js.UndefOr[js.Array[AndroidModel]] = js.native
  /**
    * The set of supported runtime configurations.
    * @OutputOnly
    */
  var runtimeConfiguration: js.UndefOr[AndroidRuntimeConfiguration] = js.native
  /**
    * The set of supported Android OS versions.
    * @OutputOnly
    */
  var versions: js.UndefOr[js.Array[AndroidVersion]] = js.native
}

object AndroidDeviceCatalog {
  @scala.inline
  def apply(): AndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceCatalog]
  }
  @scala.inline
  implicit class AndroidDeviceCatalogOps[Self <: AndroidDeviceCatalog] (val x: Self) extends AnyVal {
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
    def setModelsVarargs(value: AndroidModel*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[AndroidModel]): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setRuntimeConfiguration(value: AndroidRuntimeConfiguration): Self = this.set("runtimeConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("runtimeConfiguration", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: AndroidVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[AndroidVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

