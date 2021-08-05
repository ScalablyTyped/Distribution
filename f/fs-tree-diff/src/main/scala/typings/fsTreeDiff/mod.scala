package typings.fsTreeDiff

import typings.fsTreeDiff.anon.Entries
import typings.fsTreeDiff.entryMod.BaseEntry
import typings.fsTreeDiff.entryMod.DefaultEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-tree-diff", JSImport.Namespace)
  @js.native
  class ^[T /* <: BaseEntry */] ()
    extends StObject
       with FSTree[T] {
    def this(options: Entries[T]) = this()
  }
  @JSImport("fs-tree-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def applyPatch(input: String, output: String, patch: Patch): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyPatch(input: String, output: String, patch: Patch, _delegate: PatchDelegate): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], _delegate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def defaultIsEqual(entryA: DefaultEntry, entryB: DefaultEntry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsEqual")(entryA.asInstanceOf[js.Any], entryB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromEntries[T /* <: BaseEntry */](entries: js.Array[T]): FSTree[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntries")(entries.asInstanceOf[js.Any]).asInstanceOf[FSTree[T]]
  inline def fromEntries[T /* <: BaseEntry */](entries: js.Array[T], options: StaticOptions): FSTree[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntries")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSTree[T]]
  
  /* static member */
  inline def fromPaths(paths: js.Array[String]): FSTree[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[FSTree[Entry]]
  inline def fromPaths(paths: js.Array[String], options: StaticOptions): FSTree[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSTree[Entry]]
  
  type Entry = DefaultEntry
  
  @js.native
  trait FSTree[T /* <: BaseEntry */] extends StObject {
    
    def addEntries(entries: js.Array[T]): Unit = js.native
    def addEntries(entries: js.Array[T], options: StaticOptions): Unit = js.native
    
    def addPaths(paths: js.Array[String]): Unit = js.native
    def addPaths(paths: js.Array[String], options: StaticOptions): Unit = js.native
    
    def calculateAndApplyPatch(otherFSTree: FSTree[T], input: String, output: String): Unit = js.native
    def calculateAndApplyPatch(otherFSTree: FSTree[T], input: String, output: String, delegate: PatchDelegate): Unit = js.native
    
    def calculatePatch[K /* <: BaseEntry */](theirFSTree: FSTree[K]): Patch = js.native
    def calculatePatch[K /* <: BaseEntry */](theirFSTree: FSTree[K], isEqual: js.Function2[/* a */ T, /* b */ K, Boolean]): Patch = js.native
    
    var entries: js.Array[T] = js.native
    
    def forEach(
      fn: js.Function3[/* entry */ T, /* index */ Double, /* collection */ js.Array[T], Unit],
      context: js.Any
    ): Unit = js.native
    
    val size: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fsTreeDiff.fsTreeDiffStrings.unlink
    - typings.fsTreeDiff.fsTreeDiffStrings.rmdir
    - typings.fsTreeDiff.fsTreeDiffStrings.create
    - typings.fsTreeDiff.fsTreeDiffStrings.change
    - typings.fsTreeDiff.fsTreeDiffStrings.mkdir
  */
  trait Operand extends StObject
  object Operand {
    
    inline def change: typings.fsTreeDiff.fsTreeDiffStrings.change = "change".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.change]
    
    inline def create: typings.fsTreeDiff.fsTreeDiffStrings.create = "create".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.create]
    
    inline def mkdir: typings.fsTreeDiff.fsTreeDiffStrings.mkdir = "mkdir".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.mkdir]
    
    inline def rmdir: typings.fsTreeDiff.fsTreeDiffStrings.rmdir = "rmdir".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.rmdir]
    
    inline def unlink: typings.fsTreeDiff.fsTreeDiffStrings.unlink = "unlink".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.unlink]
  }
  
  type Operation = (js.Tuple3[Operand, String, DefaultEntry]) | (js.Tuple2[Operand, String])
  
  trait Options extends StObject {
    
    var entries: js.UndefOr[js.Array[BaseEntry]] = js.undefined
    
    var sortAndExpand: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEntries(value: js.Array[BaseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: BaseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      inline def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
  
  type Patch = js.Array[Operation]
  
  trait PatchDelegate extends StObject {
    
    var change: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.undefined
    
    var create: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.undefined
    
    var mkdir: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.undefined
    
    var rmdir: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.undefined
    
    var unlink: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.undefined
  }
  object PatchDelegate {
    
    inline def apply(): PatchDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchDelegate]
    }
    
    extension [Self <: PatchDelegate](x: Self) {
      
      inline def setChange(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCreate(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setMkdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "mkdir", js.Any.fromFunction3(value))
      
      inline def setMkdirUndefined: Self = StObject.set(x, "mkdir", js.undefined)
      
      inline def setRmdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "rmdir", js.Any.fromFunction3(value))
      
      inline def setRmdirUndefined: Self = StObject.set(x, "rmdir", js.undefined)
      
      inline def setUnlink(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "unlink", js.Any.fromFunction3(value))
      
      inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  trait StaticOptions extends StObject {
    
    var sortAndExpand: js.UndefOr[Boolean] = js.undefined
  }
  object StaticOptions {
    
    inline def apply(): StaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticOptions]
    }
    
    extension [Self <: StaticOptions](x: Self) {
      
      inline def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      inline def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
}
