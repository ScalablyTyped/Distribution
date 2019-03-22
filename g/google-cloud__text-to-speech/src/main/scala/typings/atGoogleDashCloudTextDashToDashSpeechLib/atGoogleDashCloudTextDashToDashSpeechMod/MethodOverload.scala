package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodOverload[T, R] extends js.Object {
  def apply(data: T): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, callback: APICallback[R]): scala.Unit = js.native
  def apply(data: T, options: CallOptions): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, options: CallOptions, callback: APICallback[R]): scala.Unit = js.native
}

