package typings.filelist

import typings.filelist.filelistInts.`1`
import typings.filelist.mod.IncludeOptions
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined filelist.filelist.FileList */
  @js.native
  trait FileList extends StObject {
    
    def at(index: Double): js.UndefOr[String] = js.native
    @JSName("at")
    var at_Original: js.Function1[/* index */ Double, js.UndefOr[String]] = js.native
    
    def clearExclusions(): this.type = js.native
    
    def clearInclusions(): this.type = js.native
    
    def concat(items: js.Array[String]*): js.Array[String] = js.native
    @JSName("concat")
    var concat_Original: js.Function1[/* repeated */ js.Array[String], js.Array[String]] = js.native
    
    def copyWithin(target: Double, start: Double): this.type = js.native
    @JSName("copyWithin")
    var copyWithin_Original: js.Function2[/* target */ Double, /* start */ Double, this.type] = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    @JSName("entries")
    var entries_Original: js.Function0[IterableIterator[js.Tuple2[Double, String]]] = js.native
    
    def every[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    var every_Original: js.Function1[
        /* predicate */ js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is string */ Boolean
        ], 
        /* is std.Array<string> */ Boolean
      ] = js.native
    
    def exclude(items: String*): this.type = js.native
    
    var excludes: Funcs = js.native
    
    def fill(value: String): this.type = js.native
    @JSName("fill")
    var fill_Original: js.Function1[/* value */ String, this.type] = js.native
    
    def filter[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    var filter_Original: js.Function1[
        /* predicate */ js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is string */ Boolean
        ], 
        js.Array[String]
      ] = js.native
    
    def find[S /* <: String */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): Double = js.native
    @JSName("findIndex")
    var findIndex_Original: js.Function1[
        /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any], 
        Double
      ] = js.native
    
    @JSName("find")
    var find_Original: js.Function1[
        /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* obj */ js.Array[String], 
          /* is string */ Boolean
        ], 
        js.UndefOr[String]
      ] = js.native
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    @JSName("flatMap")
    var flatMap_Original: js.Function1[
        /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          Any | js.Array[Any]
        ], 
        js.Array[Any]
      ] = js.native
    
    @JSName("flat")
    var flat_Original: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, `1`]]] = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    @JSName("forEach")
    var forEach_Original: js.Function1[
        /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit], 
        Unit
      ] = js.native
    
    def include(items: (IncludeOptions | String)*): this.type = js.native
    
    def includes(searchElement: String): Boolean = js.native
    @JSName("includes")
    var includes_Original: js.Function1[/* searchElement */ String, Boolean] = js.native
    
    def indexOf(searchElement: String): Double = js.native
    @JSName("indexOf")
    var indexOf_Original: js.Function1[/* searchElement */ String, Double] = js.native
    
    var items: js.Array[String] = js.native
    
    def join(): String = js.native
    @JSName("join")
    var join_Original: js.Function0[String] = js.native
    
    def keys(): IterableIterator[Double] = js.native
    @JSName("keys")
    var keys_Original: js.Function0[IterableIterator[Double]] = js.native
    
    def lastIndexOf(searchElement: String): Double = js.native
    @JSName("lastIndexOf")
    var lastIndexOf_Original: js.Function1[/* searchElement */ String, Double] = js.native
    
    def length(): Double = js.native
    
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    @JSName("map")
    var map_Original: js.Function1[
        /* callbackfn */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
        js.Array[Any]
      ] = js.native
    
    var pending: Boolean = js.native
    
    var pendingAdd: js.Array[String] = js.native
    
    def pop(): js.UndefOr[String] = js.native
    @JSName("pop")
    var pop_Original: js.Function0[js.UndefOr[String]] = js.native
    
    def push(items: String*): Double = js.native
    @JSName("push")
    var push_Original: js.Function1[/* repeated */ String, Double] = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    @JSName("reduceRight")
    var reduceRight_Original: js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ], 
        String
      ] = js.native
    
    @JSName("reduce")
    var reduce_Original: js.Function1[
        /* callbackfn */ js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ], 
        String
      ] = js.native
    
    def resolve(): this.type = js.native
    
    def reverse(): js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: js.Function0[js.Array[String]] = js.native
    
    def shift(): js.UndefOr[String] = js.native
    @JSName("shift")
    var shift_Original: js.Function0[js.UndefOr[String]] = js.native
    
    def shouldExclude(item: String): Boolean = js.native
    
    def slice(): js.Array[String] = js.native
    @JSName("slice")
    var slice_Original: js.Function0[js.Array[String]] = js.native
    
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean = js.native
    @JSName("some")
    var some_Original: js.Function1[
        /* predicate */ js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any], 
        Boolean
      ] = js.native
    
    def sort(): this.type = js.native
    @JSName("sort")
    var sort_Original: js.Function0[this.type] = js.native
    
    def splice(start: Double): js.Array[String] = js.native
    @JSName("splice")
    var splice_Original: js.Function1[/* start */ Double, js.Array[String]] = js.native
    
    def toArray(): js.Array[String] = js.native
    
    @JSName("toLocaleString")
    var toLocaleString_Original: js.Function0[String] = js.native
    
    @JSName("toString")
    var toString_Original: js.Function0[String] = js.native
    
    def unshift(items: String*): Double = js.native
    @JSName("unshift")
    var unshift_Original: js.Function1[/* repeated */ String, Double] = js.native
    
    def values(): IterableIterator[String] = js.native
    @JSName("values")
    var values_Original: js.Function0[IterableIterator[String]] = js.native
  }
  
  trait Funcs extends StObject {
    
    var funcs: js.Array[js.Function]
    
    var pats: js.Array[js.RegExp]
    
    var regex: Null | js.RegExp
  }
  object Funcs {
    
    inline def apply(funcs: js.Array[js.Function], pats: js.Array[js.RegExp]): Funcs = {
      val __obj = js.Dynamic.literal(funcs = funcs.asInstanceOf[js.Any], pats = pats.asInstanceOf[js.Any], regex = null)
      __obj.asInstanceOf[Funcs]
    }
    
    extension [Self <: Funcs](x: Self) {
      
      inline def setFuncs(value: js.Array[js.Function]): Self = StObject.set(x, "funcs", value.asInstanceOf[js.Any])
      
      inline def setFuncsVarargs(value: js.Function*): Self = StObject.set(x, "funcs", js.Array(value*))
      
      inline def setPats(value: js.Array[js.RegExp]): Self = StObject.set(x, "pats", value.asInstanceOf[js.Any])
      
      inline def setPatsVarargs(value: js.RegExp*): Self = StObject.set(x, "pats", js.Array(value*))
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexNull: Self = StObject.set(x, "regex", null)
    }
  }
}
