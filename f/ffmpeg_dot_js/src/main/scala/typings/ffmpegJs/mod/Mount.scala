package typings.ffmpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mount extends js.Object {
  var mountpoint: String
  var opts: Opts
  var `type`: String
}

object Mount {
  @scala.inline
  def apply(mountpoint: String, opts: Opts, `type`: String): Mount = {
    val __obj = js.Dynamic.literal(mountpoint = mountpoint.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
}

