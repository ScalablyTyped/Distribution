package typings.googleAppsScript.GoogleAppsScript.Drive.Collection

import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Change
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ChangeList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.StartPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesCollection extends js.Object {
  // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
  def get(changeId: String): Change = js.native
  // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
  def get(changeId: String, optionalArgs: js.Object): Change = js.native
  // Gets the starting pageToken for listing future changes.
  def getStartPageToken(): StartPageToken = js.native
  // Gets the starting pageToken for listing future changes.
  def getStartPageToken(optionalArgs: js.Object): StartPageToken = js.native
  // Lists the changes for a user or Team Drive.
  def list(): ChangeList = js.native
  // Lists the changes for a user or Team Drive.
  def list(optionalArgs: js.Object): ChangeList = js.native
  // Subscribe to changes for a user.
  def watch(resource: Channel): Channel = js.native
  // Subscribe to changes for a user.
  def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
}

