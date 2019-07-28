package typings.frisby.frisbyMod

import typings.nodeDashFetch.Anon_Href
import typings.nodeDashFetch.Anon_Size
import typings.nodeDashFetch.nodeDashFetchMod.BlobOptions
import typings.nodeDashFetch.nodeDashFetchMod.BlobPart
import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", "nodeFetch")
@js.native
object nodeFetchNs extends js.Object {
  @js.native
  class Blob ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Blob {
    def this(blobParts: js.Array[BlobPart]) = this()
    def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
  }
  
  @js.native
  class Body ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Anon_Size) = this()
  }
  
  @js.native
  class FetchError protected ()
    extends typings.nodeDashFetch.nodeDashFetchMod.FetchError {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: String) = this()
  }
  
  @js.native
  class Headers ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Request {
    def this(input: String) = this()
    def this(input: Anon_Href) = this()
    def this(input: typings.nodeDashFetch.nodeDashFetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: Anon_Href, init: RequestInit) = this()
    def this(input: typings.nodeDashFetch.nodeDashFetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  def default(url: RequestInfo): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
  def default(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
  }
  
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

