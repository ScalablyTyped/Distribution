package typings.fastGlob

import typings.fastGlob.fastGlobBooleans.`true`
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Promise[js.Array[String]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(source: typings.fastGlob.typesMod.Pattern): js.Promise[js.Array[String]] = js.native
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  def apply(
    source: typings.fastGlob.typesMod.Pattern,
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = js.native
  
  @JSImport("fast-glob", "escapePath")
  @js.native
  def escapePath(source: typings.fastGlob.typesMod.Pattern): typings.fastGlob.typesMod.Pattern = js.native
  
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: typings.fastGlob.typesMod.Pattern): js.Array[Task] = js.native
  @JSImport("fast-glob", "generateTasks")
  @js.native
  def generateTasks(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): js.Array[Task] = js.native
  
  @JSImport("fast-glob", "isDynamicPattern")
  @js.native
  def isDynamicPattern(source: typings.fastGlob.typesMod.Pattern): Boolean = js.native
  @JSImport("fast-glob", "isDynamicPattern")
  @js.native
  def isDynamicPattern(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): Boolean = js.native
  
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: js.Array[typings.fastGlob.typesMod.Pattern]): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: typings.fastGlob.typesMod.Pattern): ReadableStream = js.native
  @JSImport("fast-glob", "stream")
  @js.native
  def stream(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): ReadableStream = js.native
  
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Array[String] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Array[typings.fastGlob.typesMod.Entry] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(source: typings.fastGlob.typesMod.Pattern): js.Array[String] = js.native
  @JSImport("fast-glob", "sync")
  @js.native
  def sync(
    source: typings.fastGlob.typesMod.Pattern,
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Array[typings.fastGlob.typesMod.Entry] = js.native
  
  type Entry = typings.fastGlob.typesMod.Entry
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true} */
  @js.native
  trait EntryObjectModePredicate extends EntryObjectPredicate {
    
    var objectMode: `true` = js.native
  }
  object EntryObjectModePredicate {
    
    @scala.inline
    def apply(objectMode: `true`): EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryObjectModePredicate]
    }
    
    @scala.inline
    implicit class EntryObjectModePredicateMutableBuilder[Self <: EntryObjectModePredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastGlob.mod.EntryObjectModePredicate
    - typings.fastGlob.mod.EntryStatsPredicate
  */
  trait EntryObjectPredicate extends StObject
  object EntryObjectPredicate {
    
    @scala.inline
    def EntryObjectModePredicate(objectMode: `true`): typings.fastGlob.mod.EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.mod.EntryObjectModePredicate]
    }
    
    @scala.inline
    def EntryStatsPredicate(stats: `true`): typings.fastGlob.mod.EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastGlob.mod.EntryStatsPredicate]
    }
  }
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true} */
  @js.native
  trait EntryStatsPredicate extends EntryObjectPredicate {
    
    var stats: `true` = js.native
  }
  object EntryStatsPredicate {
    
    @scala.inline
    def apply(stats: `true`): EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryStatsPredicate]
    }
    
    @scala.inline
    implicit class EntryStatsPredicateMutableBuilder[Self <: EntryStatsPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: `true`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type FileSystemAdapter = typings.fastGlob.typesMod.FileSystemAdapter
  
  type Options = typings.fastGlob.settingsMod.Options
  
  type Pattern = typings.fastGlob.typesMod.Pattern
  
  type Task = typings.fastGlob.tasksMod.Task
}
