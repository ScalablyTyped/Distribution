package typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMirror.Anon_AccountName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Inserts a new account for a user */
  def insert(request: Anon_AccountName): Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(insert: Anon_AccountName => Request[Account]): AccountsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

