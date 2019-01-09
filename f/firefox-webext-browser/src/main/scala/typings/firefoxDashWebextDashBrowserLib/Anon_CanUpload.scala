package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CanUpload extends js.Object {
  /** Checks if Telemetry is enabled. */
  def canUpload(): js.Promise[_] = js.native
  /**
    * Record an event in Telemetry. Throws when trying to record an unknown event.
    * @param category The category name.
    * @param method The method name.
    * @param object The object name.
    * @param [value] An optional string value to record.
    * @param [extra] An optional object of the form (string -> string). It should only contain registered extra keys.
    */
  def recordEvent(category: java.lang.String, method: java.lang.String, `object`: java.lang.String): js.Promise[_] = js.native
  def recordEvent(
    category: java.lang.String,
    method: java.lang.String,
    `object`: java.lang.String,
    value: scala.Double
  ): js.Promise[_] = js.native
  def recordEvent(
    category: java.lang.String,
    method: java.lang.String,
    `object`: java.lang.String,
    value: scala.Double,
    extra: java.lang.String
  ): js.Promise[_] = js.native
  /**
    * Register new events to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the events are registered in.
    * @param data An object that contains registration data for 1+ events. Each property name is the category name,
    *     and the corresponding property value is an object of EventData type.
    */
  def registerEvents(category: java.lang.String, data: firefoxDashWebextDashBrowserLib.browserNs.telemetryNs.EventData): js.Promise[_] = js.native
  /**
    * Register new scalars to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the scalars are registered in.
    * @param data An object that contains registration data for multiple scalars. Each property name is the scalar
    *     name, and the corresponding property value is an object of ScalarData type.
    */
  def registerScalars(category: java.lang.String, data: firefoxDashWebextDashBrowserLib.browserNs.telemetryNs.ScalarData): js.Promise[_] = js.native
  /**
    * Adds the value to the given scalar.
    * @param name The scalar name.
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  def scalarAdd(name: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  /**
    * Sets the named scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name
    * @param value The value to set the scalar to
    */
  def scalarSet(name: java.lang.String, value: java.lang.String): js.Promise[_] = js.native
  def scalarSet(name: java.lang.String, value: js.Object): js.Promise[_] = js.native
  def scalarSet(name: java.lang.String, value: scala.Boolean): js.Promise[_] = js.native
  def scalarSet(name: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  /**
    * Sets the scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  def scalarSetMaximum(name: java.lang.String, value: scala.Double): js.Promise[_] = js.native
  /**
    * Enable recording of events in a category. Events default to recording disabled. This allows to toggle recording
    * for all events in the specified category.
    * @param category The category name.
    * @param enabled Whether recording is enabled for events in that category.
    */
  def setEventRecordingEnabled(category: java.lang.String, enabled: scala.Boolean): js.Promise[_] = js.native
  /* telemetry functions */
  /**
    * Submits a custom ping to the Telemetry back-end. See `submitExternalPing` inside TelemetryController.jsm for
    * more details.
    * @param type The type of the ping.
    * @param message The data payload for the ping.
    * @param options Options object.
    */
  def submitPing(`type`: java.lang.String, message: js.Any, options: Anon_AddClientId): js.Promise[_] = js.native
}

