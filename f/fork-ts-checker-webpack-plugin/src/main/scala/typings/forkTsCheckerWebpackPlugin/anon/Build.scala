package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-references`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.`write-tsbuildinfo`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.readonly
import typings.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod.TypeScriptConfigurationOverwrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var build: js.UndefOr[Boolean] = js.native
  var configFile: js.UndefOr[String] = js.native
  var configOverwrite: js.UndefOr[TypeScriptConfigurationOverwrite] = js.native
  var context: js.UndefOr[String] = js.native
  var diagnosticOptions: js.UndefOr[PartialTypeScriptDiagnost] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[`0`] = js.native
  var memoryLimit: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[readonly | `write-tsbuildinfo` | `write-references`] = js.native
  var profile: js.UndefOr[Boolean] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
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
    def setBuild(value: Boolean): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    @scala.inline
    def setConfigOverwrite(value: TypeScriptConfigurationOverwrite): Self = this.set("configOverwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigOverwrite: Self = this.set("configOverwrite", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDiagnosticOptions(value: PartialTypeScriptDiagnost): Self = this.set("diagnosticOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticOptions: Self = this.set("diagnosticOptions", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExtensions(value: `0`): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryLimit: Self = this.set("memoryLimit", js.undefined)
    @scala.inline
    def setMode(value: readonly | `write-tsbuildinfo` | `write-references`): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

