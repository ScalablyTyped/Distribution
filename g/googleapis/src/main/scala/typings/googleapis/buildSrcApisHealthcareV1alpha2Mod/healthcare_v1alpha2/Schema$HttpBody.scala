package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message that represents an arbitrary HTTP body. It should only be used for
  * payload formats that can&#39;t be represented as JSON, such as raw binary
  * or an HTML page.   This message can be used both in streaming and
  * non-streaming API methods in the request as well as the response.  It can
  * be used as a top-level request field, which is convenient if one wants to
  * extract parameters from either the URL or HTTP template into the request
  * fields and also want access to the raw HTTP body.  Example:      message
  * GetResourceRequest {       // A unique request id.       string request_id
  * = 1;        // The raw HTTP body is bound to this field.
  * google.api.HttpBody http_body = 2;     }      service ResourceService { rpc
  * GetResource(GetResourceRequest) returns (google.api.HttpBody);       rpc
  * UpdateResource(google.api.HttpBody) returns (google.protobuf.Empty);     }
  * Example with streaming methods:      service CaldavService {       rpc
  * GetCalendar(stream google.api.HttpBody)         returns (stream
  * google.api.HttpBody);       rpc UpdateCalendar(stream google.api.HttpBody)
  * returns (stream google.api.HttpBody);     }  Use of this type only changes
  * how the request and response bodies are handled, all other features will
  * continue to work unchanged.
  */
@js.native
trait Schema$HttpBody extends js.Object {
  /**
    * The HTTP Content-Type header value specifying the content type of the
    * body.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The HTTP request/response body as raw binary.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Application specific response metadata. Must be set in the first response
    * for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object Schema$HttpBody {
  @scala.inline
  def apply(contentType: String = null, data: String = null, extensions: js.Array[StringDictionary[_]] = null): Schema$HttpBody = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpBody]
  }
}

