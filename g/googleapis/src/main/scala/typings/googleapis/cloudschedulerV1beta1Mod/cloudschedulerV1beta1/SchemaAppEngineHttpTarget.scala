package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine target. The job will be pushed to a job handler by means of an
  * HTTP request via an http_method such as HTTP POST, HTTP GET, etc. The job
  * is acknowledged by means of an HTTP response code in the range [200 - 299].
  * Error 503 is considered an App Engine system error instead of an
  * application error. Requests returning error 503 will be retried regardless
  * of retry configuration and not counted against retry counts. Any other
  * response code, or a failure to receive a response before the deadline,
  * constitutes a failed attempt.
  */
@js.native
trait SchemaAppEngineHttpTarget extends js.Object {
  
  /**
    * App Engine Routing setting for the job.
    */
  var appEngineRouting: js.UndefOr[SchemaAppEngineRouting] = js.native
  
  /**
    * Body.  HTTP request body. A request body is allowed only if the HTTP
    * method is POST or PUT. It will result in invalid argument error to set a
    * body on a job with an incompatible HttpMethod.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * HTTP request headers.  This map contains the header field names and
    * values. Headers can be set when the job is created.  Cloud Scheduler sets
    * some headers to default values:  * `User-Agent`: By default, this header
    * is   `&quot;AppEngine-Google; (+http://code.google.com/appengine)&quot;`.
    * This header can be modified, but Cloud Scheduler will append
    * `&quot;AppEngine-Google; (+http://code.google.com/appengine)&quot;` to
    * the   modified `User-Agent`. * `X-CloudScheduler`: This header will be
    * set to true.  If the job has an body, Cloud Scheduler sets the following
    * headers:  * `Content-Type`: By default, the `Content-Type` header is set
    * to   `&quot;application/octet-stream&quot;`. The default can be
    * overridden by explictly   setting `Content-Type` to a particular media
    * type when the job is   created.   For example, `Content-Type` can be set
    * to `&quot;application/json&quot;`. * `Content-Length`: This is computed
    * by Cloud Scheduler. This value is   output only. It cannot be changed.
    * The headers below are output only. They cannot be set or overridden:  *
    * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google
    * internal use only.  In addition, some App Engine headers, which contain
    * job-specific information, are also be sent to the job handler.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The HTTP method to use for the request. PATCH and OPTIONS are not
    * permitted.
    */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * The relative URI.  The relative URL must begin with &quot;/&quot; and
    * must be a valid HTTP relative URL. It can contain a path, query string
    * arguments, and `#` fragments. If the relative URL is empty, then the root
    * path &quot;/&quot; will be used. No spaces are allowed, and the maximum
    * length allowed is 2083 characters.
    */
  var relativeUri: js.UndefOr[String] = js.native
}
object SchemaAppEngineHttpTarget {
  
  @scala.inline
  def apply(): SchemaAppEngineHttpTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineHttpTarget]
  }
  
  @scala.inline
  implicit class SchemaAppEngineHttpTargetOps[Self <: SchemaAppEngineHttpTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppEngineRouting(value: SchemaAppEngineRouting): Self = this.set("appEngineRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineRouting: Self = this.set("appEngineRouting", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setRelativeUri(value: String): Self = this.set("relativeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeUri: Self = this.set("relativeUri", js.undefined)
  }
}
