package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsCollection extends js.Object {
  // Stop watching resources through this channel
  def stop(resource: Channel): Unit
}

object ChannelsCollection {
  @scala.inline
  def apply(stop: Channel => Unit): ChannelsCollection = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[ChannelsCollection]
  }
}

