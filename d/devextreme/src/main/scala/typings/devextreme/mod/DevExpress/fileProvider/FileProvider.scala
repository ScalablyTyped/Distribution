package typings.devextreme.mod.DevExpress.fileProvider

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProvider extends js.Object {
  /** @name FileProvider.getItemContent() */
  def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_]
}

object FileProvider {
  @scala.inline
  def apply(getItemContent: js.Array[_] => Promise[_] with JQueryPromise[_]): FileProvider = {
    val __obj = js.Dynamic.literal(getItemContent = js.Any.fromFunction1(getItemContent))
  
    __obj.asInstanceOf[FileProvider]
  }
}

