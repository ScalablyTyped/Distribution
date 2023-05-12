package typings.domNavigation

import typings.std.AbortSignal
import typings.std.Event
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateEvent
  extends StObject
     with Event {
  
  val canIntercept: Boolean = js.native
  
  val destination: NavigationDestination = js.native
  
  val downloadRequest: String | Null = js.native
  
  val formData: FormData | Null = js.native
  
  val hashChange: Boolean = js.native
  
  val info: js.UndefOr[Any] = js.native
  
  def intercept(): Unit = js.native
  def intercept(options: NavigationInterceptOptions): Unit = js.native
  
  val navigationType: NavigationTypeString = js.native
  
  def scroll(): Unit = js.native
  
  val signal: AbortSignal = js.native
  
  val userInitiated: Boolean = js.native
}
