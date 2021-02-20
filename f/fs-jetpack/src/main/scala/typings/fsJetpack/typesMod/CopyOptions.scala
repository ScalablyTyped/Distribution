package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var matching: js.UndefOr[String | js.Array[String]] = js.native
  
  var overwrite: js.UndefOr[Boolean | OverwriteFunction] = js.native
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsMutableBuilder[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setMatching(value: String | js.Array[String]): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
    
    @scala.inline
    def setMatchingVarargs(value: String*): Self = StObject.set(x, "matching", js.Array(value :_*))
    
    @scala.inline
    def setOverwrite(value: Boolean | OverwriteFunction): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteFunction2(
      value: (/* srcInspectData */ InspectResult, /* destInspectData */ InspectResult) => Boolean | js.Promise[Boolean]
    ): Self = StObject.set(x, "overwrite", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
