package typings.emberFeatureFlags

import org.scalablytyped.runtime.StringDictionary
import typings.ember.mod.default.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Features extends Service {
    
    def disable(feature: String): Unit = js.native
    
    def enable(feature: String): Unit = js.native
    
    def isEnabled(feature: String): Boolean = js.native
    
    def setup(features: StringDictionary[Boolean]): Unit = js.native
  }
}
