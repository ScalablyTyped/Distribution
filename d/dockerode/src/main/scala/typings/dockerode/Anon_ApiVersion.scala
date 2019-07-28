package typings.dockerode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiVersion extends js.Object {
  var ApiVersion: String
  var Arch: String
  var BuildTime: Date
  var Experimental: String
  var GitCommit: String
  var GoVersion: String
  var KernelVersion: String
  var Os: String
}

object Anon_ApiVersion {
  @scala.inline
  def apply(
    ApiVersion: String,
    Arch: String,
    BuildTime: Date,
    Experimental: String,
    GitCommit: String,
    GoVersion: String,
    KernelVersion: String,
    Os: String
  ): Anon_ApiVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion, Arch = Arch, BuildTime = BuildTime, Experimental = Experimental, GitCommit = GitCommit, GoVersion = GoVersion, KernelVersion = KernelVersion, Os = Os)
  
    __obj.asInstanceOf[Anon_ApiVersion]
  }
}

