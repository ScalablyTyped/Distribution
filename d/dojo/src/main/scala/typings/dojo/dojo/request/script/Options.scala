package typings.dojo.dojo.request.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.__Options.html
  *
  *
  */
@JSGlobal("dojo.request.script.__Options")
@js.native
class Options () extends js.Object {
  /**
    * A string of JavaScript that when evaluated like so:
    * "typeof(" + checkString + ") != 'undefined'"
    * being true means that the script fetched has been loaded.
    * Do not use this if doing a JSONP type of call (use jsonp instead).
    *
    */
  var checkString: String = js.native
  /**dojo
    * Data to transfer.  This is ignored for GET and DELETE
    * requests.
    *
    */
  var data: String = js.native
  /**
    * The Document object of a child iframe. If this is passed in, the script
    * will be attached to that document. This can be helpful in some comet long-polling
    * scenarios with Firefox and Opera.
    *
    */
  var frameDoc: js.Object = js.native
  /**
    * How to handle the response from the server.  Default is
    * 'text'.  Other values are 'json', 'javascript', and 'xml'.
    *
    */
  var handleAs: String = js.native
  /**
    * The URL parameter name that indicates the JSONP callback string.
    * For instance, when using Yahoo JSONP calls it is normally,
    * jsonp: "callback". For AOL JSONP calls it is normally
    * jsonp: "c".
    *
    */
  var jsonp: String = js.native
  /**
    * This option is ignored. All requests using this transport are
    * GET requests.
    *
    */
  var method: String = js.native
  /**
    * Whether to append a cache-busting parameter to the URL.
    *
    */
  var preventCache: Boolean = js.native
  /**
    * Query parameters to append to the URL.
    *
    */
  var query: String = js.native
  /**
    * Milliseconds to wait for the response.  If this time
    * passes, the then the promise is rejected.
    *
    */
  var timeout: Double = js.native
}

