package typings.diff.mod

import typings.diff.diffStrings.Space
import typings.diff.diffStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  ] = js.undefined
  
  /**
    * Number of lines that are allowed to differ before rejecting a patch.
    * @default 0
    */
  var fuzzFactor: js.UndefOr[Double] = js.undefined
}
object ApplyPatchOptions {
  
  inline def apply(): ApplyPatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyPatchOptions]
  }
  
  extension [Self <: ApplyPatchOptions](x: Self) {
    
    inline def setCompareLine(
      value: (/* lineNumber */ Double, /* line */ String, /* operation */ `-_` | Space, /* patchContent */ String) => Boolean
    ): Self = StObject.set(x, "compareLine", js.Any.fromFunction4(value))
    
    inline def setCompareLineUndefined: Self = StObject.set(x, "compareLine", js.undefined)
    
    inline def setFuzzFactor(value: Double): Self = StObject.set(x, "fuzzFactor", value.asInstanceOf[js.Any])
    
    inline def setFuzzFactorUndefined: Self = StObject.set(x, "fuzzFactor", js.undefined)
  }
}
