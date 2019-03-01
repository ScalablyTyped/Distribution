package typings
package dockerodeLib.dockerodeMod.DockerodeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApiVersion")(ApiVersion)
    __obj.updateDynamic("Arch")(Arch)
    __obj.updateDynamic("BuildTime")(BuildTime)
    __obj.updateDynamic("Components")(Components)
    __obj.updateDynamic("GitCommit")(GitCommit)
    __obj.updateDynamic("GoVersion")(GoVersion)
    __obj.updateDynamic("KernelVersion")(KernelVersion)
    __obj.updateDynamic("MinAPIVersion")(MinAPIVersion)
    __obj.updateDynamic("Os")(Os)
    __obj.updateDynamic("Platform")(Platform)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[DockerVersion]
  }
}

