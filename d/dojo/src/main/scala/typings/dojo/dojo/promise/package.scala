package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promise {
  type Callback[T, U] = js.Function1[/* arg */ T, U | typings.dojo.dojo.promise.Thenable[U]]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/instrumentation.html
    *
    * Initialize instrumentation for the Deferred class.
    * Initialize instrumentation for the Deferred class.
    * Done automatically by dojo/Deferred if the
    * deferredInstrumentation and useDeferredInstrumentation
    * config options are set.
    *
    * Sets up dojo/promise/tracer to log to the console.
    *
    * Sets up instrumentation of rejected deferreds so unhandled
    * errors are logged to the console.
    *
    * @param Deferred
    */
  type instrumentation = js.Function1[/* Deferred */ js.Any, scala.Unit]
}
