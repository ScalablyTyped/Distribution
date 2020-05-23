package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLog extends js.Object {
  /** App Engine release version. */
  var appEngineRelease: js.UndefOr[String] = js.undefined
  /** Application that handled this request. */
  var appId: js.UndefOr[String] = js.undefined
  /** An indication of the relative cost of serving this request. */
  var cost: js.UndefOr[Double] = js.undefined
  /** Time when the request finished. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Whether this request is finished or active. */
  var finished: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this is the first RequestLog entry for this request. If an active request has several RequestLog entries written to Stackdriver Logging, then
    * this field will be set for one of them.
    */
  var first: js.UndefOr[Boolean] = js.undefined
  /** Internet host and port number of the resource being requested. */
  var host: js.UndefOr[String] = js.undefined
  /** HTTP version of request. Example: "HTTP/1.1". */
  var httpVersion: js.UndefOr[String] = js.undefined
  /** An identifier for the instance that handled the request. */
  var instanceId: js.UndefOr[String] = js.undefined
  /**
    * If the instance processing this request belongs to a manually scaled module, then this is the 0-based index of the instance. Otherwise, this value is
    * -1.
    */
  var instanceIndex: js.UndefOr[Double] = js.undefined
  /** Origin IP address. */
  var ip: js.UndefOr[String] = js.undefined
  /** Latency of the request. */
  var latency: js.UndefOr[String] = js.undefined
  /** A list of log lines emitted by the application while serving this request. */
  var line: js.UndefOr[js.Array[LogLine]] = js.undefined
  /** Number of CPU megacycles used to process request. */
  var megaCycles: js.UndefOr[String] = js.undefined
  /** Request method. Example: "GET", "HEAD", "PUT", "POST", "DELETE". */
  var method: js.UndefOr[String] = js.undefined
  /** Module of the application that handled this request. */
  var moduleId: js.UndefOr[String] = js.undefined
  /**
    * The logged-in user who made the request.Most likely, this is the part of the user's email before the @ sign. The field value is the same for different
    * requests from the same user, but different users can have similar names. This information is also available to the application via the App Engine Users
    * API.This field will be populated starting with App Engine 1.9.21.
    */
  var nickname: js.UndefOr[String] = js.undefined
  /** Time this request spent in the pending request queue. */
  var pendingTime: js.UndefOr[String] = js.undefined
  /** Referrer URL of request. */
  var referrer: js.UndefOr[String] = js.undefined
  /**
    * Globally unique identifier for a request, which is based on the request start time. Request IDs for requests which started later will compare greater
    * as strings than those for requests which started earlier.
    */
  var requestId: js.UndefOr[String] = js.undefined
  /**
    * Contains the path and query portion of the URL that was requested. For example, if the URL was "http://example.com/app?name=val", the resource would be
    * "/app?name=val". The fragment identifier, which is identified by the # character, is not included.
    */
  var resource: js.UndefOr[String] = js.undefined
  /** Size in bytes sent back to client by request. */
  var responseSize: js.UndefOr[String] = js.undefined
  /**
    * Source code for the application that handled this request. There can be more than one source reference per deployed application if source code is
    * distributed among multiple repositories.
    */
  var sourceReference: js.UndefOr[js.Array[SourceReference]] = js.undefined
  /** Time when the request started. */
  var startTime: js.UndefOr[String] = js.undefined
  /** HTTP response status code. Example: 200, 404. */
  var status: js.UndefOr[Double] = js.undefined
  /** Task name of the request, in the case of an offline request. */
  var taskName: js.UndefOr[String] = js.undefined
  /** Queue name of the request, in the case of an offline request. */
  var taskQueueName: js.UndefOr[String] = js.undefined
  /** Stackdriver Trace identifier for this request. */
  var traceId: js.UndefOr[String] = js.undefined
  /** File or class that handled the request. */
  var urlMapEntry: js.UndefOr[String] = js.undefined
  /** User agent that made the request. */
  var userAgent: js.UndefOr[String] = js.undefined
  /** Version of the application that handled this request. */
  var versionId: js.UndefOr[String] = js.undefined
  /** Whether this was a loading request for the instance. */
  var wasLoadingRequest: js.UndefOr[Boolean] = js.undefined
}

object RequestLog {
  @scala.inline
  def apply(
    appEngineRelease: String = null,
    appId: String = null,
    cost: js.UndefOr[Double] = js.undefined,
    endTime: String = null,
    finished: js.UndefOr[Boolean] = js.undefined,
    first: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    httpVersion: String = null,
    instanceId: String = null,
    instanceIndex: js.UndefOr[Double] = js.undefined,
    ip: String = null,
    latency: String = null,
    line: js.Array[LogLine] = null,
    megaCycles: String = null,
    method: String = null,
    moduleId: String = null,
    nickname: String = null,
    pendingTime: String = null,
    referrer: String = null,
    requestId: String = null,
    resource: String = null,
    responseSize: String = null,
    sourceReference: js.Array[SourceReference] = null,
    startTime: String = null,
    status: js.UndefOr[Double] = js.undefined,
    taskName: String = null,
    taskQueueName: String = null,
    traceId: String = null,
    urlMapEntry: String = null,
    userAgent: String = null,
    versionId: String = null,
    wasLoadingRequest: js.UndefOr[Boolean] = js.undefined
  ): RequestLog = {
    val __obj = js.Dynamic.literal()
    if (appEngineRelease != null) __obj.updateDynamic("appEngineRelease")(appEngineRelease.asInstanceOf[js.Any])
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(cost)) __obj.updateDynamic("cost")(cost.get.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(finished)) __obj.updateDynamic("finished")(finished.get.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpVersion != null) __obj.updateDynamic("httpVersion")(httpVersion.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceIndex)) __obj.updateDynamic("instanceIndex")(instanceIndex.get.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (megaCycles != null) __obj.updateDynamic("megaCycles")(megaCycles.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (pendingTime != null) __obj.updateDynamic("pendingTime")(pendingTime.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (responseSize != null) __obj.updateDynamic("responseSize")(responseSize.asInstanceOf[js.Any])
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (taskName != null) __obj.updateDynamic("taskName")(taskName.asInstanceOf[js.Any])
    if (taskQueueName != null) __obj.updateDynamic("taskQueueName")(taskQueueName.asInstanceOf[js.Any])
    if (traceId != null) __obj.updateDynamic("traceId")(traceId.asInstanceOf[js.Any])
    if (urlMapEntry != null) __obj.updateDynamic("urlMapEntry")(urlMapEntry.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    if (!js.isUndefined(wasLoadingRequest)) __obj.updateDynamic("wasLoadingRequest")(wasLoadingRequest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLog]
  }
}

