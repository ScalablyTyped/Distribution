package typings
package emissaryLib.emissaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISubscription extends IEmitter {
  var cancelled: scala.Boolean
  def off(): js.Any
}

