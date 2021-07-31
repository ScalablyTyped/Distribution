package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basepath extends StObject {
  
  var base_path: ExtensionURL
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object Basepath {
  
  @scala.inline
  def apply(base_path: ExtensionURL): Basepath = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basepath]
  }
  
  @scala.inline
  implicit class BasepathMutableBuilder[Self <: Basepath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase_path(value: ExtensionURL): Self = StObject.set(x, "base_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
  }
}
