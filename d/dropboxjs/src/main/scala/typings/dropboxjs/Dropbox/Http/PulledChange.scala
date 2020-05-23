package typings.dropboxjs.Dropbox.Http

import typings.dropboxjs.Dropbox.File.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulledChange extends js.Object {
  var path: String
  var stat: Stat
  var wasRemoved: Boolean
}

object PulledChange {
  @scala.inline
  def apply(path: String, stat: Stat, wasRemoved: Boolean): PulledChange = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], wasRemoved = wasRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulledChange]
  }
}

