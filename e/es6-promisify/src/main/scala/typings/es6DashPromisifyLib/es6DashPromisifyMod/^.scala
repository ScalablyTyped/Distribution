package typings
package es6DashPromisifyLib.es6DashPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-promisify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def promisify(original: CallbackFunction): PromiseFunction = js.native
  def promisify[T, U](original: js.Function2[/* param1 */ U, /* cb */ Callback[T], _]): js.Function1[/* param1 */ U, js.Promise[T]] = js.native
  def promisify[T, U, V](original: js.Function3[/* param1 */ U, /* param2 */ V, /* cb */ Callback[T], _]): js.Function2[/* param1 */ U, /* param2 */ V, js.Promise[T]] = js.native
  def promisify[T, U, V, W](original: js.Function4[/* param1 */ U, /* param2 */ V, /* param3 */ W, /* cb */ Callback[T], _]): js.Function3[/* param1 */ U, /* param2 */ V, /* param3 */ W, js.Promise[T]] = js.native
  @JSName("promisify")
  def promisify_TFunction0[T](original: js.Function1[/* cb */ Callback[T], _]): js.Function0[js.Promise[T]] = js.native
}

