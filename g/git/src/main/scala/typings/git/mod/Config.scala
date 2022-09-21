package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Config")
@js.native
open class Config protected () extends StObject {
  def this(repo: Any) = this()
  
  var data: Any = js.native
  
  def fetch(key: Any, defaultValue: Any): Any = js.native
  
  var repo: Any = js.native
  
  def set(key: Any, value: Any, callback: js.Function): Unit = js.native
}
