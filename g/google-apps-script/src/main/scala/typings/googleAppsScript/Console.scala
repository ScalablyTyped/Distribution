package typings.googleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  def error(): Unit = js.native
  def error(formatOrObject: String, values: Any*): Unit = js.native
  def error(formatOrObject: js.Object, values: Any*): Unit = js.native
  
  def info(): Unit = js.native
  def info(formatOrObject: String, values: Any*): Unit = js.native
  def info(formatOrObject: js.Object, values: Any*): Unit = js.native
  
  def log(): Unit = js.native
  def log(formatOrObject: String, values: Any*): Unit = js.native
  def log(formatOrObject: js.Object, values: Any*): Unit = js.native
  
  def time(label: String): Unit = js.native
  
  def timeEnd(label: String): Unit = js.native
  
  def warn(): Unit = js.native
  def warn(formatOrObject: String, values: Any*): Unit = js.native
  def warn(formatOrObject: js.Object, values: Any*): Unit = js.native
}
