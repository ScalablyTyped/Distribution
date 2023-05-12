package typings.embroiderMacros.anon

import org.scalablytyped.runtime.Instantiable2
import typings.babelCore.mod.NodePath
import typings.babelTraverse.anon.Container
import typings.babelTraverse.mod.Hub
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNodePath
  extends StObject
     with Instantiable2[/* hub */ Hub, /* parent */ Node, NodePath[js.Object]] {
  
  def get[C /* <: Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typings.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = js.native
}
