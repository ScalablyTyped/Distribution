package typings.frctlFractal.mod

import typings.frctlFractal.anon.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FractalConfig extends StObject {
  
  var project: js.UndefOr[Author] = js.native
  
  @JSName("project.author")
  var projectDotauthor: js.UndefOr[String] = js.native
  
  @JSName("project.title")
  var projectDottitle: js.UndefOr[String] = js.native
  
  @JSName("project.version")
  var projectDotversion: js.UndefOr[String] = js.native
}
object FractalConfig {
  
  @scala.inline
  def apply(): FractalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractalConfig]
  }
  
  @scala.inline
  implicit class FractalConfigMutableBuilder[Self <: FractalConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Author): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDotauthor(value: String): Self = StObject.set(x, "project.author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDotauthorUndefined: Self = StObject.set(x, "project.author", js.undefined)
    
    @scala.inline
    def setProjectDottitle(value: String): Self = StObject.set(x, "project.title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDottitleUndefined: Self = StObject.set(x, "project.title", js.undefined)
    
    @scala.inline
    def setProjectDotversion(value: String): Self = StObject.set(x, "project.version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDotversionUndefined: Self = StObject.set(x, "project.version", js.undefined)
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
