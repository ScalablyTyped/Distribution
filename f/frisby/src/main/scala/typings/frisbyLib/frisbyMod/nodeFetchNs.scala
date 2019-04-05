package typings
package frisbyLib.frisbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", "nodeFetch")
@js.native
object nodeFetchNs extends js.Object {
  @js.native
  class Blob ()
    extends nodeDashFetchLib.nodeDashFetchMod.Blob
  
  @js.native
  class Body ()
    extends nodeDashFetchLib.nodeDashFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: nodeDashFetchLib.Anon_Size) = this()
  }
  
  @js.native
  class FetchError protected ()
    extends nodeDashFetchLib.nodeDashFetchMod.FetchError {
    def this(message: java.lang.String, `type`: java.lang.String) = this()
    def this(message: java.lang.String, `type`: java.lang.String, systemError: java.lang.String) = this()
  }
  
  @js.native
  class Headers ()
    extends nodeDashFetchLib.nodeDashFetchMod.Headers {
    def this(init: nodeDashFetchLib.nodeDashFetchMod.HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends nodeDashFetchLib.nodeDashFetchMod.Request {
    def this(input: java.lang.String) = this()
    def this(input: nodeDashFetchLib.Anon_Href) = this()
    def this(input: nodeDashFetchLib.nodeDashFetchMod.Request) = this()
    def this(input: java.lang.String, init: nodeDashFetchLib.nodeDashFetchMod.RequestInit) = this()
    def this(input: nodeDashFetchLib.Anon_Href, init: nodeDashFetchLib.nodeDashFetchMod.RequestInit) = this()
    def this(input: nodeDashFetchLib.nodeDashFetchMod.Request, init: nodeDashFetchLib.nodeDashFetchMod.RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends nodeDashFetchLib.nodeDashFetchMod.Response {
    def this(body: nodeDashFetchLib.nodeDashFetchMod.BodyInit) = this()
    def this(body: nodeDashFetchLib.nodeDashFetchMod.BodyInit, init: nodeDashFetchLib.nodeDashFetchMod.ResponseInit) = this()
  }
  
  def default(url: java.lang.String): js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response] = js.native
  def default(url: java.lang.String, init: nodeDashFetchLib.nodeDashFetchMod.RequestInit): js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response] = js.native
  def default(url: nodeDashFetchLib.nodeDashFetchMod.Request): js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response] = js.native
  def default(
    url: nodeDashFetchLib.nodeDashFetchMod.Request,
    init: nodeDashFetchLib.nodeDashFetchMod.RequestInit
  ): js.Promise[nodeDashFetchLib.nodeDashFetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): nodeDashFetchLib.nodeDashFetchMod.Response = js.native
    def redirect(url: java.lang.String, status: scala.Double): nodeDashFetchLib.nodeDashFetchMod.Response = js.native
  }
  
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def isRedirect(code: scala.Double): scala.Boolean = js.native
  }
  
}

