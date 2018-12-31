package typings
package expressDashMinifyLib.ExpressMinifyInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMinifyOptions extends js.Object {
  /**
    * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
    */
  var cache: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Matches CoffeeScript content-type.
    */
  var coffee_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Matches CSS content-type.
    */
  var css_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Customize cssmin instance (require('cssmin')).
    */
  var cssmin: js.UndefOr[nodeLib.NodeRequire] = js.undefined
  /**
    * Matches JavaScript content-type.
    */
  var js_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Matches JSON content-type.
    */
  var json_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Matches LESS content-type.
    */
  var less_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  /**
    * Matches SASS content-type.
    */
  var sass_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Matches Stylus content-type.
    */
  var stylus_match: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * Customize UglifyJS instance (require('uglify-js')).
    */
  var uglifyJS: js.UndefOr[nodeLib.NodeRequire] = js.undefined
}

