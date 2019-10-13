package typings.emberDashFeatureDashFlags

import org.scalablytyped.runtime.StringDictionary
import typings.atEmberObject.atEmberObjectMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-feature-flags", JSImport.Namespace)
@js.native
object emberDashFeatureDashFlagsMod extends js.Object {
  @js.native
  trait Features extends default {
    def disable(feature: String): Unit = js.native
    def enable(feature: String): Unit = js.native
    def isEnabled(feature: String): Boolean = js.native
    def setup(features: StringDictionary[Boolean]): Unit = js.native
  }
  
}

