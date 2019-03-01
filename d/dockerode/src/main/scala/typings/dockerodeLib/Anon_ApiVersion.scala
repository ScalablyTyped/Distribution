package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiVersion extends js.Object {
  var ApiVersion: java.lang.String
  var Arch: java.lang.String
  var BuildTime: stdLib.Date
  var Experimental: java.lang.String
  var GitCommit: java.lang.String
  var GoVersion: java.lang.String
  var KernelVersion: java.lang.String
  var Os: java.lang.String
}

object Anon_ApiVersion {
  @scala.inline
  def apply(
    ApiVersion: java.lang.String,
    Arch: java.lang.String,
    BuildTime: stdLib.Date,
    Experimental: java.lang.String,
    GitCommit: java.lang.String,
    GoVersion: java.lang.String,
    KernelVersion: java.lang.String,
    Os: java.lang.String
  ): Anon_ApiVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApiVersion")(ApiVersion)
    __obj.updateDynamic("Arch")(Arch)
    __obj.updateDynamic("BuildTime")(BuildTime)
    __obj.updateDynamic("Experimental")(Experimental)
    __obj.updateDynamic("GitCommit")(GitCommit)
    __obj.updateDynamic("GoVersion")(GoVersion)
    __obj.updateDynamic("KernelVersion")(KernelVersion)
    __obj.updateDynamic("Os")(Os)
    __obj.asInstanceOf[Anon_ApiVersion]
  }
}

