package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInspectInfo extends js.Object {
  var Architecture: java.lang.String
  var Author: java.lang.String
  var Comment: java.lang.String
  var Config: dockerodeLib.Anon_ArgsEscapedAttachStderr
  var Container: java.lang.String
  var ContainerConfig: dockerodeLib.Anon_ArgsEscaped
  var Created: java.lang.String
  var DockerVersion: java.lang.String
  var GraphDriver: dockerodeLib.Anon_Data
  var Id: java.lang.String
  var Os: java.lang.String
  var Parent: java.lang.String
  var RepoDigests: js.Array[java.lang.String]
  var RepoTags: js.Array[java.lang.String]
  var Size: scala.Double
  var VirtualSize: scala.Double
}

object ImageInspectInfo {
  @scala.inline
  def apply(
    Architecture: java.lang.String,
    Author: java.lang.String,
    Comment: java.lang.String,
    Config: dockerodeLib.Anon_ArgsEscapedAttachStderr,
    Container: java.lang.String,
    ContainerConfig: dockerodeLib.Anon_ArgsEscaped,
    Created: java.lang.String,
    DockerVersion: java.lang.String,
    GraphDriver: dockerodeLib.Anon_Data,
    Id: java.lang.String,
    Os: java.lang.String,
    Parent: java.lang.String,
    RepoDigests: js.Array[java.lang.String],
    RepoTags: js.Array[java.lang.String],
    Size: scala.Double,
    VirtualSize: scala.Double
  ): ImageInspectInfo = {
    val __obj = js.Dynamic.literal(Architecture = Architecture, Author = Author, Comment = Comment, Config = Config, Container = Container, ContainerConfig = ContainerConfig, Created = Created, DockerVersion = DockerVersion, GraphDriver = GraphDriver, Id = Id, Os = Os, Parent = Parent, RepoDigests = RepoDigests, RepoTags = RepoTags, Size = Size, VirtualSize = VirtualSize)
  
    __obj.asInstanceOf[ImageInspectInfo]
  }
}

