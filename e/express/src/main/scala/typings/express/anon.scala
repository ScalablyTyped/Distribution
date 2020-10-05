package typings.express

import org.scalablytyped.runtime.StringDictionary
import typings.mime.mod.TypeMap
import typings.qs.anon.IParseOptionsdecodernever
import typings.qs.mod.IParseOptions
import typings.qs.mod.ParsedQs
import typings.qs.mod.PoorMansUnknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(str: String): ParsedQs = js.native
    def apply(str: String, options: IParseOptionsdecodernever): ParsedQs = js.native
    def apply(str: String, options: IParseOptions): StringDictionary[PoorMansUnknown] = js.native
  }
  
  @js.native
  trait Typeofm extends js.Object {
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    def getExtension(mime: String): String | Null = js.native
    def getType(path: String): String | Null = js.native
  }
  
}

