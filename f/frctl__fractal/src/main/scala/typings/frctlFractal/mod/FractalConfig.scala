package typings.frctlFractal.mod

import typings.frctlFractal.anon.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FractalConfig extends StObject {
  
  var project: js.UndefOr[Author] = js.undefined
  
  @JSName("project.author")
  var projectDotauthor: js.UndefOr[String] = js.undefined
  
  @JSName("project.title")
  var projectDottitle: js.UndefOr[String] = js.undefined
  
  @JSName("project.version")
  var projectDotversion: js.UndefOr[String] = js.undefined
}
object FractalConfig {
  
  inline def apply(): FractalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractalConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FractalConfig] (val x: Self) extends AnyVal {
    
    inline def setProject(value: Author): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectDotauthor(value: String): Self = StObject.set(x, "project.author", value.asInstanceOf[js.Any])
    
    inline def setProjectDotauthorUndefined: Self = StObject.set(x, "project.author", js.undefined)
    
    inline def setProjectDottitle(value: String): Self = StObject.set(x, "project.title", value.asInstanceOf[js.Any])
    
    inline def setProjectDottitleUndefined: Self = StObject.set(x, "project.title", js.undefined)
    
    inline def setProjectDotversion(value: String): Self = StObject.set(x, "project.version", value.asInstanceOf[js.Any])
    
    inline def setProjectDotversionUndefined: Self = StObject.set(x, "project.version", js.undefined)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
