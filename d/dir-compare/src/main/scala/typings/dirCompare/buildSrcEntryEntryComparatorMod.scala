package typings.dirCompare

import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEntryEntryComparatorMod {
  
  object EntryComparator {
    
    @JSImport("dir-compare/build/src/Entry/EntryComparator", "EntryComparator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compareEntry(a: Entry, b: Entry, options: ExtOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareEntry")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
