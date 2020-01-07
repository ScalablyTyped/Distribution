package typings.googleapis.buildSrcGeneratorGeneratorMod

import typings.googleapisDashCommon.buildSrcSchemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/generator/generator", "Generator")
@js.native
/**
  * Generator for generating API endpoints
  * @param options Options for generation
  */
class Generator () extends js.Object {
  def this(options: GeneratorOptions) = this()
  /**
    * Clean a string of comment tags.
    * @param str String to process
    * @return Single line string processed
    */
  var cleanComments: js.Any = js.native
  var env: js.Any = js.native
  var generate: js.Any = js.native
  /**
    * Given a discovery doc, parse it and recursively iterate over the various
    * embedded links.
    */
  var getFragmentsForSchema: js.Any = js.native
  var getPathParams: js.Any = js.native
  var getSafeParamName: js.Any = js.native
  var hasResourceParam: js.Any = js.native
  /**
    * Log output of generator. Works just like console.log.
    */
  var log: js.Any = js.native
  /**
    * Write to the state log, which is used for debugging.
    * @param id DiscoveryRestUrl of the endpoint to log
    * @param message
    */
  var logResult: js.Any = js.native
  /**
    * A multi-line string is turned into one line.
    * @param str String to process
    * @return Single line string processed
    */
  var oneLine: js.Any = js.native
  var options: js.Any = js.native
  /**
    * Add a requests to the rate limited queue.
    * @param opts Options to pass to the default transporter
    */
  var request: js.Any = js.native
  var requestQueue: js.Any = js.native
  var state: js.Any = js.native
  var transporter: js.Any = js.native
  /**
    * Generate API file given discovery URL
    * @param apiDiscoveryUri URL or filename of discovery doc for API
    */
  def generateAPI(apiDiscoveryUrl: String): js.Promise[Unit] = js.native
  /**
    * Generate all APIs and write to files.
    */
  def generateAllAPIs(discoveryUrl: String): js.Promise[Unit] = js.native
  def generateIndex(metadata: js.Array[Schema]): js.Promise[Unit] = js.native
}

