package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheService extends js.Object {
  def getDocumentCache(): Cache
  def getScriptCache(): Cache
  def getUserCache(): Cache
}

object CacheService {
  @scala.inline
  def apply(
    getDocumentCache: js.Function0[Cache],
    getScriptCache: js.Function0[Cache],
    getUserCache: js.Function0[Cache]
  ): CacheService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentCache")(getDocumentCache)
    __obj.updateDynamic("getScriptCache")(getScriptCache)
    __obj.updateDynamic("getUserCache")(getUserCache)
    __obj.asInstanceOf[CacheService]
  }
}

