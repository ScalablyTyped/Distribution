package typings
package fetchDashMockLib.fetchDashMockMod.fetchMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMockSandbox extends FetchMockStatic {
  /**
    * Also callable as fetch(). Use `typeof fetch` in your code to define
    * a field that accepts both `fetch()` and a fetch-mock sandbox.
    */
  def apply(): js.Promise[stdLib.Response] = js.native
  def apply(input: java.lang.String): js.Promise[stdLib.Response] = js.native
  def apply(input: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  def apply(input: stdLib.Request): js.Promise[stdLib.Response] = js.native
  def apply(input: stdLib.Request, init: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
}

