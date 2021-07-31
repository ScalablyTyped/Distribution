package typings.fastGlob

import typings.fastGlob.typesMod.Entry
import typings.fastGlob.typesMod.ErrnoException
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.ReaderOptions
import typings.node.fsMod.Stats
import typings.nodelibFsStat.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("fast-glob/out/readers/reader", JSImport.Default)
  @js.native
  abstract class default[T] protected ()
    extends StObject
       with Reader[T] {
    def this(_settings: typings.fastGlob.settingsMod.default) = this()
    
    /* CompleteClass */
    override val _fsStatSettings: Settings = js.native
    
    /* CompleteClass */
    /* protected */ override def _getFullEntryPath(filepath: String): String = js.native
    
    /* CompleteClass */
    /* protected */ override def _isFatalError(error: ErrnoException): Boolean = js.native
    
    /* CompleteClass */
    /* protected */ override def _makeEntry(stats: Stats, pattern: Pattern): Entry = js.native
    
    /* CompleteClass */
    override val _settings: typings.fastGlob.settingsMod.default = js.native
    
    /* CompleteClass */
    override def dynamic(root: String, options: ReaderOptions): T = js.native
    
    /* CompleteClass */
    override def static(patterns: js.Array[Pattern], options: ReaderOptions): T = js.native
  }
  
  trait Reader[T] extends StObject {
    
    val _fsStatSettings: Settings
    
    /* protected */ def _getFullEntryPath(filepath: String): String
    
    /* protected */ def _isFatalError(error: ErrnoException): Boolean
    
    /* protected */ def _makeEntry(stats: Stats, pattern: Pattern): Entry
    
    val _settings: typings.fastGlob.settingsMod.default
    
    def dynamic(root: String, options: ReaderOptions): T
    
    def static(patterns: js.Array[Pattern], options: ReaderOptions): T
  }
  object Reader {
    
    @scala.inline
    def apply[T](
      _fsStatSettings: Settings,
      _getFullEntryPath: String => String,
      _isFatalError: ErrnoException => Boolean,
      _makeEntry: (Stats, Pattern) => Entry,
      _settings: typings.fastGlob.settingsMod.default,
      dynamic: (String, ReaderOptions) => T,
      static: (js.Array[Pattern], ReaderOptions) => T
    ): Reader[T] = {
      val __obj = js.Dynamic.literal(_fsStatSettings = _fsStatSettings.asInstanceOf[js.Any], _getFullEntryPath = js.Any.fromFunction1(_getFullEntryPath), _isFatalError = js.Any.fromFunction1(_isFatalError), _makeEntry = js.Any.fromFunction2(_makeEntry), _settings = _settings.asInstanceOf[js.Any], dynamic = js.Any.fromFunction2(dynamic), static = js.Any.fromFunction2(static))
      __obj.asInstanceOf[Reader[T]]
    }
    
    @scala.inline
    implicit class ReaderMutableBuilder[Self <: Reader[?], T] (val x: Self & Reader[T]) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: (String, ReaderOptions) => T): Self = StObject.set(x, "dynamic", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStatic(value: (js.Array[Pattern], ReaderOptions) => T): Self = StObject.set(x, "static", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_fsStatSettings(value: Settings): Self = StObject.set(x, "_fsStatSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getFullEntryPath(value: String => String): Self = StObject.set(x, "_getFullEntryPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_isFatalError(value: ErrnoException => Boolean): Self = StObject.set(x, "_isFatalError", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_makeEntry(value: (Stats, Pattern) => Entry): Self = StObject.set(x, "_makeEntry", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_settings(value: typings.fastGlob.settingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
