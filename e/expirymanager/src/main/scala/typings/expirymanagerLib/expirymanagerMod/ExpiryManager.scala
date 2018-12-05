package typings
package expirymanagerLib.expirymanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expirymanager", "ExpiryManager")
@js.native
class ExpiryManager () extends js.Object {
  def clear(): scala.Unit = js.native
  def expire(keys: Keys, seconds: scala.Double): scala.Unit = js.native
  def extractExpiredKeys(): Keys = js.native
  def extractExpiredKeys(time: scala.Double): Keys = js.native
  def getExpiredKeys(): Keys = js.native
  def getExpiredKeys(time: scala.Double): Keys = js.native
  def getExpiry(key: Key): scala.Double = js.native
  def getKeysByExpiry(expiry: scala.Double): Keys = js.native
  def now(): scala.Double = js.native
  def unexpire(keys: Keys): scala.Unit = js.native
}

