package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerVersion extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
  var container: js.UndefOr[Container] = js.native
  var containerId: js.UndefOr[String] = js.native
  var containerVersionId: js.UndefOr[String] = js.native
  var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var fingerprint: js.UndefOr[String] = js.native
  var folder: js.UndefOr[js.Array[Folder]] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var tag: js.UndefOr[js.Array[Tag]] = js.native
  var tagManagerUrl: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[js.Array[Trigger]] = js.native
  var variable: js.UndefOr[js.Array[Variable]] = js.native
  var zone: js.UndefOr[js.Array[Zone]] = js.native
}

object ContainerVersion {
  @scala.inline
  def apply(): ContainerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerVersion]
  }
  @scala.inline
  implicit class ContainerVersionOps[Self <: ContainerVersion] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = this.set("builtInVariable", js.Array(value :_*))
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = this.set("builtInVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltInVariable: Self = this.set("builtInVariable", js.undefined)
    @scala.inline
    def setContainer(value: Container): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setContainerVersionId(value: String): Self = this.set("containerVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerVersionId: Self = this.set("containerVersionId", js.undefined)
    @scala.inline
    def setCustomTemplateVarargs(value: CustomTemplate*): Self = this.set("customTemplate", js.Array(value :_*))
    @scala.inline
    def setCustomTemplate(value: js.Array[CustomTemplate]): Self = this.set("customTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomTemplate: Self = this.set("customTemplate", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setFolderVarargs(value: Folder*): Self = this.set("folder", js.Array(value :_*))
    @scala.inline
    def setFolder(value: js.Array[Folder]): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTagVarargs(value: Tag*): Self = this.set("tag", js.Array(value :_*))
    @scala.inline
    def setTag(value: js.Array[Tag]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    @scala.inline
    def setTriggerVarargs(value: Trigger*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: js.Array[Trigger]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setVariableVarargs(value: Variable*): Self = this.set("variable", js.Array(value :_*))
    @scala.inline
    def setVariable(value: js.Array[Variable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
    @scala.inline
    def setZoneVarargs(value: Zone*): Self = this.set("zone", js.Array(value :_*))
    @scala.inline
    def setZone(value: js.Array[Zone]): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

