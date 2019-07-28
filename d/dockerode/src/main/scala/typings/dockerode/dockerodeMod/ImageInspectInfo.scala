package typings.dockerode.dockerodeMod

import typings.dockerode.Anon_ArgsEscaped
import typings.dockerode.Anon_ArgsEscapedAttachStderr
import typings.dockerode.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInspectInfo extends js.Object {
  var Architecture: String
  var Author: String
  var Comment: String
  var Config: Anon_ArgsEscapedAttachStderr
  var Container: String
  var ContainerConfig: Anon_ArgsEscaped
  var Created: String
  var DockerVersion: String
  var GraphDriver: Anon_Data
  var Id: String
  var Os: String
  var Parent: String
  var RepoDigests: js.Array[String]
  var RepoTags: js.Array[String]
  var Size: Double
  var VirtualSize: Double
}

object ImageInspectInfo {
  @scala.inline
  def apply(
    Architecture: String,
    Author: String,
    Comment: String,
    Config: Anon_ArgsEscapedAttachStderr,
    Container: String,
    ContainerConfig: Anon_ArgsEscaped,
    Created: String,
    DockerVersion: String,
    GraphDriver: Anon_Data,
    Id: String,
    Os: String,
    Parent: String,
    RepoDigests: js.Array[String],
    RepoTags: js.Array[String],
    Size: Double,
    VirtualSize: Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture, Author = Author, Comment = Comment, Config = Config, Container = Container, ContainerConfig = ContainerConfig, Created = Created, DockerVersion = DockerVersion, GraphDriver = GraphDriver, Id = Id, Os = Os, Parent = Parent, RepoDigests = RepoDigests, RepoTags = RepoTags, Size = Size, VirtualSize = VirtualSize)
  
    __obj.asInstanceOf[ImageInspectInfo]
  }
}

