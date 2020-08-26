package typings.dockerode.mod

import typings.dockerode.anon.ArgsEscaped
import typings.dockerode.anon.AttachStdin
import typings.dockerode.anon.BaseLayer
import typings.dockerode.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInspectInfo extends js.Object {
  var Architecture: String = js.native
  var Author: String = js.native
  var Comment: String = js.native
  var Config: AttachStdin = js.native
  var Container: String = js.native
  var ContainerConfig: ArgsEscaped = js.native
  var Created: String = js.native
  var DockerVersion: String = js.native
  var GraphDriver: Data = js.native
  var Id: String = js.native
  var Os: String = js.native
  var Parent: String = js.native
  var RepoDigests: js.Array[String] = js.native
  var RepoTags: js.Array[String] = js.native
  var RootFS: BaseLayer = js.native
  var Size: Double = js.native
  var VirtualSize: Double = js.native
}

object ImageInspectInfo {
  @scala.inline
  def apply(
    Architecture: String,
    Author: String,
    Comment: String,
    Config: AttachStdin,
    Container: String,
    ContainerConfig: ArgsEscaped,
    Created: String,
    DockerVersion: String,
    GraphDriver: Data,
    Id: String,
    Os: String,
    Parent: String,
    RepoDigests: js.Array[String],
    RepoTags: js.Array[String],
    RootFS: BaseLayer,
    Size: Double,
    VirtualSize: Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], ContainerConfig = ContainerConfig.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], DockerVersion = DockerVersion.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepoDigests = RepoDigests.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], RootFS = RootFS.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInspectInfo]
  }
  @scala.inline
  implicit class ImageInspectInfoOps[Self <: ImageInspectInfo] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: String): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: AttachStdin): Self = this.set("Config", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("Container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerConfig(value: ArgsEscaped): Self = this.set("ContainerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDockerVersion(value: String): Self = this.set("DockerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphDriver(value: Data): Self = this.set("GraphDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("Os", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: String): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepoDigestsVarargs(value: String*): Self = this.set("RepoDigests", js.Array(value :_*))
    @scala.inline
    def setRepoDigests(value: js.Array[String]): Self = this.set("RepoDigests", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepoTagsVarargs(value: String*): Self = this.set("RepoTags", js.Array(value :_*))
    @scala.inline
    def setRepoTags(value: js.Array[String]): Self = this.set("RepoTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootFS(value: BaseLayer): Self = this.set("RootFS", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualSize(value: Double): Self = this.set("VirtualSize", value.asInstanceOf[js.Any])
  }
  
}

