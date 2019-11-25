package typings.firebase.firebaseMod.performance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Performance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: Boolean
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: Boolean
  /**
    * Creates an uninitialized instance of {@link firebase.performance.Trace `trace`} and returns
    * it.
    *
    * @param traceName The name of the trace instance.
    * @return The Trace instance.
    */
  def trace(traceName: String): Trace
}

object Performance {
  @scala.inline
  def apply(dataCollectionEnabled: Boolean, instrumentationEnabled: Boolean, trace: String => Trace): Performance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace))
  
    __obj.asInstanceOf[Performance]
  }
}

