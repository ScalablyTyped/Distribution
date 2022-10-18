package typings.ecmarkdown

import typings.ecmarkdown.distNodeTypesMod.Node
import typings.ecmarkdown.distVisitorMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEcmarkdownMod {
  
  @JSImport("ecmarkdown/dist/ecmarkdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "algorithm")
  @js.native
  def algorithm: js.Function1[/* str */ String, String] = js.native
  inline def algorithm_=(x: js.Function1[/* str */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "emit")
  @js.native
  def emit: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Emitter.emit */ Any = js.native
  inline def emit_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Emitter.emit */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emit")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "fragment")
  @js.native
  def fragment: js.Function1[/* str */ String, String] = js.native
  inline def fragment_=(x: js.Function1[/* str */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragment")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "parseAlgorithm")
  @js.native
  def parseAlgorithm: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseAlgorithm */ Any = js.native
  inline def parseAlgorithm_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseAlgorithm */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseAlgorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "parseFragment")
  @js.native
  def parseFragment: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseFragment */ Any = js.native
  inline def parseFragment_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseFragment */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseFragment")(x.asInstanceOf[js.Any])
  
  inline def visit(node: js.Array[Node], observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visit(node: Node, observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
