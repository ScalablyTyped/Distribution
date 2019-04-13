package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerVersion extends js.Object {
  var ApiVersion: java.lang.String
  var Arch: java.lang.String
  var BuildTime: stdLib.Date
  var Components: js.Array[dockerodeLib.Anon_Details]
  var GitCommit: java.lang.String
  var GoVersion: java.lang.String
  var KernelVersion: java.lang.String
  var MinAPIVersion: java.lang.String
  var Os: java.lang.String
  var Platform: dockerodeLib.Anon_Name
  var Version: java.lang.String
}

object DockerVersion {
  @scala.inline
  def apply(
    ApiVersion: java.lang.String,
    Arch: java.lang.String,
    BuildTime: stdLib.Date,
    Components: js.Array[dockerodeLib.Anon_Details],
    GitCommit: java.lang.String,
    GoVersion: java.lang.String,
    KernelVersion: java.lang.String,
    MinAPIVersion: java.lang.String,
    Os: java.lang.String,
    Platform: dockerodeLib.Anon_Name,
    Version: java.lang.String
  ): DockerVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion, Arch = Arch, BuildTime = BuildTime, Components = Components, GitCommit = GitCommit, GoVersion = GoVersion, KernelVersion = KernelVersion, MinAPIVersion = MinAPIVersion, Os = Os, Platform = Platform, Version = Version)
  
    __obj.asInstanceOf[DockerVersion]
  }
}

