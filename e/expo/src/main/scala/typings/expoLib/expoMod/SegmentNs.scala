package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Segment")
@js.native
object SegmentNs extends js.Object {
  trait SegmentOptions extends js.Object {
    var androidWriteKey: js.UndefOr[java.lang.String] = js.undefined
    var iosWriteKey: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def alias(newId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def alias(newId: java.lang.String, options: js.Object): js.Promise[scala.Boolean] = js.native
  def flush(): scala.Unit = js.native
  def getEnabledAsync(): js.Promise[scala.Boolean] = js.native
  def group(groupId: java.lang.String): scala.Unit = js.native
  def groupWithTraits(groupId: java.lang.String, traits: js.Object): scala.Unit = js.native
  def identify(userId: java.lang.String): scala.Unit = js.native
  def identifyWithTraits(userId: java.lang.String, traits: js.Object): scala.Unit = js.native
  def initialize(options: SegmentOptions): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def screen(screenName: java.lang.String): scala.Unit = js.native
  def screenWithProperties(screenName: java.lang.String, properties: js.Object): scala.Unit = js.native
  def setEnabledAsync(enabled: scala.Boolean): js.Promise[scala.Unit] = js.native
  def track(event: java.lang.String): scala.Unit = js.native
  def trackWithProperties(event: java.lang.String, properties: js.Object): scala.Unit = js.native
}

