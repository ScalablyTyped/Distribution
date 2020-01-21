package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request.__BaseOptions.html
  *
  *
  */
@JSGlobal("dojo.request.__BaseOptions")
@js.native
class BaseOptions () extends js.Object {
  /**
    * Data to transfer.  This is ignored for GET and DELETE
    * requests.
    *
    */
  var data: String = js.native
  /**
    * How to handle the response from the server.  Default is
    * 'text'.  Other values are 'json', 'javascript', and 'xml'.
    *
    */
  var handleAs: String = js.native
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

