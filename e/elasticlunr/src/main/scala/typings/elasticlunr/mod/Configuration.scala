package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "Configuration")
@js.native
open class Configuration[T /* <: js.Object */] protected () extends StObject {
  def this(config: String, fields: js.Array[/* keyof T */ String]) = this()
  
  def addAllFields2UserConfig(bool: Bool, expand: Boolean, fields: js.Array[/* keyof T */ String]): Unit = js.native
  
  def buildDefaultConfig(fields: js.Array[/* keyof T */ String]): Unit = js.native
  
  def buildUserConfig(config: SearchConfig[T], fields: js.Array[/* keyof T */ String]): Unit = js.native
  
  def get(): SearchConfig[T] = js.native
  
  def reset(): Unit = js.native
}
