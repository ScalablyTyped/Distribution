package typings.folderWalker

import typings.folderWalker.folderWalkerStrings.directory
import typings.folderWalker.folderWalkerStrings.file
import typings.node.fsMod.Stats
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dirs: js.Array[String]): ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].apply(dirs.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Any]]
  inline def apply(dirs: js.Array[String], opts: WalkerOptions): ReadableStream[Any] = (^.asInstanceOf[js.Dynamic].apply(dirs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReadableStream[Any]]
  
  @JSImport("folder-walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Entry extends StObject {
    
    var basename: String
    
    var filepath: String
    
    var relname: String
    
    var root: String
    
    var stat: Stats
    
    var `type`: file | directory
  }
  object Entry {
    
    inline def apply(
      basename: String,
      filepath: String,
      relname: String,
      root: String,
      stat: Stats,
      `type`: file | directory
    ): Entry = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], relname = relname.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setRelname(value: String): Self = StObject.set(x, "relname", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait WalkerOptions extends StObject {
    
    def filter(filename: String): Boolean
    
    var fs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
      ] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
  }
  object WalkerOptions {
    
    inline def apply(filter: String => Boolean): WalkerOptions = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter))
      __obj.asInstanceOf[WalkerOptions]
    }
    
    extension [Self <: WalkerOptions](x: Self) {
      
      inline def setFilter(value: String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
      ): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
    }
  }
}
