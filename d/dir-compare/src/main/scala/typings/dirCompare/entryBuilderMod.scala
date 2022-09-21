package typings.dirCompare

import typings.dirCompare.extOptionsMod.ExtOptions
import typings.dirCompare.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryBuilderMod {
  
  object EntryBuilder {
    
    @JSImport("dir-compare/build/src/Entry/EntryBuilder", "EntryBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the sorted list of entries in a directory.
      */
    inline def buildDirEntries(rootEntry: Entry, dirEntries: js.Array[String], relativePath: String, options: ExtOptions): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDirEntries")(rootEntry.asInstanceOf[js.Any], dirEntries.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
    
    inline def buildEntry(absolutePath: String, path: String, name: String, options: ExtOptions): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEntry")(absolutePath.asInstanceOf[js.Any], path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Entry]
  }
}
