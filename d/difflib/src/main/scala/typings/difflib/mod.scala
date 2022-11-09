package typings.difflib

import typings.difflib.anon.Fromfile
import typings.difflib.difflibInts.`1`
import typings.difflib.difflibInts.`2`
import typings.difflib.difflibStrings.delete
import typings.difflib.difflibStrings.equal
import typings.difflib.difflibStrings.insert
import typings.difflib.difflibStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("difflib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("difflib", "Differ")
  @js.native
  open class Differ () extends StObject {
    def this(linejunk: js.Function1[/* s */ String, Boolean]) = this()
    def this(linejunk: js.Function1[/* s */ String, Boolean], charjunk: js.Function1[/* s */ String, Boolean]) = this()
    def this(linejunk: Unit, charjunk: js.Function1[/* s */ String, Boolean]) = this()
    
    def compare(a: js.Array[String], b: js.Array[String]): js.Array[String] = js.native
  }
  
  @JSImport("difflib", "SequenceMatcher")
  @js.native
  open class SequenceMatcher[T] protected () extends StObject {
    def this(isjunk: js.Function0[Boolean], left: T, right: T) = this()
    def this(isjunk: Null, left: T, right: T) = this()
    def this(isjunk: js.Function0[Boolean], left: T, right: T, autojunk: Boolean) = this()
    def this(isjunk: Null, left: T, right: T, autojunk: Boolean) = this()
    
    def getOpcodes(): js.Array[js.Tuple5[replace | delete | insert | equal, Double, Double, Double, Double]] = js.native
  }
  
  inline def contextDiff(from: js.Array[String], to: js.Array[String], args: Fromfile): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("contextDiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getCloseMatches(word: String, possibilities: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloseMatches")(word.asInstanceOf[js.Any], possibilities.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getCloseMatches(word: String, possibilities: js.Array[String], n: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloseMatches")(word.asInstanceOf[js.Any], possibilities.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getCloseMatches(word: String, possibilities: js.Array[String], n: Double, cutoff: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloseMatches")(word.asInstanceOf[js.Any], possibilities.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cutoff.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getCloseMatches(word: String, possibilities: js.Array[String], n: Unit, cutoff: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloseMatches")(word.asInstanceOf[js.Any], possibilities.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cutoff.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def ndiff(from: js.Array[String], to: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ndiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def ndiff(from: js.Array[String], to: js.Array[String], linejunk: js.Function1[/* s */ String, Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ndiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], linejunk.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def ndiff(
    from: js.Array[String],
    to: js.Array[String],
    linejunk: js.Function1[/* s */ String, Boolean],
    charjunk: js.Function1[/* s */ String, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ndiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], linejunk.asInstanceOf[js.Any], charjunk.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def ndiff(
    from: js.Array[String],
    to: js.Array[String],
    linejunk: Unit,
    charjunk: js.Function1[/* s */ String, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ndiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], linejunk.asInstanceOf[js.Any], charjunk.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def restore(delta: js.Array[String], which: `1` | `2`): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(delta.asInstanceOf[js.Any], which.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unifiedDiff(from: js.Array[String], to: js.Array[String], args: Fromfile): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unifiedDiff")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
