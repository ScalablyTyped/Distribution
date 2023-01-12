package typings.fsTreeDiff

import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntryMod {
  
  @JSImport("fs-tree-diff/lib/entry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Entry {
    def this(relativePath: String) = this()
    def this(relativePath: String, size: Double) = this()
    def this(relativePath: String, size: Double, mtime: js.Date) = this()
    def this(relativePath: String, size: Double, mtime: Double) = this()
    def this(relativePath: String, size: Unit, mtime: js.Date) = this()
    def this(relativePath: String, size: Unit, mtime: Double) = this()
    def this(relativePath: String, size: Double, mtime: js.Date, mode: Double) = this()
    def this(relativePath: String, size: Double, mtime: Double, mode: Double) = this()
    def this(relativePath: String, size: Double, mtime: Unit, mode: Double) = this()
    def this(relativePath: String, size: Unit, mtime: js.Date, mode: Double) = this()
    def this(relativePath: String, size: Unit, mtime: Double, mode: Double) = this()
    def this(relativePath: String, size: Unit, mtime: Unit, mode: Double) = this()
    
    /* CompleteClass */
    override def isDirectory(): Boolean = js.native
    
    /* CompleteClass */
    var relativePath: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("fs-tree-diff/lib/entry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStat(relativePath: String, stat: Stats): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStat")(relativePath.asInstanceOf[js.Any], stat.asInstanceOf[js.Any])).asInstanceOf[Entry]
    
    inline def isDirectory(entry: Entry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(entry.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isFile(entry: Entry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(entry.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait BaseEntry extends StObject {
    
    def isDirectory(): Boolean
    
    var relativePath: String
  }
  object BaseEntry {
    
    inline def apply(isDirectory: () => Boolean, relativePath: String): BaseEntry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEntry] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultEntry
    extends StObject
       with BaseEntry {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Double | js.Date] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object DefaultEntry {
    
    inline def apply(isDirectory: () => Boolean, relativePath: String): DefaultEntry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultEntry] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Double | js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Entry
    extends StObject
       with DefaultEntry
  object Entry {
    
    inline def apply(isDirectory: () => Boolean, relativePath: String): Entry = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), relativePath = relativePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
  }
}
