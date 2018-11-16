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
  def apply(): stdLib.Promise[stdLib.Response] = js.native
  /**
           * Also callable as fetch(). Use `typeof fetch` in your code to define
           * a field that accepts both `fetch()` and a fetch-mock sandbox.
           */
  def apply(input: java.lang.String): stdLib.Promise[stdLib.Response] = js.native
  /**
           * Also callable as fetch(). Use `typeof fetch` in your code to define
           * a field that accepts both `fetch()` and a fetch-mock sandbox.
           */
  def apply(input: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.Response] = js.native
  /**
           * Also callable as fetch(). Use `typeof fetch` in your code to define
           * a field that accepts both `fetch()` and a fetch-mock sandbox.
           */
  def apply(input: stdLib.Request): stdLib.Promise[stdLib.Response] = js.native
  /**
           * Also callable as fetch(). Use `typeof fetch` in your code to define
           * a field that accepts both `fetch()` and a fetch-mock sandbox.
           */
  def apply(input: stdLib.Request, init: stdLib.RequestInit): stdLib.Promise[stdLib.Response] = js.native
}

