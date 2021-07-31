package typings.ecmarkdown

import typings.ecmarkdown.nodeTypesMod.Node
import typings.ecmarkdown.visitorMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecmarkdown/dist/ecmarkdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "algorithm")
  @js.native
  def algorithm: js.Function1[/* str */ String, String] = js.native
  @scala.inline
  def algorithm_=(x: js.Function1[/* str */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "emit")
  @js.native
  def emit: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Emitter.emit */ js.Any = js.native
  @scala.inline
  def emit_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Emitter.emit */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emit")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "fragment")
  @js.native
  def fragment: js.Function1[/* str */ String, String] = js.native
  @scala.inline
  def fragment_=(x: js.Function1[/* str */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fragment")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "parseAlgorithm")
  @js.native
  def parseAlgorithm: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseAlgorithm */ js.Any = js.native
  @scala.inline
  def parseAlgorithm_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseAlgorithm */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseAlgorithm")(x.asInstanceOf[js.Any])
  
  @JSImport("ecmarkdown/dist/ecmarkdown", "parseFragment")
  @js.native
  def parseFragment: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseFragment */ js.Any = js.native
  @scala.inline
  def parseFragment_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Parser.parseFragment */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseFragment")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def visit(node: Node, observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
