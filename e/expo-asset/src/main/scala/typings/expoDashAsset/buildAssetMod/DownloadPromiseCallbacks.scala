package typings.expoDashAsset.buildAssetMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPromiseCallbacks extends js.Object {
  def reject(error: Error): Unit
  def resolve(): Unit
}

object DownloadPromiseCallbacks {
  @scala.inline
  def apply(reject: Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
  
    __obj.asInstanceOf[DownloadPromiseCallbacks]
  }
}

