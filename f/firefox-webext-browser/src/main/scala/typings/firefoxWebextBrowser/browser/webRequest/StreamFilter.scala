package typings.firefoxWebextBrowser.browser.webRequest

import typings.std.ArrayBuffer
import typings.std.Event
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object you can use to monitor and modify HTTP responses. */
@js.native
trait StreamFilter extends StObject {
  
  /** Closes the request. */
  def close(): Unit = js.native
  
  /** Disconnects the filter from the request. */
  def disconnect(): Unit = js.native
  
  /** A string that will contain an error message after the onerror event has fired. */
  var error: String = js.native
  
  /** Event handler which is called when incoming data is available. */
  var ondata: (js.Function1[/* event */ StreamFilterOndataEvent, Unit]) | Null = js.native
  
  /** Event handler which is called when an error has occurred. */
  var onerror: (js.Function1[/* event */ Event, Unit]) | Null = js.native
  
  /** Event handler which is called when the stream is about to start receiving data. */
  var onstart: (js.Function1[/* event */ Event, Unit]) | Null = js.native
  
  /** Event handler which is called when the stream has no more data to deliver and has closed. */
  var onstop: (js.Function1[/* event */ Event, Unit]) | Null = js.native
  
  /** Resumes processing of the request. */
  def resume(): Unit = js.native
  
  /** Describes the current status of the stream. */
  var status: StreamFilterStatus = js.native
  
  /** Suspends processing of the request. */
  def suspend(): Unit = js.native
  
  def write(data: ArrayBuffer): Unit = js.native
  /** Writes some data to the output stream. */
  def write(data: Uint8Array): Unit = js.native
}
