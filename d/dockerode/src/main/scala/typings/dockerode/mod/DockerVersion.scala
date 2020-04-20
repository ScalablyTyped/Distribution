package typings.dockerode.mod

import typings.dockerode.AnonDetails
import typings.dockerode.AnonNameString
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerVersion extends js.Object {
  var ApiVersion: String
  var Arch: String
  var BuildTime: Date
  var Components: js.Array[AnonDetails]
  var GitCommit: String
  var GoVersion: String
  var KernelVersion: String
  var MinAPIVersion: String
  var Os: String
  var Platform: AnonNameString
  var Version: String
}

object DockerVersion {
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: Date,
    Components: js.Array[AnonDetails],
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    MinAPIVersion: String,
    Os: String,
    Platform: AnonNameString,
    Version: String
  ): DockerVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Components = Components.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], MinAPIVersion = MinAPIVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerVersion]
  }
}

