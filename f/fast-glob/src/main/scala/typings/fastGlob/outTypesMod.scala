package typings.fastGlob

import typings.nodelibFsWalk.outSettingsMod.Options
import typings.nodelibFsWalk.outTypesMod.Errno
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTypesMod {
  
  type DeepFilterFunction = typings.nodelibFsWalk.outSettingsMod.DeepFilterFunction
  
  type Entry = typings.nodelibFsWalk.outTypesMod.Entry
  
  type EntryFilterFunction = typings.nodelibFsWalk.outSettingsMod.EntryFilterFunction
  
  type EntryItem = String | Entry
  
  type EntryTransformerFunction = js.Function1[/* entry */ Entry, EntryItem]
  
  type ErrnoException = typings.node.NodeJS.ErrnoException
  
  type ErrorFilterFunction = typings.nodelibFsWalk.outSettingsMod.ErrorFilterFunction
  
  type FileSystemAdapter = typings.nodelibFsScandir.outAdaptersFsMod.FileSystemAdapter
  
  trait MicromatchOptions extends StObject {
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    var noext: js.UndefOr[Boolean] = js.undefined
    
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    var posix: js.UndefOr[Boolean] = js.undefined
    
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
  }
  object MicromatchOptions {
    
    inline def apply(): MicromatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicromatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MicromatchOptions] (val x: Self) extends AnyVal {
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
    }
  }
  
  type Pattern = String
  
  type PatternRe = js.RegExp
  
  type PatternsGroup = Record[String, js.Array[Pattern]]
  
  trait ReaderOptions
    extends StObject
       with Options {
    
    @JSName("deepFilter")
    def deepFilter_MReaderOptions(value: typings.nodelibFsWalk.outTypesMod.Entry): Boolean
    @JSName("deepFilter")
    var deepFilter_Original: DeepFilterFunction
    
    @JSName("entryFilter")
    def entryFilter_MReaderOptions(value: typings.nodelibFsWalk.outTypesMod.Entry): Boolean
    @JSName("entryFilter")
    var entryFilter_Original: EntryFilterFunction
    
    @JSName("errorFilter")
    def errorFilter_MReaderOptions(value: Errno): Boolean
    @JSName("errorFilter")
    var errorFilter_Original: ErrorFilterFunction
    
    @JSName("fs")
    var fs_ReaderOptions: FileSystemAdapter
    
    @JSName("stats")
    var stats_ReaderOptions: Boolean
    
    def transform(entry: Entry): EntryItem
  }
  object ReaderOptions {
    
    inline def apply(
      deepFilter: typings.nodelibFsWalk.outTypesMod.Entry => Boolean,
      entryFilter: typings.nodelibFsWalk.outTypesMod.Entry => Boolean,
      errorFilter: Errno => Boolean,
      fs: FileSystemAdapter,
      stats: Boolean,
      transform: Entry => EntryItem
    ): ReaderOptions = {
      val __obj = js.Dynamic.literal(deepFilter = js.Any.fromFunction1(deepFilter), entryFilter = js.Any.fromFunction1(entryFilter), errorFilter = js.Any.fromFunction1(errorFilter), fs = fs.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[ReaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReaderOptions] (val x: Self) extends AnyVal {
      
      inline def setDeepFilter(value: typings.nodelibFsWalk.outTypesMod.Entry => Boolean): Self = StObject.set(x, "deepFilter", js.Any.fromFunction1(value))
      
      inline def setEntryFilter(value: typings.nodelibFsWalk.outTypesMod.Entry => Boolean): Self = StObject.set(x, "entryFilter", js.Any.fromFunction1(value))
      
      inline def setErrorFilter(value: Errno => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      inline def setFs(value: FileSystemAdapter): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Entry => EntryItem): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
}
