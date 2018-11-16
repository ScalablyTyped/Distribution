package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestLog extends js.Object {
  /** App Engine release version. */
  var appEngineRelease: js.UndefOr[java.lang.String] = js.undefined
  /** Application that handled this request. */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /** An indication of the relative cost of serving this request. */
  var cost: js.UndefOr[scala.Double] = js.undefined
  /** Time when the request finished. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this request is finished or active. */
  var finished: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether this is the first RequestLog entry for this request. If an active request has several RequestLog entries written to Stackdriver Logging, then
               * this field will be set for one of them.
               */
  var first: js.UndefOr[scala.Boolean] = js.undefined
  /** Internet host and port number of the resource being requested. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP version of request. Example: "HTTP/1.1". */
  var httpVersion: js.UndefOr[java.lang.String] = js.undefined
  /** An identifier for the instance that handled the request. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If the instance processing this request belongs to a manually scaled module, then this is the 0-based index of the instance. Otherwise, this value is
               * -1.
               */
  var instanceIndex: js.UndefOr[scala.Double] = js.undefined
  /** Origin IP address. */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  /** Latency of the request. */
  var latency: js.UndefOr[java.lang.String] = js.undefined
  /** A list of log lines emitted by the application while serving this request. */
  var line: js.UndefOr[js.Array[LogLine]] = js.undefined
  /** Number of CPU megacycles used to process request. */
  var megaCycles: js.UndefOr[java.lang.String] = js.undefined
  /** Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE". */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** Module of the application that handled this request. */
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The logged-in user who made the request.Most likely, this is the part of the user's email before the @ sign. The field value is the same for different
               * requests from the same user, but different users can have similar names. This information is also available to the application via the App Engine Users
               * API.This field will be populated starting with App Engine 1.9.21.
               */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /** Time this request spent in the pending request queue. */
  var pendingTime: js.UndefOr[java.lang.String] = js.undefined
  /** Referrer URL of request. */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Globally unique identifier for a request, which is based on the request start time. Request IDs for requests which started later will compare greater
               * as strings than those for requests which started earlier.
               */
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Contains the path and query portion of the URL that was requested. For example, if the URL was "http://example.com/app?name=val", the resource would be
               * "/app?name=val". The fragment identifier, which is identified by the # character, is not included.
               */
  var resource: js.UndefOr[java.lang.String] = js.undefined
  /** Size in bytes sent back to client by request. */
  var responseSize: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Source code for the application that handled this request. There can be more than one source reference per deployed application if source code is
               * distributed among multiple repositories.
               */
  var sourceReference: js.UndefOr[js.Array[SourceReference]] = js.undefined
  /** Time when the request started. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** HTTP response status code. Example: 200, 404. */
  var status: js.UndefOr[scala.Double] = js.undefined
  /** Task name of the request, in the case of an offline request. */
  var taskName: js.UndefOr[java.lang.String] = js.undefined
  /** Queue name of the request, in the case of an offline request. */
  var taskQueueName: js.UndefOr[java.lang.String] = js.undefined
  /** Stackdriver Trace identifier for this request. */
  var traceId: js.UndefOr[java.lang.String] = js.undefined
  /** File or class that handled the request. */
  var urlMapEntry: js.UndefOr[java.lang.String] = js.undefined
  /** User agent that made the request. */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the application that handled this request. */
  var versionId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this was a loading request for the instance. */
  var wasLoadingRequest: js.UndefOr[scala.Boolean] = js.undefined
}

