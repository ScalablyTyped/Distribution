package typings.emberDashFeatureDashFlags.emberDashFeatureDashFlagsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ember.emberMod.defaultNs.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends Service {
  def disable(feature: String): Unit = js.native
  def enable(feature: String): Unit = js.native
  def isEnabled(feature: String): Boolean = js.native
  def setup(features: StringDictionary[Boolean]): Unit = js.native
}

