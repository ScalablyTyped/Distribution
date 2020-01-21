package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object io {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/httpParse.html
    *
    * Parses an HTTP stream for a message.
    *
    * @param httpStream HTTP stream to parse
    * @param topHeaders       OptionalExtra header information to add to each HTTP request (kind of HTTP inheritance)
    * @param partial       OptionalA true value indicates that the stream may not be finished, it may end arbitrarily in mid stream.The last XHR object will have a special property _lastIndex that indicates the how far alongthe httpStream could be successfully parsed into HTTP messages.
    */
  type httpParse = js.Function3[
    /* httpStream */ java.lang.String, 
    /* topHeaders */ js.UndefOr[java.lang.String], 
    /* partial */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type scriptFrame = typings.dojo.dojox.io.scriptFrame_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/xhrMultiPart.html
    *
    *
    * @param args
    */
  type xhrMultiPart = js.Function1[/* args */ js.Object, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/xhrScriptPlugin.html
    *
    * Adds the script transport (JSONP) as an XHR plugin for the given site. See
    * dojox.io.script for more information on the transport. Note, that JSONP
    * is not a secure transport, by loading data from a third-party site using JSONP
    * the site has full access to your JavaScript environment.
    *
    * @param url Url prefix of the site which can handle JSONP requests.
    * @param callbackParamName
    * @param httpAdapter       OptionalThis allows for adapting HTTP requests that could not otherwise besent with JSONP, so you can use a convention for headers and PUT/DELETE methods.
    */
  type xhrScriptPlugin = js.Function3[
    /* url */ java.lang.String, 
    /* callbackParamName */ java.lang.String, 
    /* httpAdapter */ js.UndefOr[js.Function], 
    scala.Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/xhrWindowNamePlugin.html
    *
    * Adds the windowName transport as an XHR plugin for the given site. See
    * dojox.io.windowName for more information on the transport.
    *
    * @param url Url prefix of the site which can handle windowName requests.
    * @param httpAdapter       OptionalThis allows for adapting HTTP requests that could not otherwise besent with window.name, so you can use a convention for headers and PUT/DELETE methods.
    * @param trusted       Optional
    */
  type xhrWindowNamePlugin = js.Function3[
    /* url */ java.lang.String, 
    /* httpAdapter */ js.UndefOr[js.Function], 
    /* trusted */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
}
