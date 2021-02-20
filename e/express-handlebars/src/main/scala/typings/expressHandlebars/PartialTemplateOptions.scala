package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialTemplateOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var precompiled: js.UndefOr[Boolean] = js.native
}
object PartialTemplateOptions {
  
  @scala.inline
  def apply(): PartialTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplateOptions]
  }
  
  @scala.inline
  implicit class PartialTemplateOptionsMutableBuilder[Self <: PartialTemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setPrecompiled(value: Boolean): Self = StObject.set(x, "precompiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecompiledUndefined: Self = StObject.set(x, "precompiled", js.undefined)
  }
}
