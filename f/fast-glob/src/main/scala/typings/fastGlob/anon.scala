package typings.fastGlob

import typings.node.streamMod.Readable
import typings.nodelibFsScandir.anon.WithFileTypes
import typings.nodelibFsScandir.outTypesMod.Dirent
import typings.nodelibFsScandir.outTypesMod.ErrnoException
import typings.nodelibFsStat.mod.AsyncCallback
import typings.nodelibFsStat.outAdaptersFsMod.StatAsynchronousMethod
import typings.nodelibFsStat.outAdaptersFsMod.StatSynchronousMethod
import typings.nodelibFsStat.outTypesMod.Stats
import typings.nodelibFsWalk.outSettingsMod.Options
import typings.nodelibFsWalk.outSettingsMod.default
import typings.nodelibFsWalk.outTypesMod.Entry
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
    def apply(path: String, optionsOrSettings: typings.nodelibFsStat.outSettingsMod.Options): Stats = js.native
    def apply(path: String, optionsOrSettings: typings.nodelibFsStat.outSettingsMod.default): Stats = js.native
  }
  
  /* Inlined std.Partial<fast-glob.fast-glob/out/types.FileSystemAdapter> */
  trait PartialFileSystemAdapter extends StObject {
    
    var lstat: js.UndefOr[StatAsynchronousMethod] = js.undefined
    
    var lstatSync: js.UndefOr[StatSynchronousMethod] = js.undefined
    
    var readdir: js.UndefOr[
        js.Function3[
          /* filepath */ String, 
          /* options */ WithFileTypes, 
          /* callback */ js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var readdirSync: js.UndefOr[
        js.Function2[/* filepath */ String, /* options */ WithFileTypes, js.Array[Dirent]]
      ] = js.undefined
    
    var stat: js.UndefOr[StatAsynchronousMethod] = js.undefined
    
    var statSync: js.UndefOr[StatSynchronousMethod] = js.undefined
  }
  object PartialFileSystemAdapter {
    
    inline def apply(): PartialFileSystemAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystemAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFileSystemAdapter] (val x: Self) extends AnyVal {
      
      inline def setLstat(
        value: (/* path */ String, /* callback */ js.Function2[
              /* error */ typings.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typings.node.fsMod.Stats, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      inline def setLstatSync(value: /* path */ String => typings.node.fsMod.Stats): Self = StObject.set(x, "lstatSync", js.Any.fromFunction1(value))
      
      inline def setLstatSyncUndefined: Self = StObject.set(x, "lstatSync", js.undefined)
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(
        value: (/* filepath */ String, /* options */ WithFileTypes, /* callback */ js.Function2[/* error */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]) => Unit
      ): Self = StObject.set(x, "readdir", js.Any.fromFunction3(value))
      
      inline def setReaddirSync(value: (/* filepath */ String, /* options */ WithFileTypes) => js.Array[Dirent]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setReaddirSyncUndefined: Self = StObject.set(x, "readdirSync", js.undefined)
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[
              /* error */ typings.nodelibFsStat.outTypesMod.ErrnoException | Null, 
              /* stats */ typings.node.fsMod.Stats, 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      inline def setStatSync(value: /* path */ String => typings.node.fsMod.Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  @js.native
  trait Typeofstat extends StObject {
    
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(
      path: String,
      optionsOrSettings: typings.nodelibFsStat.outSettingsMod.Options,
      callback: AsyncCallback
    ): Unit = js.native
    def apply(
      path: String,
      optionsOrSettings: typings.nodelibFsStat.outSettingsMod.default,
      callback: AsyncCallback
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofwalk extends StObject {
    
    def apply(directory: String, callback: typings.nodelibFsWalk.outProvidersAsyncMod.AsyncCallback): Unit = js.native
    def apply(
      directory: String,
      optionsOrSettings: Options,
      callback: typings.nodelibFsWalk.outProvidersAsyncMod.AsyncCallback
    ): Unit = js.native
    def apply(
      directory: String,
      optionsOrSettings: default,
      callback: typings.nodelibFsWalk.outProvidersAsyncMod.AsyncCallback
    ): Unit = js.native
  }
}
