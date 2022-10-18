package typings.dirCompare

import typings.dirCompare.buildSrcTypesMod.DifferenceType
import typings.dirCompare.buildSrcTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEntryEntryTypeMod {
  
  object EntryType {
    
    @JSImport("dir-compare/build/src/Entry/EntryType", "EntryType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * One of 'missing','file','directory','broken-link'
      */
    inline def getType(entry: OptionalEntry): DifferenceType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(entry.asInstanceOf[js.Any]).asInstanceOf[DifferenceType]
  }
  
  type OptionalEntry = js.UndefOr[Entry]
}
