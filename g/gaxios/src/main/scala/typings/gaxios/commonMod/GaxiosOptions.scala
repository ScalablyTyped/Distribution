package typings.gaxios.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.gaxiosStrings.CONNECT
import typings.gaxios.gaxiosStrings.DELETE
import typings.gaxios.gaxiosStrings.GET
import typings.gaxios.gaxiosStrings.HEAD
import typings.gaxios.gaxiosStrings.OPTIONS
import typings.gaxios.gaxiosStrings.PATCH
import typings.gaxios.gaxiosStrings.POST
import typings.gaxios.gaxiosStrings.PUT
import typings.gaxios.gaxiosStrings.TRACE
import typings.gaxios.gaxiosStrings.arraybuffer
import typings.gaxios.gaxiosStrings.blob
import typings.gaxios.gaxiosStrings.json
import typings.gaxios.gaxiosStrings.stream
import typings.gaxios.gaxiosStrings.text
import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaxiosOptions extends js.Object {
  
  /**
    * Optional method to override making the actual HTTP request. Useful
    * for writing tests.
    */
  var adapter: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* defaultAdapter */ js.Function1[/* options */ this.type, GaxiosPromise[_]], 
      GaxiosPromise[_]
    ]
  ] = js.native
  
  var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
  
  var baseURL: js.UndefOr[String] = js.native
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var follow: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[Headers] = js.native
  
  /**
    * The maximum size of the http response content in bytes allowed.
    */
  var maxContentLength: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of redirects to follow. Defaults to 20.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH] = js.native
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
  
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ StringDictionary[String | Double], String]] = js.native
  
  var responseType: js.UndefOr[arraybuffer | blob | json | text | stream] = js.native
  
  var retry: js.UndefOr[Boolean] = js.native
  
  var retryConfig: js.UndefOr[RetryConfig] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.native
}
object GaxiosOptions {
  
  @scala.inline
  def apply(): GaxiosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaxiosOptions]
  }
  
  @scala.inline
  implicit class GaxiosOptionsOps[Self <: GaxiosOptions] (val x: Self) extends AnyVal {
    
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
    def setAdapter(
      value: (GaxiosOptions, /* defaultAdapter */ js.Function1[GaxiosOptions, GaxiosPromise[_]]) => GaxiosPromise[_]
    ): Self = this.set("adapter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = this.set("agent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMaxContentLength(value: Double): Self = this.set("maxContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxContentLength: Self = this.set("maxContentLength", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = this.set("onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUploadProgress: Self = this.set("onUploadProgress", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParamsSerializer(value: /* params */ StringDictionary[String | Double] => String): Self = this.set("paramsSerializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParamsSerializer: Self = this.set("paramsSerializer", js.undefined)
    
    @scala.inline
    def setResponseType(value: arraybuffer | blob | json | text | stream): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setRetry(value: Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setRetryConfig(value: RetryConfig): Self = this.set("retryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryConfig: Self = this.set("retryConfig", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setValidateStatus(value: /* status */ Double => Boolean): Self = this.set("validateStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
  }
}
