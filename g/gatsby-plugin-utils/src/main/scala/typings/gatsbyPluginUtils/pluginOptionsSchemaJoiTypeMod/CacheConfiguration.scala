package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheConfiguration extends js.Object {
  
  /**
    * Provisions a simple LRU cache for caching simple inputs (`undefined`, `null`, strings, numbers, and booleans).
    */
  def provision(): Unit = js.native
  def provision(options: CacheProvisionOptions): Unit = js.native
}
