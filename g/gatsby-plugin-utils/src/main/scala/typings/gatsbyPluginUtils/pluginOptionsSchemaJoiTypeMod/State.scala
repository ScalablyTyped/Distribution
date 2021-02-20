package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var ancestors: js.UndefOr[js.Any] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var localize: js.UndefOr[js.Function1[/* repeated */ js.Any, this.type]] = js.native
  
  var parent: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var reference: js.UndefOr[js.Any] = js.native
}
object State {
  
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAncestors(value: js.Any): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocalize(value: /* repeated */ js.Any => State): Self = StObject.set(x, "localize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReference(value: js.Any): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
