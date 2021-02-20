package typings.diff.mod

import typings.diff.diffStrings.Space
import typings.diff.diffStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyPatchOptions extends StObject {
  
  /**
    * Callback used to compare to given lines to determine if they should be considered equal when patching.
    * Should return `false` if the lines should be rejected.
    *
    * @default strict equality
    */
  var compareLine: js.UndefOr[
    js.Function4[
      /* lineNumber */ Double, 
      /* line */ String, 
      /* operation */ `-_` | Space, 
      /* patchContent */ String, 
      Boolean
    ]
  ] = js.native
  
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.native
}
object ApplyPatchOptions {
  
  @scala.inline
  def apply(): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPatchOptions]
  }
  
  @scala.inline
  implicit class ApplyPatchOptionsMutableBuilder[Self <: ApplyPatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompareLine(
      value: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean
    ): Self = StObject.set(x, "compareLine", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCompareLineUndefined: Self = StObject.set(x, "compareLine", js.undefined)
    
    @scala.inline
    def setFuzzFactor(value: Double): Self = StObject.set(x, "fuzzFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuzzFactorUndefined: Self = StObject.set(x, "fuzzFactor", js.undefined)
  }
}
