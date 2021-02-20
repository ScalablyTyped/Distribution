package typings.fsTreeDiff

import typings.node.fsMod.Stats
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryMod {
  
  @JSImport("fs-tree-diff/lib/entry", JSImport.Default)
  @js.native
  class default protected () extends Entry {
    def this(relativePath: String) = this()
    def this(relativePath: String, size: Double) = this()
    def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Double) = this()
    def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Date) = this()
    def this(relativePath: String, size: Double, mtime: Double) = this()
    def this(relativePath: String, size: Double, mtime: Date) = this()
    def this(
      relativePath: String,
      size: js.UndefOr[scala.Nothing],
      mtime: js.UndefOr[scala.Nothing],
      mode: Double
    ) = this()
    def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Double, mode: Double) = this()
    def this(relativePath: String, size: js.UndefOr[scala.Nothing], mtime: Date, mode: Double) = this()
    def this(relativePath: String, size: Double, mtime: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(relativePath: String, size: Double, mtime: Double, mode: Double) = this()
    def this(relativePath: String, size: Double, mtime: Date, mode: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("fs-tree-diff/lib/entry", "default.fromStat")
    @js.native
    def fromStat(relativePath: String, stat: Stats): Entry = js.native
    
    @JSImport("fs-tree-diff/lib/entry", "default.isDirectory")
    @js.native
    def isDirectory(entry: Entry): Boolean = js.native
    
    @JSImport("fs-tree-diff/lib/entry", "default.isFile")
    @js.native
    def isFile(entry: Entry): Boolean = js.native
  }
  
  @js.native
  trait BaseEntry extends StObject {
    
    def isDirectory(): Boolean = js.native
    
    var relativePath: String = js.native
  }
  object BaseEntry {
    
    @scala.inline
    def apply(isDirectory: () => Boolean, relativePath: String): BaseEntry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEntry]
    }
    
    @scala.inline
    implicit class BaseEntryMutableBuilder[Self <: BaseEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultEntry extends BaseEntry {
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[Double | Date] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object DefaultEntry {
    
    @scala.inline
    def apply(isDirectory: () => Boolean, relativePath: String): DefaultEntry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultEntry]
    }
    
    @scala.inline
    implicit class DefaultEntryMutableBuilder[Self <: DefaultEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: Double | Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Entry extends DefaultEntry
  object Entry {
    
    @scala.inline
    def apply(isDirectory: () => Boolean, relativePath: String): Entry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
  }
}
