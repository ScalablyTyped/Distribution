package typings
package firebaseLib.firebaseMod.firebaseNs.databaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def goOffline(): js.Any = js.native
  def goOnline(): js.Any = js.native
  def ref(): Reference = js.native
  def ref(path: java.lang.String): Reference = js.native
  def refFromURL(url: java.lang.String): Reference = js.native
}

