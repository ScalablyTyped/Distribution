package typings.envPaths.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths extends js.Object {
  /**
  		Directory for non-essential data files.
  		*/
  val cache: String = js.native
  /**
  		Directory for data files.
  		*/
  val config: String = js.native
  /**
  		Directory for data files.
  		*/
  val data: String = js.native
  /**
  		Directory for log files.
  		*/
  val log: String = js.native
  /**
  		Directory for temporary files.
  		*/
  val temp: String = js.native
}

object Paths {
  @scala.inline
  def apply(cache: String, config: String, data: String, log: String, temp: String): Paths = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], temp = temp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  @scala.inline
  implicit class PathsOps[Self <: Paths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemp(value: String): Self = this.set("temp", value.asInstanceOf[js.Any])
  }
  
}

