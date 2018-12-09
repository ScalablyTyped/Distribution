package typings
package dookieLib.dookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dookie", JSImport.Namespace)
@js.native
object dookieModMembers extends js.Object {
  def pull(uri: java.lang.String): js.Promise[_] = js.native
  def pullToStream(uri: java.lang.String, stream: js.Any): js.Promise[_] = js.native
  def push(uri: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def push(uri: java.lang.String, data: js.Any, opts: PushOpts): js.Promise[_] = js.native
}

