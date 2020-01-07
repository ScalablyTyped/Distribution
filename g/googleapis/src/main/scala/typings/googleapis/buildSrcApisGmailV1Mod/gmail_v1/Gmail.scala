package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail API
  *
  * Access Gmail mailboxes including sending user email.
  *
  * @example
  * const {google} = require('googleapis');
  * const gmail = google.gmail('v1');
  *
  * @namespace gmail
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Gmail
  */
@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Gmail")
@js.native
class Gmail protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var users: Resource$Users = js.native
}

