package typings
package envDashPathsLib.envDashPathsMod.envPathsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  val cache: java.lang.String
  val config: java.lang.String
  val data: java.lang.String
  val log: java.lang.String
  val temp: java.lang.String
}

object Paths {
  @scala.inline
  def apply(
    cache: java.lang.String,
    config: java.lang.String,
    data: java.lang.String,
    log: java.lang.String,
    temp: java.lang.String
  ): Paths = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("temp")(temp)
    __obj.asInstanceOf[Paths]
  }
}

