package typings.dockerode.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiVersion extends js.Object {
  var ApiVersion: String
  var Arch: String
  var BuildTime: Date
  var Experimental: String
  var GitCommit: String
  var GoVersion: String
  var KernelVersion: String
  var Os: String
}

object ApiVersion {
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
  ): ApiVersion = {
    val __obj = js.Dynamic.literal(ApiVersion = ApiVersion.asInstanceOf[js.Any], Arch = Arch.asInstanceOf[js.Any], BuildTime = BuildTime.asInstanceOf[js.Any], Experimental = Experimental.asInstanceOf[js.Any], GitCommit = GitCommit.asInstanceOf[js.Any], GoVersion = GoVersion.asInstanceOf[js.Any], KernelVersion = KernelVersion.asInstanceOf[js.Any], Os = Os.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
}

