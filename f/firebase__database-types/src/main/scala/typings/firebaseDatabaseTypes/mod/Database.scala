package typings.firebaseDatabaseTypes.mod

import typings.firebaseAppTypes.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  var app: FirebaseApp = js.native
  
  def goOffline(): Unit = js.native
  
  def goOnline(): Unit = js.native
  
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  def ref(path: Reference): Reference = js.native
  
  def refFromURL(url: String): Reference = js.native
  
  def useEmulator(host: String, port: Double): Unit = js.native
}
