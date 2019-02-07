package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Segment")
@js.native
object SegmentNs extends js.Object {
  def alias(newId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def alias(newId: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[scala.Boolean] = js.native
  def flush(): scala.Unit = js.native
  def getEnabledAsync(): scala.Unit = js.native
  def identify(userId: java.lang.String): scala.Unit = js.native
  def identifyWithTraits(userId: java.lang.String, traits: js.Object): scala.Unit = js.native
  def initialize(keys: expoLib.Anon_AndroidWriteKey): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def screen(screenName: java.lang.String): scala.Unit = js.native
  def screenWithProperties(screenName: java.lang.String, properties: js.Object): scala.Unit = js.native
  def setEnabledAsync(enabled: scala.Boolean): scala.Unit = js.native
  def track(event: java.lang.String): scala.Unit = js.native
  def trackWithProperties(event: java.lang.String, properties: js.Object): scala.Unit = js.native
}

