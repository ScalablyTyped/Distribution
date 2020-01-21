package typings.dockerode.mod

import typings.dockerode.AnonArgsEscaped
import typings.dockerode.AnonArgsEscapedAttachStderr
import typings.dockerode.AnonBaseLayer
import typings.dockerode.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInspectInfo extends js.Object {
  var Architecture: String
  var Author: String
  var Comment: String
  var Config: AnonArgsEscapedAttachStderr
  var Container: String
  var ContainerConfig: AnonArgsEscaped
  var Created: String
  var DockerVersion: String
  var GraphDriver: AnonData
  var Id: String
  var Os: String
  var Parent: String
  var RepoDigests: js.Array[String]
  var RepoTags: js.Array[String]
  var RootFS: AnonBaseLayer
  var Size: Double
  var VirtualSize: Double
}

object ImageInspectInfo {
  @scala.inline
  def apply(
    Architecture: String,
    Author: String,
    Comment: String,
    Config: AnonArgsEscapedAttachStderr,
    Container: String,
    ContainerConfig: AnonArgsEscaped,
    Created: String,
    DockerVersion: String,
    GraphDriver: AnonData,
    Id: String,
    Os: String,
    Parent: String,
    RepoDigests: js.Array[String],
    RepoTags: js.Array[String],
    RootFS: AnonBaseLayer,
    Size: Double,
    VirtualSize: Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], ContainerConfig = ContainerConfig.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], DockerVersion = DockerVersion.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepoDigests = RepoDigests.asInstanceOf[js.Any], RepoTags = RepoTags.asInstanceOf[js.Any], RootFS = RootFS.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], VirtualSize = VirtualSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImageInspectInfo]
  }
}

