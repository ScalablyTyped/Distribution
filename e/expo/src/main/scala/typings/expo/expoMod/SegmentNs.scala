package typings.expo.expoMod

import typings.expo.expoMod.SegmentNs.SegmentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Segment")
@js.native
object SegmentNs extends js.Object {
  trait SegmentOptions extends js.Object {
    var androidWriteKey: js.UndefOr[String] = js.undefined
    var iosWriteKey: js.UndefOr[String] = js.undefined
  }
  
  def alias(newId: String): js.Promise[Boolean] = js.native
  def alias(newId: String, options: js.Object): js.Promise[Boolean] = js.native
  def flush(): Unit = js.native
  def getEnabledAsync(): js.Promise[Boolean] = js.native
  def group(groupId: String): Unit = js.native
  def groupWithTraits(groupId: String, traits: js.Object): Unit = js.native
  def identify(userId: String): Unit = js.native
  def identifyWithTraits(userId: String, traits: js.Object): Unit = js.native
  def initialize(options: SegmentOptions): Unit = js.native
  def reset(): Unit = js.native
  def screen(screenName: String): Unit = js.native
  def screenWithProperties(screenName: String, properties: js.Object): Unit = js.native
  def setEnabledAsync(enabled: Boolean): js.Promise[Unit] = js.native
  def track(event: String): Unit = js.native
  def trackWithProperties(event: String, properties: js.Object): Unit = js.native
}

