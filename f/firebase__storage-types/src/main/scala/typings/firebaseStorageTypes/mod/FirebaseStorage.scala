package typings.firebaseStorageTypes.mod

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseStorageTypes.anon.MockUserToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage-types", "FirebaseStorage")
@js.native
/* private */ open class FirebaseStorage () extends StObject {
  
  var app: FirebaseApp = js.native
  
  var maxOperationRetryTime: Double = js.native
  
  var maxUploadRetryTime: Double = js.native
  
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  
  def refFromURL(url: String): Reference = js.native
  
  def setMaxOperationRetryTime(time: Double): Unit = js.native
  
  def setMaxUploadRetryTime(time: Double): Unit = js.native
  
  def useEmulator(host: String, port: Double): Unit = js.native
  def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
}
