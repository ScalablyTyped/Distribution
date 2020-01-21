package typings.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.__IoPublish.html
  *
  * This is a list of IO topics that can be published
  * if djConfig.ioPublish is set to true. IO topics can be
  * published for any Input/Output, network operation. So,
  * dojo.xhr, dojo.io.script and dojo.io.iframe can all
  * trigger these topics to be published.
  *
  */
@JSGlobal("dojo.main.__IoPublish")
@js.native
class IoPublish () extends js.Object {
  /**
    * "/dojo/io/done" is sent whenever an IO request has completed,
    * either by loading or by erroring. It passes the error and
    * the dojo.Deferred for the request with the topic.
    *
    */
  var done: String = js.native
  /**
    * "/dojo/io/error" is sent whenever an IO request has errored.
    * It passes the error and the dojo.Deferred
    * for the request with the topic.
    *
    */
  var error: String = js.native
  /**
    * "/dojo/io/load" is sent whenever an IO request has loaded
    * successfully. It passes the response and the dojo.Deferred
    * for the request with the topic.
    *
    */
  var load: String = js.native
  /**
    * "/dojo/io/send" is sent whenever a new IO request is started.
    * It passes the dojo.Deferred for the request with the topic.
    *
    */
  var send: String = js.native
  /**
    * "/dojo/io/start" is sent when there are no outstanding IO
    * requests, and a new IO request is started. No arguments
    * are passed with this topic.
    *
    */
  var start: String = js.native
  /**
    * "/dojo/io/stop" is sent when all outstanding IO requests have
    * finished. No arguments are passed with this topic.
    *
    */
  var stop: String = js.native
}

