package typings.fastGlob

import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.streamMod.Readable
import typings.nodelibFsScandir.anon.Typeoflstat
import typings.nodelibFsScandir.anon.Typeofreaddir
import typings.nodelibFsStat.mod.AsyncCallback
import typings.nodelibFsStat.typesMod.Stats
import typings.nodelibFsWalk.settingsMod.Options
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(directory: String): Readable = js.native
    def apply(directory: String, optionsOrSettings: Options): Readable = js.native
    def apply(directory: String, optionsOrSettings: default): Readable = js.native
  }
  
  @js.native
  trait FnCallDirectoryOptionsOrSettings extends StObject {
    
    def apply(directory: String): js.Array[Entry] = js.native
    def apply(directory: String, optionsOrSettings: Options): js.Array[Entry] = js.native
    def apply(directory: String, optionsOrSettings: default): js.Array[Entry] = js.native
  }
  
  @js.native
  trait FnCallPathOptionsOrSettings extends StObject {
    
    def apply(path: String): Stats = js.native
    def apply(path: String, optionsOrSettings: typings.nodelibFsStat.settingsMod.Options): Stats = js.native
    def apply(path: String, optionsOrSettings: typings.nodelibFsStat.settingsMod.default): Stats = js.native
  }
  
  /* Inlined std.Partial<fast-glob.fast-glob/out/types.FileSystemAdapter> */
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[Typeoflstat] = js.undefined
    
    var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, typings.node.fsMod.Stats]] = js.undefined
    
    var readdir: js.UndefOr[Typeofreaddir] = js.undefined
    
    var readdirSync: js.UndefOr[
        js.Function2[
          /* path */ PathLike, 
          /* options */ BaseEncodingOptionswithFiEncoding, 
          js.Array[Dirent]
        ]
      ] = js.undefined
    
    var stat: js.UndefOr[typings.nodelibFsScandir.anon.Typeofstat] = js.undefined
    
    var statSync: js.UndefOr[js.Function1[/* path */ PathLike, typings.node.fsMod.Stats]] = js.undefined
  }
  object PartialFileSystemAdapter {
    
    inline def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    extension [Self <: PartialFileSystemAdapter](x: Self) {
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatSync(value: /* path */ PathLike => typings.node.fsMod.Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: Typeofreaddir): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReaddirSync(value: (/* path */ PathLike, /* options */ BaseEncodingOptionswithFiEncoding) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(value: typings.nodelibFsScandir.anon.Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: /* path */ PathLike => typings.node.fsMod.Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait Typeofstat extends StObject {
    
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(
      path: String,
      optionsOrSettings: typings.nodelibFsStat.settingsMod.Options,
      callback: AsyncCallback
    ): Unit = js.native
    def apply(
      path: String,
      optionsOrSettings: typings.nodelibFsStat.settingsMod.default,
      callback: AsyncCallback
    ): Unit = js.native
  }
}
