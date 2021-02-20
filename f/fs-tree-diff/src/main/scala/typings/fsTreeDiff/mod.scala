package typings.fsTreeDiff

import typings.fsTreeDiff.anon.Entries
import typings.fsTreeDiff.entryMod.BaseEntry
import typings.fsTreeDiff.entryMod.DefaultEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-tree-diff", JSImport.Namespace)
  @js.native
  class ^[T /* <: BaseEntry */] () extends FSTree[T] {
    def this(options: Entries[T]) = this()
  }
  
  /* static member */
  @JSImport("fs-tree-diff", "applyPatch")
  @js.native
  def applyPatch(input: String, output: String, patch: Patch): Unit = js.native
  @JSImport("fs-tree-diff", "applyPatch")
  @js.native
  def applyPatch(input: String, output: String, patch: Patch, _delegate: PatchDelegate): Unit = js.native
  
  /* static member */
  @JSImport("fs-tree-diff", "defaultIsEqual")
  @js.native
  def defaultIsEqual(entryA: DefaultEntry, entryB: DefaultEntry): Boolean = js.native
  
  /* static member */
  @JSImport("fs-tree-diff", "fromEntries")
  @js.native
  def fromEntries[T /* <: BaseEntry */](entries: js.Array[T]): FSTree[T] = js.native
  @JSImport("fs-tree-diff", "fromEntries")
  @js.native
  def fromEntries[T /* <: BaseEntry */](entries: js.Array[T], options: StaticOptions): FSTree[T] = js.native
  
  /* static member */
  @JSImport("fs-tree-diff", "fromPaths")
  @js.native
  def fromPaths(paths: js.Array[String]): FSTree[Entry] = js.native
  @JSImport("fs-tree-diff", "fromPaths")
  @js.native
  def fromPaths(paths: js.Array[String], options: StaticOptions): FSTree[Entry] = js.native
  
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
    
    @scala.inline
    def change: typings.fsTreeDiff.fsTreeDiffStrings.change = "change".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.change]
    
    @scala.inline
    def create: typings.fsTreeDiff.fsTreeDiffStrings.create = "create".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.create]
    
    @scala.inline
    def mkdir: typings.fsTreeDiff.fsTreeDiffStrings.mkdir = "mkdir".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.mkdir]
    
    @scala.inline
    def rmdir: typings.fsTreeDiff.fsTreeDiffStrings.rmdir = "rmdir".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.rmdir]
    
    @scala.inline
    def unlink: typings.fsTreeDiff.fsTreeDiffStrings.unlink = "unlink".asInstanceOf[typings.fsTreeDiff.fsTreeDiffStrings.unlink]
  }
  
  type Operation = (js.Tuple3[Operand, String, DefaultEntry]) | (js.Tuple2[Operand, String])
  
  @js.native
  trait Options extends StObject {
    
    var entries: js.UndefOr[js.Array[BaseEntry]] = js.native
    
    var sortAndExpand: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[BaseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setEntriesVarargs(value: BaseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
  
  type Patch = js.Array[Operation]
  
  @js.native
  trait PatchDelegate extends StObject {
    
    var change: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.native
    
    var create: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.native
    
    var mkdir: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.native
    
    var rmdir: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.native
    
    var unlink: js.UndefOr[
        js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
      ] = js.native
  }
  object PatchDelegate {
    
    @scala.inline
    def apply(): PatchDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatchDelegate]
    }
    
    @scala.inline
    implicit class PatchDelegateMutableBuilder[Self <: PatchDelegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCreate(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setMkdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "mkdir", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMkdirUndefined: Self = StObject.set(x, "mkdir", js.undefined)
      
      @scala.inline
      def setRmdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "rmdir", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRmdirUndefined: Self = StObject.set(x, "rmdir", js.undefined)
      
      @scala.inline
      def setUnlink(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = StObject.set(x, "unlink", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
    }
  }
  
  @js.native
  trait StaticOptions extends StObject {
    
    var sortAndExpand: js.UndefOr[Boolean] = js.native
  }
  object StaticOptions {
    
    @scala.inline
    def apply(): StaticOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticOptions]
    }
    
    @scala.inline
    implicit class StaticOptionsMutableBuilder[Self <: StaticOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortAndExpand(value: Boolean): Self = StObject.set(x, "sortAndExpand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAndExpandUndefined: Self = StObject.set(x, "sortAndExpand", js.undefined)
    }
  }
}
