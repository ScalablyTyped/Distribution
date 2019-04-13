package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait I2cModes extends js.Object {
  var CONTINUOUS_READ: I2C_MODE
  var READ: I2C_MODE
  var STOP_READING: I2C_MODE
  var WRITE: I2C_MODE
}

object I2cModes {
  @scala.inline
  def apply(CONTINUOUS_READ: I2C_MODE, READ: I2C_MODE, STOP_READING: I2C_MODE, WRITE: I2C_MODE): I2cModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ, READ = READ, STOP_READING = STOP_READING, WRITE = WRITE)
  
    __obj.asInstanceOf[I2cModes]
  }
}

