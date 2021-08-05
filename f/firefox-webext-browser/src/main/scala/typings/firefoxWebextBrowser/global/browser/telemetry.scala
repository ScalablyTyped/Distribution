package typings.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.telemetry.EventData
import typings.firefoxWebextBrowser.browser.telemetry.ScalarData
import typings.firefoxWebextBrowser.browser.telemetry.SubmitEncryptedPingOptions
import typings.firefoxWebextBrowser.browser.telemetry.SubmitPingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla privileged webextensions.
  *
  * Permissions: `telemetry`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object telemetry {
  
  @JSGlobal("browser.telemetry")
  @js.native
  val ^ : js.Any = js.native
  
  /** Checks if Telemetry upload is enabled. */
  inline def canUpload(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("canUpload")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Adds the value to the given keyed scalar.
    * @param name The scalar name
    * @param key The key name
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  inline def keyedScalarAdd(name: String, key: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarAdd")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sets the keyed scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name.
    * @param key The key name.
    * @param value The value to set the scalar to.
    */
  inline def keyedScalarSet(name: String, key: String, value: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarSet")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def keyedScalarSet(name: String, key: String, value: StringDictionary[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarSet")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def keyedScalarSet(name: String, key: String, value: Boolean): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarSet")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def keyedScalarSet(name: String, key: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarSet")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sets the keyed scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param key The key name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  inline def keyedScalarSetMaximum(name: String, key: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyedScalarSetMaximum")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Record an event in Telemetry. Throws when trying to record an unknown event.
    * @param category The category name.
    * @param method The method name.
    * @param object The object name.
    * @param [value] An optional string value to record.
    * @param [extra] An optional object of the form (string -> string). It should only contain registered extra keys.
    */
  inline def recordEvent(category: String, method: String, `object`: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recordEvent")(category.asInstanceOf[js.Any], method.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def recordEvent(category: String, method: String, `object`: String, value: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recordEvent")(category.asInstanceOf[js.Any], method.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def recordEvent(category: String, method: String, `object`: String, value: String, extra: StringDictionary[String]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recordEvent")(category.asInstanceOf[js.Any], method.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def recordEvent(category: String, method: String, `object`: String, value: Unit, extra: StringDictionary[String]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("recordEvent")(category.asInstanceOf[js.Any], method.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Register new events to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the events are registered in.
    * @param data An object that contains registration data for 1+ events. Each property name is the category name, and the corresponding property value is an object of EventData type.
    */
  inline def registerEvents(category: String, data: StringDictionary[EventData]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEvents")(category.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Register new scalars to record them from addons. See nsITelemetry.idl for more details.
    * @param category The unique category the scalars are registered in.
    * @param data An object that contains registration data for multiple scalars. Each property name is the scalar name, and the corresponding property value is an object of ScalarData type.
    */
  inline def registerScalars(category: String, data: StringDictionary[ScalarData]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerScalars")(category.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Adds the value to the given scalar.
    * @param name The scalar name.
    * @param value The numeric value to add to the scalar. Only unsigned integers supported.
    */
  inline def scalarAdd(name: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarAdd")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sets the named scalar to the given value. Throws if the value type doesn't match the scalar type.
    * @param name The scalar name
    * @param value The value to set the scalar to
    */
  inline def scalarSet(name: String, value: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarSet")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def scalarSet(name: String, value: StringDictionary[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarSet")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def scalarSet(name: String, value: Boolean): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarSet")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def scalarSet(name: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarSet")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Sets the scalar to the maximum of the current and the passed value
    * @param name The scalar name.
    * @param value The numeric value to set the scalar to. Only unsigned integers supported.
    */
  inline def scalarSetMaximum(name: String, value: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarSetMaximum")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Enable recording of events in a category. Events default to recording disabled. This allows to toggle recording for all events in the specified category.
    * @param category The category name.
    * @param enabled Whether recording is enabled for events in that category.
    */
  inline def setEventRecordingEnabled(category: String, enabled: Boolean): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setEventRecordingEnabled")(category.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Submits a custom ping to the Telemetry back-end, with an encrypted payload. Requires a telemetry entry in the manifest to be used.
    * @param message The data payload for the ping, which will be encrypted.
    * @param options Options object.
    */
  inline def submitEncryptedPing(message: StringDictionary[js.Any], options: SubmitEncryptedPingOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("submitEncryptedPing")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /* telemetry functions */
  /**
    * Submits a custom ping to the Telemetry back-end. See `submitExternalPing` inside TelemetryController.jsm for more details.
    * @param type The type of the ping.
    * @param message The data payload for the ping.
    * @param options Options object.
    */
  inline def submitPing(`type`: String, message: StringDictionary[js.Any], options: SubmitPingOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("submitPing")(`type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
