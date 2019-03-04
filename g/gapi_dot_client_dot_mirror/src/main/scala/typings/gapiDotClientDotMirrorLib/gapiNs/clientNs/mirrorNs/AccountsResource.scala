package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Inserts a new account for a user */
  def insert(request: gapiDotClientDotMirrorLib.Anon_AccountName): gapiDotClientLib.gapiNs.clientNs.Request[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotClientDotMirrorLib.Anon_AccountName, 
      gapiDotClientLib.gapiNs.clientNs.Request[Account]
    ]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(insert = insert)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

