package typings.firebasePerformanceTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebasePerformance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: Boolean = js.native
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: Boolean = js.native
  /**
    * Creates an uninitialized instance of trace and returns it.
    *
    * @param traceName The name of trace instance.
    * @return The trace instance.
    */
  def trace(traceName: String): PerformanceTrace = js.native
}

object FirebasePerformance {
  @scala.inline
  def apply(dataCollectionEnabled: Boolean, instrumentationEnabled: Boolean, trace: String => PerformanceTrace): FirebasePerformance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any], trace = js.Any.fromFunction1(trace))
    __obj.asInstanceOf[FirebasePerformance]
  }
  @scala.inline
  implicit class FirebasePerformanceOps[Self <: FirebasePerformance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataCollectionEnabled(value: Boolean): Self = this.set("dataCollectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstrumentationEnabled(value: Boolean): Self = this.set("instrumentationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrace(value: String => PerformanceTrace): Self = this.set("trace", js.Any.fromFunction1(value))
  }
  
}

