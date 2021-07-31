package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Config")
@js.native
class Config protected () extends StObject {
  def this(repo: js.Any) = this()
  
  var data: js.Any = js.native
  
  def fetch(key: js.Any, defaultValue: js.Any): js.Any = js.native
  
  var repo: js.Any = js.native
  
  def set(key: js.Any, value: js.Any, callback: js.Function): Unit = js.native
}
