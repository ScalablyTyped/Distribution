package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminInterface extends StObject {
  
  var admin: AdminInterface = js.native
  
  def alert(message: String): Unit = js.native
  def alert(message: AlertProps): Unit = js.native
  
  var api: Any = js.native
  
  def confirm(message: String): Unit = js.native
  def confirm(message: AlertProps): Unit = js.native
  
  def dismissMessages(): Unit = js.native
  
  def dismissModal(): Unit = js.native
  
  def error(message: String): Unit = js.native
  
  def info(message: String): Unit = js.native
  
  def loading(on: Boolean): Double = js.native
  
  def login(username: String, password: String): js.Promise[UserInterface] = js.native
  
  def logout(): Unit = js.native
  
  def progress(on: Boolean): Double = js.native
  
  var router: js.UndefOr[RouterInterface] = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def settings(): Any = js.native
  
  def success(message: String): Unit = js.native
  
  var user: js.UndefOr[UserInterface] = js.native
  
  def warning(message: String): Unit = js.native
}
