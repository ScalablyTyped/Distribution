package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomStore extends Store {
  /** Deletes data from the cache. Takes effect only if the cacheRawData option is true. */
  def clearRawDataCache(): Unit = js.native
}

