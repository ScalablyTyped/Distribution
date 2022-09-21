package typings.dirCompare

import org.scalablytyped.runtime.StringDictionary
import typings.dirCompare.entryTypeMod.OptionalEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loopDetectorMod {
  
  object LoopDetector {
    
    @JSImport("dir-compare/build/src/Symlink/LoopDetector", "LoopDetector")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cloneSymlinkCache(symlinkCache: SymlinkCache): SymlinkCache = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneSymlinkCache")(symlinkCache.asInstanceOf[js.Any]).asInstanceOf[SymlinkCache]
    
    inline def detectLoop(entry: OptionalEntry, symlinkCache: RootDirSymlinkCache): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLoop")(entry.asInstanceOf[js.Any], symlinkCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def initSymlinkCache(): SymlinkCache = ^.asInstanceOf[js.Dynamic].applyDynamic("initSymlinkCache")().asInstanceOf[SymlinkCache]
    
    inline def updateSymlinkCache(
      symlinkCache: SymlinkCache,
      rootEntry1: OptionalEntry,
      rootEntry2: OptionalEntry,
      loopDetected1: Boolean,
      loopDetected2: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSymlinkCache")(symlinkCache.asInstanceOf[js.Any], rootEntry1.asInstanceOf[js.Any], rootEntry2.asInstanceOf[js.Any], loopDetected1.asInstanceOf[js.Any], loopDetected2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Symlink cache for one of the left or right root directories.
    */
  type RootDirSymlinkCache = /**
    * True if this symlink has already been traversed.
    */
  StringDictionary[Boolean]
  
  trait SymlinkCache extends StObject {
    
    var dir1: RootDirSymlinkCache
    
    var dir2: RootDirSymlinkCache
  }
  object SymlinkCache {
    
    inline def apply(dir1: RootDirSymlinkCache, dir2: RootDirSymlinkCache): SymlinkCache = {
      val __obj = js.Dynamic.literal(dir1 = dir1.asInstanceOf[js.Any], dir2 = dir2.asInstanceOf[js.Any])
      __obj.asInstanceOf[SymlinkCache]
    }
    
    extension [Self <: SymlinkCache](x: Self) {
      
      inline def setDir1(value: RootDirSymlinkCache): Self = StObject.set(x, "dir1", value.asInstanceOf[js.Any])
      
      inline def setDir2(value: RootDirSymlinkCache): Self = StObject.set(x, "dir2", value.asInstanceOf[js.Any])
    }
  }
  
  type SymlinkPath = String
}
