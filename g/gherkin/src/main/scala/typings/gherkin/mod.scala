package typings.gherkin

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.dialectMod.Dialect
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def dialects(): StringDictionary[Dialect] = js.native
    @JSName("dialects")
    var dialects_Original: js.Function0[StringDictionary[Dialect]] = js.native
    
    def fromPaths(paths: js.Array[String]): Readable = js.native
    def fromPaths(paths: js.Array[String], options: IGherkinOptions): Readable = js.native
    @JSName("fromPaths")
    var fromPaths_Original: js.Function2[/* paths */ js.Array[String], /* options */ js.UndefOr[IGherkinOptions], Readable] = js.native
    
    def fromSources(envelopes: js.Array[IEnvelope]): Readable = js.native
    def fromSources(envelopes: js.Array[IEnvelope], options: IGherkinOptions): Readable = js.native
    @JSName("fromSources")
    var fromSources_Original: js.Function2[
        /* envelopes */ js.Array[IEnvelope], 
        /* options */ js.UndefOr[IGherkinOptions], 
        Readable
      ] = js.native
    
    def fromStream(stream: Readable): typings.gherkin.parserMessageStreamMod.default = js.native
    def fromStream(stream: Readable, options: IGherkinOptions): typings.gherkin.parserMessageStreamMod.default = js.native
    @JSName("fromStream")
    var fromStream_Original: js.Function2[
        /* stream */ Readable, 
        /* options */ js.UndefOr[IGherkinOptions], 
        typings.gherkin.parserMessageStreamMod.default
      ] = js.native
  }
}
