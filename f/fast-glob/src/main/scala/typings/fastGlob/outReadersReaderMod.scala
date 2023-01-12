package typings.fastGlob

import typings.fastGlob.outTypesMod.Entry
import typings.fastGlob.outTypesMod.ErrnoException
import typings.fastGlob.outTypesMod.Pattern
import typings.fastGlob.outTypesMod.ReaderOptions
import typings.node.fsMod.Stats
import typings.nodelibFsStat.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outReadersReaderMod {
  
  /* note: abstract class */ @JSImport("fast-glob/out/readers/reader", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Reader[T] {
    def this(_settings: typings.fastGlob.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _fsStatSettings: Settings = js.native
    
    /* protected */ /* CompleteClass */
    override def _getFullEntryPath(filepath: String): String = js.native
    
    /* protected */ /* CompleteClass */
    override def _isFatalError(error: ErrnoException): Boolean = js.native
    
    /* protected */ /* CompleteClass */
    override def _makeEntry(stats: Stats, pattern: Pattern): Entry = js.native
    
    /* protected */ /* CompleteClass */
    override val _settings: typings.fastGlob.outSettingsMod.default = js.native
    
    /* CompleteClass */
    override def dynamic(root: String, options: ReaderOptions): T = js.native
    
    /* CompleteClass */
    override def static(patterns: js.Array[Pattern], options: ReaderOptions): T = js.native
  }
  
  trait Reader[T] extends StObject {
    
    /* protected */ val _fsStatSettings: Settings
    
    /* protected */ def _getFullEntryPath(filepath: String): String
    
    /* protected */ def _isFatalError(error: ErrnoException): Boolean
    
    /* protected */ def _makeEntry(stats: Stats, pattern: Pattern): Entry
    
    /* protected */ val _settings: typings.fastGlob.outSettingsMod.default
    
    def dynamic(root: String, options: ReaderOptions): T
    
    def static(patterns: js.Array[Pattern], options: ReaderOptions): T
  }
  object Reader {
    
    inline def apply[T](
      _fsStatSettings: Settings,
      _getFullEntryPath: String => String,
      _isFatalError: ErrnoException => Boolean,
      _makeEntry: (Stats, Pattern) => Entry,
      _settings: typings.fastGlob.outSettingsMod.default,
      dynamic: (String, ReaderOptions) => T,
      static: (js.Array[Pattern], ReaderOptions) => T
    ): Reader[T] = {
      val __obj = js.Dynamic.literal(_fsStatSettings = _fsStatSettings.asInstanceOf[js.Any], _getFullEntryPath = js.Any.fromFunction1(_getFullEntryPath), _isFatalError = js.Any.fromFunction1(_isFatalError), _makeEntry = js.Any.fromFunction2(_makeEntry), _settings = _settings.asInstanceOf[js.Any], dynamic = js.Any.fromFunction2(dynamic), static = js.Any.fromFunction2(static))
      __obj.asInstanceOf[Reader[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reader[?], T] (val x: Self & Reader[T]) extends AnyVal {
      
      inline def setDynamic(value: (String, ReaderOptions) => T): Self = StObject.set(x, "dynamic", js.Any.fromFunction2(value))
      
      inline def setStatic(value: (js.Array[Pattern], ReaderOptions) => T): Self = StObject.set(x, "static", js.Any.fromFunction2(value))
      
      inline def set_fsStatSettings(value: Settings): Self = StObject.set(x, "_fsStatSettings", value.asInstanceOf[js.Any])
      
      inline def set_getFullEntryPath(value: String => String): Self = StObject.set(x, "_getFullEntryPath", js.Any.fromFunction1(value))
      
      inline def set_isFatalError(value: ErrnoException => Boolean): Self = StObject.set(x, "_isFatalError", js.Any.fromFunction1(value))
      
      inline def set_makeEntry(value: (Stats, Pattern) => Entry): Self = StObject.set(x, "_makeEntry", js.Any.fromFunction2(value))
      
      inline def set_settings(value: typings.fastGlob.outSettingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
