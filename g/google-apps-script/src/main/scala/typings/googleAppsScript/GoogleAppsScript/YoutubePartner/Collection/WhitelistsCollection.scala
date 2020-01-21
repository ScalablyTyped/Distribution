package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Whitelist
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.WhitelistListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhitelistsCollection extends js.Object {
  // Retrieves a specific whitelisted channel by ID.
  def get(id: String): Whitelist = js.native
  // Retrieves a specific whitelisted channel by ID.
  def get(id: String, optionalArgs: js.Object): Whitelist = js.native
  // Whitelist a YouTube channel for your content owner. Whitelisted channels are channels that are not owned or managed by you, but you would like to whitelist so that no claims from your assets are placed on videos uploaded to these channels.
  def insert(resource: Whitelist): Whitelist = js.native
  // Whitelist a YouTube channel for your content owner. Whitelisted channels are channels that are not owned or managed by you, but you would like to whitelist so that no claims from your assets are placed on videos uploaded to these channels.
  def insert(resource: Whitelist, optionalArgs: js.Object): Whitelist = js.native
  // Retrieves a list of whitelisted channels for a content owner.
  def list(): WhitelistListResponse = js.native
  // Retrieves a list of whitelisted channels for a content owner.
  def list(optionalArgs: js.Object): WhitelistListResponse = js.native
  // Removes a whitelisted channel for a content owner.
  def remove(id: String): Unit = js.native
  // Removes a whitelisted channel for a content owner.
  def remove(id: String, optionalArgs: js.Object): Unit = js.native
}

