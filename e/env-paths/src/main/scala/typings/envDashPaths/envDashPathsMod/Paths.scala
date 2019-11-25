package typings.envDashPaths.envDashPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  /**
  		Directory for non-essential data files.
  		*/
  val cache: String
  /**
  		Directory for data files.
  		*/
  val config: String
  /**
  		Directory for data files.
  		*/
  val data: String
  /**
  		Directory for log files.
  		*/
  val log: String
  /**
  		Directory for temporary files.
  		*/
  val temp: String
}

object Paths {
  @scala.inline
  def apply(cache: String, config: String, data: String, log: String, temp: String): Paths = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Paths]
  }
}

