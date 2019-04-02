package typings
package envDashPathsLib.envDashPathsMod.envPathsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  /**
  		Directory for non-essential data files.
  		*/
  val cache: java.lang.String
  /**
  		Directory for data files.
  		*/
  val config: java.lang.String
  /**
  		Directory for data files.
  		*/
  val data: java.lang.String
  /**
  		Directory for log files.
  		*/
  val log: java.lang.String
  /**
  		Directory for temporary files.
  		*/
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
    val __obj = js.Dynamic.literal(cache = cache, config = config, data = data, log = log, temp = temp)
  
    __obj.asInstanceOf[Paths]
  }
}

