package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsCollection extends js.Object {
  // Stop watching resources through this channel
  def stop(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Channel): scala.Unit
}

object ChannelsCollection {
  @scala.inline
  def apply(stop: googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs.Channel => scala.Unit): ChannelsCollection = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsCollection]
  }
}

