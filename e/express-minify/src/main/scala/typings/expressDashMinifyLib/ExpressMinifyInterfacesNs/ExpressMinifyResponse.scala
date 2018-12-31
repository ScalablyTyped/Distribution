package typings
package expressDashMinifyLib.ExpressMinifyInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMinifyResponse extends js.Object {
  /**
    * Pass true to disable caching the response data, suitable for dynamic contents.
    */
  var _no_cache: scala.Boolean
  /**
    * Pass true to disable minifying, suitable for already-minified contents.
    */
  var _no_minify: scala.Boolean
  /**
    * Pass true to disable all kind of processing: no compiling, no minifying.
    */
  var _skip: scala.Boolean
  /**
    * Pass an object to specify custom UglifyJS compressor options (pass false to skip).
    */
  var _uglifyCompress: js.Object | scala.Boolean
  /**
    * Pass false to disable mangling names
    */
  var _uglifyMangle: scala.Boolean
  /**
    * Pass an object if you wish to specify additional UglifyJS
    */
  var _uglifyOutput: js.Object
}

