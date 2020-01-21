package typings.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.__IoCallbackArgs.html
  *
  *
  */
@JSGlobal("dojo.main.__IoCallbackArgs")
@js.native
class IoCallbackArgs () extends js.Object {
  /**
    * the original object argument to the IO call.
    *
    */
  var args: js.Object = js.native
  /**
    * For dojo/io/script calls only, indicates
    * whether the script tag that represents the
    * request can be deleted after callbacks have
    * been called. Used internally to know when
    * cleanup can happen on JSONP-type requests.
    *
    */
  var canDelete: Boolean = js.native
  /**
    * The final indicator on how the response will be
    * handled.
    *
    */
  var handleAs: String = js.native
  /**
    * For dojo/io/script calls only, the internal
    * script ID used for the request.
    *
    */
  var id: String = js.native
  /**
    * For dojo/io/script calls only: holds the JSON
    * response for JSONP-type requests. Used
    * internally to hold on to the JSON responses.
    * You should not need to access it directly --
    * the same object should be passed to the success
    * callbacks directly.
    *
    */
  var json: js.Object = js.native
  /**
    * For non-GET requests, the
    * name1=value1&name2=value2 parameters sent up in
    * the request.
    *
    */
  var query: String = js.native
  /**
    * The final URL used for the call. Many times it
    * will be different than the original args.url
    * value.
    *
    */
  var url: String = js.native
  /**
    * For XMLHttpRequest calls only, the
    * XMLHttpRequest object that was used for the
    * request.
    *
    */
  var xhr: js.Object = js.native
}

