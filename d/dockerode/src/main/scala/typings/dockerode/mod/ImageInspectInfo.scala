package typings.dockerode.mod

import typings.dockerode.anon.ArgsEscaped
import typings.dockerode.anon.AttachStdin
import typings.dockerode.anon.BaseLayer
import typings.dockerode.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInspectInfo extends js.Object {
  var Architecture: String
  var Author: String
  var Comment: String
  var Config: AttachStdin
  var Container: String
  var ContainerConfig: ArgsEscaped
  var Created: String
  var DockerVersion: String
  var GraphDriver: Data
  var Id: String
  var Os: String
  var Parent: String
  var RepoDigests: js.Array[String]
  var RepoTags: js.Array[String]
  var RootFS: BaseLayer
  var Size: Double
  var VirtualSize: Double
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
}

