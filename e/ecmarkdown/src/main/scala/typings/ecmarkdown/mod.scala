package typings.ecmarkdown

import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.visitorMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkdown/dist/ecmarkdown", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var algorithm: js.Function1[/* str */ String, String] = js.native
  
  var emit: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Emitter.emit */ js.Any = js.native
  
  var fragment: js.Function1[/* str */ String, String] = js.native
  
  var parseAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parser.parseAlgorithm */ js.Any = js.native
  
  var parseFragment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Parser.parseFragment */ js.Any = js.native
  
  def visit(node: Node, observer: Observer): Unit = js.native
}
