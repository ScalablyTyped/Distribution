package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeCollection extends js.Object {
  // Exports the contents of the Realtime API data model associated with this file as JSON.
  def get(fileId: String): Unit = js.native
  // Exports the contents of the Realtime API data model associated with this file as JSON.
  def get(fileId: String, optionalArgs: js.Object): Unit = js.native
  // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
  def update(fileId: String): Unit = js.native
  // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
  def update(fileId: String, mediaData: js.Any): Unit = js.native
  // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
  def update(fileId: String, mediaData: js.Any, optionalArgs: js.Object): Unit = js.native
}

