package typings
package firebaseLib.firebaseMod.performanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Performance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: scala.Boolean
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: scala.Boolean
  /**
    * Creates an uninitialized instance of {@link firebase.performance.Trace `trace`} and returns
    * it.
    *
    * @param traceName The name of the trace instance.
    * @return The Trace instance.
    */
  def trace(traceName: java.lang.String): Trace
}

object Performance {
  @scala.inline
  def apply(
    dataCollectionEnabled: scala.Boolean,
    instrumentationEnabled: scala.Boolean,
    trace: java.lang.String => Trace
  ): Performance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled, instrumentationEnabled = instrumentationEnabled, trace = js.Any.fromFunction1(trace))
  
    __obj.asInstanceOf[Performance]
  }
}

