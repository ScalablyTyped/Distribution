package typings.expressDashMinify.ExpressMinifyInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMinifyResponse extends js.Object {
  /**
    * Pass true to disable caching the response data, suitable for dynamic contents.
    */
  var _no_cache: Boolean
  /**
    * Pass true to disable minifying, suitable for already-minified contents.
    */
  var _no_minify: Boolean
  /**
    * Pass true to disable all kind of processing: no compiling, no minifying.
    */
  var _skip: Boolean
  /**
    * Pass an object to specify custom UglifyJS compressor options (pass false to skip).
    */
  var _uglifyCompress: js.Object | Boolean
  /**
    * Pass false to disable mangling names
    */
  var _uglifyMangle: Boolean
  /**
    * Pass an object if you wish to specify additional UglifyJS
    */
  var _uglifyOutput: js.Object
}

object ExpressMinifyResponse {
  @scala.inline
  def apply(
    _no_cache: Boolean,
    _no_minify: Boolean,
    _skip: Boolean,
    _uglifyCompress: js.Object | Boolean,
    _uglifyMangle: Boolean,
    _uglifyOutput: js.Object
  ): ExpressMinifyResponse = {
    val __obj = js.Dynamic.literal(_no_cache = _no_cache, _no_minify = _no_minify, _skip = _skip, _uglifyCompress = _uglifyCompress.asInstanceOf[js.Any], _uglifyMangle = _uglifyMangle, _uglifyOutput = _uglifyOutput)
  
    __obj.asInstanceOf[ExpressMinifyResponse]
  }
}

