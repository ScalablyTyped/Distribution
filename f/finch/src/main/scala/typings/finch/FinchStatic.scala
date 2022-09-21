package typings.finch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinchStatic extends StObject {
  
  def abort(): Unit = js.native
  
  def call(uri: String): Unit = js.native
  
  def ignore(): Boolean = js.native
  
  def listen(): Boolean = js.native
  
  def navigate(queryParams: Any): Unit = js.native
  def navigate(queryParams: Any, doUpdate: Boolean): Unit = js.native
  def navigate(uri: String): Unit = js.native
  def navigate(uri: String, doUpdate: Boolean): Unit = js.native
  def navigate(uri: String, queryParams: Any): Unit = js.native
  def navigate(uri: String, queryParams: Any, doUpdate: Boolean): Unit = js.native
  def navigate(uri: String, queryParams: Unit, doUpdate: Boolean): Unit = js.native
  
  def observe(argN: js.Array[String], callback: js.Function1[/* params */ ObserveCallback, Unit]): Unit = js.native
  def observe(args: Any*): Unit = js.native
  def observe(callback: js.Function1[/* params */ ObserveCallback, Unit]): Unit = js.native
  
  def options(options: FinchOptions): Unit = js.native
  
  def route(route: String, callbacks: ExpandedCallback): Unit = js.native
  def route(route: String, callback: FinchCallback): Unit = js.native
}
