package typings.fastGlob

import typings.fastGlob.fastGlobBooleans.`true`
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: typings.fastGlob.settingsMod.Options & EntryObjectPredicate
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.fastGlob.typesMod.Entry]]]
  inline def apply(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(source: typings.fastGlob.typesMod.Pattern): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(
    source: typings.fastGlob.typesMod.Pattern,
    options: typings.fastGlob.settingsMod.Options & EntryObjectPredicate
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.fastGlob.typesMod.Entry]]]
  inline def apply(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("fast-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapePath(source: typings.fastGlob.typesMod.Pattern): typings.fastGlob.typesMod.Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePath")(source.asInstanceOf[js.Any]).asInstanceOf[typings.fastGlob.typesMod.Pattern]
  
  inline def generateTasks(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Array[Task] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTasks")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[Task]]
  inline def generateTasks(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): js.Array[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTasks")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Task]]
  inline def generateTasks(source: typings.fastGlob.typesMod.Pattern): js.Array[Task] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTasks")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[Task]]
  inline def generateTasks(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): js.Array[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTasks")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Task]]
  
  inline def isDynamicPattern(source: typings.fastGlob.typesMod.Pattern): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDynamicPattern(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDynamicPattern")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stream(source: js.Array[typings.fastGlob.typesMod.Pattern]): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def stream(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  inline def stream(source: typings.fastGlob.typesMod.Pattern): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def stream(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  inline def sync(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: typings.fastGlob.settingsMod.Options & EntryObjectPredicate
  ): js.Array[typings.fastGlob.typesMod.Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.fastGlob.typesMod.Entry]]
  inline def sync(source: js.Array[typings.fastGlob.typesMod.Pattern], options: typings.fastGlob.settingsMod.Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def sync(source: typings.fastGlob.typesMod.Pattern): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def sync(
    source: typings.fastGlob.typesMod.Pattern,
    options: typings.fastGlob.settingsMod.Options & EntryObjectPredicate
  ): js.Array[typings.fastGlob.typesMod.Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.fastGlob.typesMod.Entry]]
  inline def sync(source: typings.fastGlob.typesMod.Pattern, options: typings.fastGlob.settingsMod.Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type Entry = typings.fastGlob.typesMod.Entry
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true} */
  trait EntryObjectModePredicate
    extends StObject
       with EntryObjectPredicate {
    
    var objectMode: `true`
  }
  object EntryObjectModePredicate {
    
    inline def apply(): EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = true)
      __obj.asInstanceOf[EntryObjectModePredicate]
    }
    
    extension [Self <: EntryObjectModePredicate](x: Self) {
      
      inline def setObjectMode(value: `true`): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastGlob.mod.EntryObjectModePredicate
    - typings.fastGlob.mod.EntryStatsPredicate
  */
  trait EntryObjectPredicate extends StObject
  object EntryObjectPredicate {
    
    inline def EntryObjectModePredicate(): typings.fastGlob.mod.EntryObjectModePredicate = {
      val __obj = js.Dynamic.literal(objectMode = true)
      __obj.asInstanceOf[typings.fastGlob.mod.EntryObjectModePredicate]
    }
    
    inline def EntryStatsPredicate(): typings.fastGlob.mod.EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = true)
      __obj.asInstanceOf[typings.fastGlob.mod.EntryStatsPredicate]
    }
  }
  
  /* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true} */
  trait EntryStatsPredicate
    extends StObject
       with EntryObjectPredicate {
    
    var stats: `true`
  }
  object EntryStatsPredicate {
    
    inline def apply(): EntryStatsPredicate = {
      val __obj = js.Dynamic.literal(stats = true)
      __obj.asInstanceOf[EntryStatsPredicate]
    }
    
    extension [Self <: EntryStatsPredicate](x: Self) {
      
      inline def setStats(value: `true`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  type FileSystemAdapter = typings.fastGlob.typesMod.FileSystemAdapter
  
  type Options = typings.fastGlob.settingsMod.Options
  
  type Pattern = typings.fastGlob.typesMod.Pattern
  
  type Task = typings.fastGlob.tasksMod.Task
}
