package typings.dirCompare

import typings.dirCompare.extOptionsMod.ExtOptions
import typings.dirCompare.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryComparatorMod {
  
  object EntryComparator {
    
    @JSImport("dir-compare/build/src/Entry/EntryComparator", "EntryComparator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compareEntry(a: Entry, b: Entry, options: ExtOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareEntry")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
