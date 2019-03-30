package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhitelistsCollection extends js.Object {
  // Retrieves a specific whitelisted channel by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist = js.native
  // Retrieves a specific whitelisted channel by ID.
  def get(id: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist = js.native
  // Whitelist a YouTube channel for your content owner. Whitelisted channels are channels that are not owned or managed by you, but you would like to whitelist so that no claims from your assets are placed on videos uploaded to these channels.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist = js.native
  // Whitelist a YouTube channel for your content owner. Whitelisted channels are channels that are not owned or managed by you, but you would like to whitelist so that no claims from your assets are placed on videos uploaded to these channels.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.Whitelist = js.native
  // Retrieves a list of whitelisted channels for a content owner.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.WhitelistListResponse = js.native
  // Retrieves a list of whitelisted channels for a content owner.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs.WhitelistListResponse = js.native
  // Removes a whitelisted channel for a content owner.
  def remove(id: java.lang.String): scala.Unit = js.native
  // Removes a whitelisted channel for a content owner.
  def remove(id: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
}

