package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class allows the developer to write logs to the Google Cloud Platform's Stackdriver Logging service. The following
  * shows some logging examples:
  *
  *     function measuringExecutionTime() {
  *       // A simple INFO log message, using sprintf() formatting.
  *       console.info('Timing the %s function (%d arguments)', 'myFunction', 1);
  *
  *       // Log a JSON object at a DEBUG level. If the object contains a property called "message",
  *       // that is used as the summary in the log viewer, otherwise a stringified version of
  *       // the object is used as the summary.
  *       var parameters = {
  *         isValid: true,
  *         content: 'some string',
  *         timestamp: new Date()
  *       };
  *       console.log(parameters);
  *
  *       var label = 'myFunction() time';  // Labels the timing log entry.
  *       console.time(label);              // Starts the timer.
  *       try {
  *         myFunction(parameters);         // Function to time.
  *       } catch (e) {
  *         // Logs an ERROR message.
  *         console.error('myFunction() yielded an error: ' + e);
  *       }
  *       console.timeEnd(label);      // Stops the timer, logs execution duration.
  *     }
  */
@js.native
trait console extends js.Object {
  def error(): Unit = js.native
  def error(formatOrObject: String, values: js.Any*): Unit = js.native
  def error(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def info(): Unit = js.native
  def info(formatOrObject: String, values: js.Any*): Unit = js.native
  def info(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def log(): Unit = js.native
  def log(formatOrObject: String, values: js.Any*): Unit = js.native
  def log(formatOrObject: js.Object, values: js.Any*): Unit = js.native
  def time(label: String): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  def warn(): Unit = js.native
  def warn(formatOrObject: String, values: js.Any*): Unit = js.native
  def warn(formatOrObject: js.Object, values: js.Any*): Unit = js.native
}

