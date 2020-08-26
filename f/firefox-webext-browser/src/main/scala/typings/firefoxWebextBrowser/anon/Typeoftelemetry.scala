package typings.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.telemetry.EventData
import typings.firefoxWebextBrowser.browser.telemetry.ScalarData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftelemetry extends js.Object {
  /** Checks if Telemetry upload is enabled. */
  def canUpload(): js.Promise[_] = js.native
  /**
    * Adds the value to the given keyed scalar.
    * @param name The scalar name
    * @param key The key name
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  def keyedScalarAdd(name: String, key: String, value: Double): js.Promise[_] = js.native
  /**
    * Sets the keyed scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name.
    * @param key The key name.
    * @param value The value to set the scalar to.
    */
  def keyedScalarSet(name: String, key: String, value: String): js.Promise[_] = js.native
  def keyedScalarSet(name: String, key: String, value: StringDictionary[js.Any]): js.Promise[_] = js.native
  def keyedScalarSet(name: String, key: String, value: Boolean): js.Promise[_] = js.native
  def keyedScalarSet(name: String, key: String, value: Double): js.Promise[_] = js.native
  /**
    * Sets the keyed scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param key The key name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  def keyedScalarSetMaximum(name: String, key: String, value: Double): js.Promise[_] = js.native
  /**
    * Record an event in Telemetry. Throws when trying to record an unknown event.
    * @param category The category name.
    * @param method The method name.
    * @param object The object name.
    * @param [value] An optional string value to record.
    * @param [extra] An optional object of the form (string -> string). It should only contain registered extra keys.
    */
  def recordEvent(category: String, method: String, `object`: String): js.Promise[_] = js.native
  def recordEvent(
    category: String,
    method: String,
    `object`: String,
    value: js.UndefOr[scala.Nothing],
    extra: StringDictionary[String]
  ): js.Promise[_] = js.native
  def recordEvent(category: String, method: String, `object`: String, value: String): js.Promise[_] = js.native
  def recordEvent(category: String, method: String, `object`: String, value: String, extra: StringDictionary[String]): js.Promise[_] = js.native
  /**
    * Register new events to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the events are registered in.
    * @param data An object that contains registration data for 1+ events. Each property name is the category name,
    *     and the corresponding property value is an object of EventData type.
    */
  def registerEvents(category: String, data: StringDictionary[EventData]): js.Promise[_] = js.native
  /**
    * Register new scalars to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the scalars are registered in.
    * @param data An object that contains registration data for multiple scalars. Each property name is the scalar
    *     name, and the corresponding property value is an object of ScalarData type.
    */
  def registerScalars(category: String, data: StringDictionary[ScalarData]): js.Promise[_] = js.native
  /**
    * Adds the value to the given scalar.
    * @param name The scalar name.
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  def scalarAdd(name: String, value: Double): js.Promise[_] = js.native
  /**
    * Sets the named scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name
    * @param value The value to set the scalar to
    */
  def scalarSet(name: String, value: String): js.Promise[_] = js.native
  def scalarSet(name: String, value: StringDictionary[js.Any]): js.Promise[_] = js.native
  def scalarSet(name: String, value: Boolean): js.Promise[_] = js.native
  def scalarSet(name: String, value: Double): js.Promise[_] = js.native
  /**
    * Sets the scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  def scalarSetMaximum(name: String, value: Double): js.Promise[_] = js.native
  /**
    * Enable recording of events in a category. Events default to recording disabled. This allows to toggle recording
    * for all events in the specified category.
    * @param category The category name.
    * @param enabled Whether recording is enabled for events in that category.
    */
  def setEventRecordingEnabled(category: String, enabled: Boolean): js.Promise[_] = js.native
  /**
    * Submits a custom ping to the Telemetry back-end, with an encrypted payload. Requires a telemetry entry in the
    * manifest to be used.
    * @param message The data payload for the ping, which will be encrypted.
    * @param options Options object.
    */
  def submitEncryptedPing(message: StringDictionary[js.Any], options: SchemaName): js.Promise[_] = js.native
  /* telemetry functions */
  /**
    * Submits a custom ping to the Telemetry back-end. See `submitExternalPing` inside TelemetryController.jsm for
    * more details.
    * @param type The type of the ping.
    * @param message The data payload for the ping.
    * @param options Options object.
    */
  def submitPing(`type`: String, message: StringDictionary[js.Any], options: AddClientId): js.Promise[_] = js.native
}

