package typings
package atFirebasePerformanceDashTypesLib.atFirebasePerformanceDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebasePerformance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: scala.Boolean
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: scala.Boolean
  /**
    * Creates an uninitialized instance of trace and returns it.
    *
    * @param traceName The name of trace instance.
    * @return The trace instance.
    */
  def trace(traceName: java.lang.String): PerformanceTrace
}

object FirebasePerformance {
  @scala.inline
  def apply(
    dataCollectionEnabled: scala.Boolean,
    instrumentationEnabled: scala.Boolean,
    trace: java.lang.String => PerformanceTrace
  ): FirebasePerformance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled, instrumentationEnabled = instrumentationEnabled, trace = js.Any.fromFunction1(trace))
  
    __obj.asInstanceOf[FirebasePerformance]
  }
}

